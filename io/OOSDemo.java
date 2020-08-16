package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * java.io.ObjectOutputStream和ObjectInputStream
 * 
 * 对象流是一对高级流，作用是进行对象的序列化和反序列化
 * 
 * 对象序列化:将一个java对象按照其结构和内容转换为一组字节
 * @author Xiloer
 *
 */
public class OOSDemo {
	public static void main(String[] args) throws IOException {
		String name = "苍老师";
		int age = 18;
		String gender = "女";
		String[] otherInfo = {"是一名演员","来自霓虹","没什么台词","促进中日文化交流","广大男性同胞的启蒙老师"};
		
		Person p = new Person(name, age, gender, otherInfo);
		System.out.println(p);
		//将该Person对象写入文件:person.obj
		
		FileOutputStream fos 
			= new FileOutputStream("person.obj");
		ObjectOutputStream oos
			= new ObjectOutputStream(fos);
		/*
		 *	对象输出流提供的方法:
		 *	void writeObject(Object obj)
		 *  将给定对象序列化
		 *  注:如果指定的对象没有实现序列化接口则会抛出异常:
		 *  java.io.NotSerializableException 
		 *  
		 *  
		 *  这里我们流连接用到了文件流和对象流。然后将
		 *  Person对象写入了文件。这里涉及两个操作
		 *  
		 *  1:将一个对象通过对象流写出时，对象输出流会
		 *    将该对象按照其结构转换为一组字节，这个
		 *    过程称为:对象序列化
		 *  2:序列化后的一组字节在经过文件流被写入了文件
		 *    中(磁盘上)做长久保存，这个过程称为:
		 *    数据持久化
		 */
		oos.writeObject(p);
		System.out.println("写出完毕!");
		
		oos.close();
	}
}









