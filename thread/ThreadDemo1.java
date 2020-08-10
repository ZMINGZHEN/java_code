package thread;

/**
 * 多线程
 * 线程：一个顺序的执行流程就是一个线程
 * 多线程：多个顺序的执行流程"同时"运行
 *
 * 多线程是并发运行的，微观上是走走停停的，宏观感觉上是同时运行。
 * 所以多线程并非真正意义上的同时运行。
 *
 * 多线程可以解决代码之间存在的牵绊问题，当几个代码片段需要无障碍的一起运行
 * 时，就应当将它们分散到不同的线程上才可以”一起“运行。
 *
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();

        /*
            启动线程是调用线程的start方法，而不是调用run方法。
            当线程调用start方法后，便纳入到线程调度器中统一处理。
            当该线程第一次获取到CPU时间片时，其run方法会被自动调用。
         */
        t1.start();
        t2.start();

    }
}

/**
 * 第一种创建线程的方式：继承Thread并重写run方法
 * 注意:Thread类不是抽象类
 * 优点：结构简单，用匿名内部类形式创建方便
 *
 * 缺点：
 *  1.继承冲突，由于java是单继承的，实际开发中当需要继承某个
 *  类去复用方法但同时又需要并发时就存在了继承冲突。不能同时
 *  继承两个类(线程和需要复用方法的类)
 *  2.重写run方法定义线程任务，这导致了线程与任务有必然的耦合
 *  关系，不利于线程的重用。
 *
 */
class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("我是线程1");
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("来了啊，我线程2");
        }
    }
}
