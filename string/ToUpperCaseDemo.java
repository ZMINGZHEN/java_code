package string;
/**
 * String toUpperCase():将当前字符串英文转换为全大写
 * String toLowerCase():将当前字符串英文转换为全小写
 * @author Xiloer
 *
 */
public class ToUpperCaseDemo {
	public static void main(String[] args) {
		String str = "我爱Java";
		String lower = str.toLowerCase();
		System.out.println(lower);
		
		String upper = str.toUpperCase();
		System.out.println(upper);
		
		//验证码比对
		String code = "A4d2";		
		String input = "a4d2";		
		String s1 = code.toUpperCase();
		String s2 = input.toUpperCase();
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		/*
		 * 注意!比较两个字符串内容时要用字符串的equals
		 * 方法进行!不能用"=="比较，因为不一定成立!
		 */
		if(s1.equals(s2)) {
			System.out.println("验证通过!");
		}else {
			System.out.println("验证失败!");
		}
	}
}







