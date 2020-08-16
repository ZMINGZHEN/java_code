package string;
/**
 * int indexOf(String str)
 * 查找给定字符串在当前字符串中的位置，如果当前字符串不包含
 * 给定内容时返回值为:-1
 * @author Xiloer
 *
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";
		
		int index = str.indexOf("in");
		System.out.println(index);//2
		
		//重载的indexOf可以从指定位置开始查找
		index = str.indexOf("in", 3);
		System.out.println(index);//5
		
		//检索最后一次出现in的位置
		index = str.lastIndexOf("in");
		System.out.println(index);//9

	}
}





