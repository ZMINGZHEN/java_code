package string;
/**
 * 由于字符串常量池的优化，导致字符串是不变对象，这意味着
 * 只要修改字符串内容就会创建新的字符串对象。
 * 因此得出一个结论:字符串对象本身不适合频繁修改内容，会
 * 导致大量系统开销和比较低的运行效率
 * @author Xiloer
 *
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String str = "a";
		for(int i=0;i<10000000;i++) {
			str = str + "a";
		}
		System.out.println("执行完毕!");
	}
}





