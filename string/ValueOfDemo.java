package string;
/**
 * String提供了一组重载的静态方法:
 * static String valueOf(XXX xxx)
 * 
 * 作用是将给定的内容转换为字符串类型
 * 常用于将基本类型转换为字符串
 * @author Xiloer
 *
 */
public class ValueOfDemo {
	public static void main(String[] args) {
		int d = 123;
		String s1 = String.valueOf(d);
		System.out.println("s1:"+s1);
		
		double dou = 123.123;
		String s2 = String.valueOf(dou);
		System.out.println("s2:"+s2);
		
		//任何内容与字符串连接，结果都是字符串
		String s3 = d + "";//相较于上面的方式，此种性能差
		System.out.println("s3:"+s3);
	}
}




