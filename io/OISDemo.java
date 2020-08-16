package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输入流，进行对象的反序列化
 * @author Xiloer
 *
 */
public class OISDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis
			= new FileInputStream("person.obj");
		ObjectInputStream ois
			= new ObjectInputStream(fis);
		
		Person p = (Person)ois.readObject();
		System.out.println(p);
		
		ois.close();
	}
}





