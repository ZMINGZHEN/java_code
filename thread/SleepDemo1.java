package thread;

import java.util.Scanner;

/**
 * static void sleep(long ms)
 * 线程提供了一个静态方法：sleep，用于将运行这个方法的线程阻塞
 * 指定的毫秒，当超时后该线程会自动回到RUNNABLE状态等待再次获取
 * 时间片并发运行
 */
public class SleepDemo1 {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        /*
            程序启动后，要求用户输入一个数字，然后每每秒钟开始递减
            到0时，输出：时间到
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int num = scanner.nextInt();
        for(;num>0;num--){
            System.out.println(num);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("时间到");
        System.out.println("程序结束了");
    }
}
