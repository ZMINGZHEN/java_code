package io;

import java.io.*;

/**
 * 使用转换流读取文本数据
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        //将osw.txt文件中的文本数据读取回来
        FileInputStream fis
                = new FileInputStream("osw.txt");
        InputStreamReader isr
                = new InputStreamReader(fis,"UTF-8");
        /*
            int read()
            一次从文件中读取一个字符，返回值是int行，但是可以转换为
            char。但如果返回的int值为-1则表示文件末尾。
         */
        int d;
        while((d = isr.read())!=-1){
            System.out.print((char)d);
        }
        isr.close();
    }
}
