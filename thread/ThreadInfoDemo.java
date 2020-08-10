package thread;

/**
 * 可以获取线程相关信息的一系列方法
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        //获取当前线程的名字，在这main方法里即主线程
        Thread main = Thread.currentThread();
        //获取线程的名字
        String name = main.getName();
        System.out.println("main线程名字:"+name);
        //获取线程的ID，即唯一标识
        long id = main.getId();
        System.out.println("ID:"+id);
        //获取线程的优先级
        int priority = main.getPriority();
        System.out.println("优先级:"+priority);
        //判断线程是否活着
        boolean isAlive = main.isAlive();
        System.out.println("isAlive:"+isAlive);
        //判断线程是否为守护线程
        boolean isDaemon = main.isDaemon();
        System.out.println("isDaemon:"+isDaemon);
        //判断线程是否被中断了
        boolean isInterrupted = main.isInterrupted();
        System.out.println("isInterrupted:"+isInterrupted);
    }
}
