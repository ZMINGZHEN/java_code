package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类测试对象流的对象读写操作
 * 
 * Serializable接口本身没有任何的抽象方法，这个接口我们
 * 也称它为签名接口，这个接口是编译器敏感的。
 * 当编译器编译一个实现了该接口的类时，会在编译后的class
 * 文件中添加一个方法目的是将当前类的实例按照其结构转换为
 * 一组字节。
 * 
 * @author Xiloer
 *
 */
public class Person implements Serializable{
	private String name;
	private int age;
	private String gender;
	private String[] otherInfo;
	
	public Person(String name, int age, String gender, String[] otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", otherInfo="
				+ Arrays.toString(otherInfo) + "]";
	}
	
	
}








