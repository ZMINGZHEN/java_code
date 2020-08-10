package thread;

/**
 * 使用匿名内部类方式完成两种线程的创建
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        //方式1：继承Thread从写run方法
        Thread t1 = new Thread(){
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println("你谁啊？");
                }
            }
        };
        //方式2：单独定义线程任务(实现Runnable接口)
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++) {
                    System.out.println("开门，查水表");
                }
            }
        };
        //实例化线程并指定任务
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
