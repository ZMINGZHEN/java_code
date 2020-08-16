package io;

import java.io.*;

/**
 * 在流连接中使用PW
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        FileOutputStream fos
                = new FileOutputStream("pw2.txt");
        OutputStreamWriter osw
                = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw);

        pw.println("你好~");
        pw.println("再见!");
        System.out.println("写出完毕!");
        pw.close();
    }
}
