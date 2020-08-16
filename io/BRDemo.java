package io;

import java.io.*;
import java.nio.Buffer;

/**
 * 缓冲字符输入流
 * java.io.BufferedReader
 * 特点:块读文本数据，加速。
 *      可以按行读取字符串
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream(
//                "./src/io/BRDemo.java"
//        );
//        InputStreamReader isr = new InputStreamReader(fis);
//        BufferedReader br = new BufferedReader(isr);

        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(
                                "./src/io/BRDemo.java")
                )
        );
        String line;
        /*
            String readLine()
            读取一行字符串(第一次调用时，缓冲流会读取若干字符并存入
            内部缓冲区，然后将缓冲区中表示的一行字符串返回)，返回值
            中不包含最后的换行符。如果返回值为null则表示流读取到了
            末尾。
         */
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}







