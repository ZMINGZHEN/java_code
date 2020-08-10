package thread;

/**
 * sleep方法要求我们处理中断异常：InterruptedException
 * 当一个线程调用sleep方法处于阻塞的过程中，如果该线程的
 * interrupt()方法被调用，那么就会中断这个阻塞状态，
 * sleep方法会抛出中断异常。
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread() {
            public void run() {
                System.out.println("林：睡觉啊！！！！！！！！");
                try {
                    Thread.sleep(10000000);
                } catch (InterruptedException e) {
                    System.out.println("林：干嘛呢！！！干嘛呢！！！！");
                }
                System.out.println("林：醒了");
            }
        };
        Thread haung = new Thread(){
            public void run(){
                System.out.println("黄：砸墙开始！");
                for(int i=0;i<5;i++){
                    System.out.println("黄:80!");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){

                    }
                }
                System.out.println("轰隆！");
                System.out.println("黄：搞定！");
                lin.interrupt(); //中断lin线程的睡眠阻塞
            }
        };
        haung.start();
        lin.start();
    }
}
