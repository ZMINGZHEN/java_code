package thread;

/**
 * 线程的优先级：
 * 当线程调用start之后，便纳入到了线程调度器中统一操作。线程只能被动的
 * 被分配时间片与其他线程并发运行，不能主动索取时间片。
 *
 * 调度线程的优先级可以最大程度改善一个线程获取时间片的几率。
 * 原则上一个线程的优先级越高，获取时间片的次数越多
 *
 * 线程的优先级有10个等级,用数组1-10表示
 * 1是最低优先级,5为默认优先级,10为最高优先级
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread max = new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("max");
                }
            }
        };

        Thread norm = new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("norm");
                }
            }
        };

        Thread min = new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("min");
                }
            }
        };

        //设置线程的优先级,Thread有常量对应着最大最小和默认优先级
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);

        min.start();
        norm.start();
        max.start();
    }
}
