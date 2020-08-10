package thread;

/**
 * 第二种创建线程的方式：
 * 实现Runnable接口单独定义线程任务
 */
public class ThreadDemo2 {
    public static void main(String[] args) {


        //1.实例化线程任务
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable2();
        //实例化线程并指定任务
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}

class MyRunnable1 implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("你谁啊？");
        }
    }
}

class MyRunnable2 implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("开门！查水表");
        }
    }
}
