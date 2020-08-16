package io;

import java.io.*;
import java.util.Scanner;

/**
 * 完成一个简易的记事本工具
 * 程序启动后要求用户输入一个文件命名。然后开始写内容
 * 用户在控制台输入的每一行字符串都按行写入文件
 * 当单独输入exit时程序退出
 *
 * 要求:使用流连接形式创建PrintWriter完成该工作。
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名:");
        String fileName = scanner.nextLine();
        FileOutputStream fos = new FileOutputStream(fileName);
        OutputStreamWriter osw
                = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        /*
            PrintWriter的构造方法中如果第一个参数是流，那么该构造方法
            就支持再传入一个boolean类型的参数，表示自动行刷新。如果
            该值为true就是打开自动行刷新功能。
            作用:每当我们调用println方法后会自动flush
            注:调用print方法是不会自动flush的!
         */
        PrintWriter pw = new PrintWriter(bw,true);
        System.out.println("请开始输入内容，单独输入exit退出.");
        while(true){
            String line = scanner.nextLine();
            /*
                boolean equalsIgnoreCase(String str)
                不区分大小写判断两个字符串内容是否相同
             */
            if("exit".equalsIgnoreCase(line)){
                break;
            }
            pw.println(line);
        }
        System.out.println("再见!");
        pw.close();
    }
}
