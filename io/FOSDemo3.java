package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 将所有中文写入文件中
 * 
 * 中文在unicode中的范围用16进制是 4E00---9FA5
 * 注:2位16进制可以表示一个8位2进制，因此4位16进制可以
 * 表示2个字节
 * 
 * 一个char保存2字节，存的是字符的unicode编码。所以
 * 4E00-9FA5这个范畴中的内容就是中文部分
 * 
 * 2进制      10进制	16进制
 * 0000     0		0
 * 0001		1		1
 * 0010		2		2
 * 0011		3		3
 * 0100		4		4
 * 0101		5		5
 * 0110		6		6
 * 0111		7		7
 * 1000		8		8
 * 1001		9		9
 * 1010		10		A	
 * 1011		11		B
 * 1100		12		C
 * 1101		13		D
 * 1110		14		E
 * 1111		15		F	
 * 
 * 
 * 11011101  1byte 1字节
 * DD
 * 
 * unicode 中文
 * 01001110 00000000   ---  10011111 10100101
 * 4E         00               9F       A5
 * @author Xiloer
 *
 */
public class FOSDemo3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("fos3.txt");
		StringBuilder builder = new StringBuilder();
		 for (char i=0x4E00,d=1;i<=0x9FA5;i++,d++){
			 builder.append(i);
	         if(d%20==0){
	        	 builder.append("\n");
	         }
		}
		fos.write(builder.toString().getBytes("UTF-8"));
		System.out.println("写出完毕!");
		fos.close();
	}
}










