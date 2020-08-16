package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *  缓冲字符流
 *  java.io.BufferedWriter和BufferedReader
 *  缓冲字符流内部也有缓冲区，可以进行块读写文本数据加快读写效率。
 *  并且缓冲流可以按行读写文本数据。
 *
 *  java.io.PrintWriter
 *  具有自动行刷新功能的缓冲字符输出流，内部总是连接BufferedWriter
 */
public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        /*
            向文件pw.txt中按行写入字符串
            PrintWriter支持直接向文件写内容的构造方法:
            PrintWriter(File file)
            PrintWriter(String fileName)
            以上两种构造器还支持一个重载，就是再传入一个String类型的
            参数用来指定字符集。

         */
        PrintWriter pw
                = new PrintWriter("pw.txt","UTF-8");

        pw.println("一闪一闪亮晶晶,");
        pw.println("满天都是小星星.");

        System.out.println("写出完毕!");
        pw.close();
    }
}








