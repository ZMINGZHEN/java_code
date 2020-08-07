package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 聊天室的服务端
 */
public class Server {
    /*
    java.net.ServerSocket
    运行在服务端的ServerSocket主要有两个作用
        1.向系统申请并打开服务端口，客户端就是通过这个端口与服务端建立连接的
        2.监听该端口，这样一旦一个客户端通过socket与服务端建立连接，就会立即
        返回一个Socket实例，通过它就可以与客户端交互了。
     */
    private ServerSocket server;

    /*
        该数组用于保存所有对应客户端的输出流，以便ClientHandler之间可以获取到
        对方的输出流做消息的广播工作
     */
//    private PrintWriter[] allOut = {};
    private List<PrintWriter> allOut = new ArrayList<>();
     /*
        服务端构造方法，用于初始化
     */
    public Server() {
        try {
            System.out.println("正在启动服务端");
            /*
                实例化ServerSocket的同时指定服务端口，如果该
                端口被其他程序占用时，这里会抛出异常：
                java.net.BindException:address already in use

                解决办法：更换端口，直到不与其他程序冲突
                实际情况，经常由于我们重复打开服务端导致
             */
            server = new ServerSocket(8090);
            System.out.println("服务端启动完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
        服务端开始工作的方法
     */
    public void start () {
            try {
            /*
            ServerSocket 一个很重要的方法：
            Socket accept()
            该方法是一个阻塞方法，调用后程序会卡主，此时开始等待
            客户端的连接，一旦一个客户端通过ServerSocket打开的端口
            建立连接，那么该方法会立即返回一个Socket实例，通过这个Socket
            就可以与刚连接的客户端交互了
             */
                while (true) {
                    System.out.println("等待客户端连接...");
                    Socket socket = server.accept();

                    //启动一个线程处理该客户端的交互
                    ClientHandler handler = new ClientHandler(socket);
                    Thread t = new Thread(handler);
                    t.start();


                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    }

    public static void main (String[]args){
            Server server = new Server();
            server.start();
    }

    /**
     * 该线程任务负责与指定的客户端进行交互
     */
    private class ClientHandler implements Runnable{
    private Socket socket;
    private String host; //客户端的IP地址

        public ClientHandler(Socket socket){
            this.socket = socket;
            //通过socket获取远端计算机地址信息
            host = socket.getInetAddress()
                    .getHostAddress();
            System.out.println(host + "客户端连接了");
        }

        public void run(){
            PrintWriter pw = null;
            try{
                /*
                通过Socket获取输入流，可以读取远端计算机发送过来的字节
                */
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader br = new BufferedReader(isr);

                /*
                    通过Socket获取输出流，可以将消息发送给远端计算机
                 */
                pw = new PrintWriter(
                        new BufferedWriter(
                                new OutputStreamWriter(
                                        socket.getOutputStream(),"utf-8"
                                )
                        ),true
                );
                /*
                将输出流存入到allOut数组中，以便其他ClientHandler可以通过遍历allOut数组将
                消息转发给所有客户端
                 */

                synchronized (allOut) {
//                    //1.对allOut数组进行扩容
//                    allOut = Arrays.copyOf(allOut, allOut.length + 1);
//                    //2.将pw存入数组最后一个位置
//                    allOut[allOut.length - 1] = pw;
                    allOut.add(pw);
                }
                System.out.println(host+"上线了，当前在线人数:"+ allOut.size());
                String message;
                System.out.println("运行到这了吗1");
            /*
                br.readLine()方法在这里用于服务端客户端发送过来的一行字符串。
                这个方法读取时可能发生异常。
                java.net.SocketException:connection reset
                这是由于客户端断开连接导致，无法完全避免。
             */
            message = br.readLine();
                System.out.println("运行到这了吗2");
                System.out.println(message);
                while ((message = br.readLine()) != null) {
                    System.out.println(host + "说" + message);
                    //转发给所有客户端

//                    synchronized (allOut) {
//                        for (int i = 0; i < allOut.length; i++) {
//                            allOut[i].println(host + "说:" + message);
//                        }
                        for(PrintWriter p:allOut){
                            p.println(host+"说:"+message);
                        }
                    }
//                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                //处理客户端断开连接后的操作
                //将当前客户端的输出流从allOut数组中删除
                System.out.println("执行到这里了");
                synchronized(allOut) {  //锁了两个，两个方法对数组的操作是互斥的
//                    for (int i = 0; i < allOut.length; i++) {
//                        if (allOut[i] == pw) {
//                            allOut[i] = allOut[allOut.length - 1];
//                            allOut = Arrays.copyOf(allOut, allOut.length - 1);
//                            break;
//                        }
//                    }
                    allOut.remove(pw);
                }
                System.out.println(host+"下线了，当前在线人数:"+allOut.size());
                try{
                    socket.close(); //与客户端断开连接，释放资源
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

