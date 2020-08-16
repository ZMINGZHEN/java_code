package string;
/**
 * 字符串是不变对象:字符串一旦创建，该对象内容不可改变，如
 * 果改变则会创建新对象
 * 
 * JVM的堆内存中专门有一段空间是用来缓存所有用字面量形式
 * 创建的字符串对象，它称为：字符串常量池。
 * 这样的好处是，如果程序执行过程中再次使用已经缓存的字面量
 * 形式创建过的字符串对象时会重用，避免在内存中出现大量内容
 * 一样的字符串对象来减少内存开销。
 * @author Xiloer
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "123abc";//字面量，直接量
		String s2 = "123abc";//s2重用s1对象
		
		//比较s1和s2保存的值(地址)是相等的
		System.out.println(s1==s2);//true
		
		String s3 = "123abc";//仍然重用s1对象
		System.out.println(s2==s3);//true
		
		//修改字符串内容会创建新对象
		s1 = s1 + "!";
		System.out.println("s1:"+s1);//123abc!
		System.out.println("s2:"+s2);//123abc
		System.out.println("s3:"+s3);//123abc
		
		//s1指向了新对象，因此地址已经与原来的s2不同了
		System.out.println(s1==s2);//false
		/*
		 * java编译器有一个特点:
		 * 当编译器在编译期间发现一个计算表达式可以确定
		 * 结果时，就会在编译期间进行计算，并将结果替换
		 * 原计算表达式避免每次程序运行时进行该计算。
		 * 因此，下面的代码"123"+"abc"的结果是确定的，
		 * 所以下面的代码编译成class后改为了
		 * String s4 = "123abc"
		 * 
		 * 诸如此类的比如，源代码中:
		 * int a = 1+2;
		 * 编译后的class文件中就变为:
		 * int a = 3;
		 */

		String s4 = "123"+"abc";
		System.out.println("s4:"+s4);
		System.out.println(s2==s4);//true
		
		String s = "123";
		String s5 = s + "abc";
		System.out.println("s5:"+s5);
		System.out.println(s2==s5);//false
	}
}






