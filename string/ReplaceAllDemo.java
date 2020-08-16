package string;
/**
 * 字符串支持正则表达式的方法三
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定内容
 * @author Xiloer
 *
 */
public class ReplaceAllDemo {
	public static void main(String[] args) {
		String str = "abc123def456jhi";
		//将当前字符串中的数字部分换成#NUMBER#
		str = str.replaceAll("[0-9]+", "#NUMBER#");
		System.out.println(str);
	}
}




