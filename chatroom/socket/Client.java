package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室的客户端
 */
public class Client {
    /*
            java.net.Socket 套接字
            Socket
            Socket封装了底层TCP协议的通讯，使用它可以和远端计算机
            建立连接，并通过输入流与输出流与对方交互数据
     */
    private Socket socket;
    /*
        构造方法，用于初始化客户端
     */
    public Client(){
        try{
            /*
            Socket常用构造器
            Socket(String host,int port)
            host是指定服务端的地址信息，通常是IP
            port是服务端打开的服务端口
            我们通过IP地址可以找到网络上的远端计算机，
            通过端口可以连接上该计算机上的服务端应用程序

            实例化Socket的过程就是与服务端建立连接的过程，如果服务端没有响应会抛出异常
             */
            System.out.println("正在连接服务器...");
            socket = new Socket("localhost",8090);
            System.out.println("已连接服务端！");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    /*
    客户端开始工作的方法
     */
    public void start(){
        try{

            //先启动一个线程，用于读取服务端发送过来的信息
            ServerHandler handler = new ServerHandler();
            Thread t = new Thread(handler);
            /*
                设置守护线程，这样，主线程这边当客户端输入内容为 exit 打算退出时，
                主线程结束后，当前线程会被进程杀掉
             */
            t.setDaemon(true);
            t.start();
            /*
                Socket提供的方法
                OutputStream getOutputStream
                获取的字节输出流，通过它写出的字节会发送给远端计算机
                对方可以通过socket获取的输入流读取到
             */
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out,"utf-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);


            Scanner scanner = new Scanner(System.in);
            while(true){
                String line = scanner.nextLine();
                if("exit".equals(line)){
                    break;
                }
                //将消息发送给服务端
                pw.println(line);
//                //读取服务端发送回来的消息
//                line = br.readLine();
//                System.out.println(line);
            }
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

    /**
     * 该线程负责循环读取服务端发送过来的信息
     */
    private class ServerHandler implements Runnable{
        public void run(){
            try{
                         /*
                通过Socket获取输入流，读取远端计算机发送过来的信息
             */

                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(),"utf-8"
                        )
                );
                String message;
                //读取服务端发送过来的每一句消息并输出到控制台
                while((message = br.readLine())!= null){
                    System.out.println(message);
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}



