package thread;

import java.util.Date;

/**
 * 测试 Date并利用sleep完成每秒输出一次当前系统时间
 */
public class DateThread {
    public static void main(String[] args) {
        /*
        Date每一个实例表示一个时间点，默认创建表示当前
        系统时间
         */
        while(true){
            Date now = new Date();
            System.out.println(now);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}
