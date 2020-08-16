package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *  字符流的超类是:java.io.Reader和Writer
 *  字符流的最小读写单位是字符，但是底层本质还是读写字节，
 *  只不过字符与字节的转换过程字符流自行完成。
 *
 *  转换流:java.io.InputStreamReader和OutputStreamWriter
 *  转换流是字符流的一对实现类，是一对高级流。实际开发中我们通常
 *  不直接操作他们，但是在流连接中他们是非常重要的一环，作用是衔
 *  接字节流与其他高级的字符流。
 *
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        /*
            向文件中以UTF-8编码写入字符串
         */
        FileOutputStream fos
                = new FileOutputStream("osw.txt");
        /*
            转换流常用的构造方法:
            OutputStreamWriter(OutoutStream out,String csn)
            除了指定转换流连接在哪个字节流上之外，还支持第二个参数
            就是字符集，这样一来通过当前流写出的文本内容都会使用
            该字符集转换为字节后写出
         */
        OutputStreamWriter osw
                = new OutputStreamWriter(fos,"UTF-8");

        osw.write("还是很喜欢你，还是很喜欢你。");
        osw.write("像八月潮湿的海风，热烈的不能呼吸。");

        System.out.println("写出完毕!");

        osw.close();
    }
}














