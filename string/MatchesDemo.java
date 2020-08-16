package string;
/**
 * 正则表达式语法:
 * []:表示一个字符，内容只能是[]里面指定的内容，比如:
 * [abc]:表示该字符只能是a或b或c
 * [a-z]:表示任意一个小写字母
 * 
 * .:  .在正则表达式中表示任意一个字符
 * \d: 表示任意一个数字，等同于[0-9]
 * \w: 表示任意一个单词字符，数字字母下划线
 * \s: 表示任意一个空白字符
 * \D,\W,\S是非的关系。
 * 
 * 量词
 * ?:  表示前面的内容出现0-1次
 * +:  表示前面的内容出现1次以上
 * *:  表示前面的内容出现0-多次(任意次)
 * {n}:表示前面的内容出现n次
 * {n,m}:表示前面的内容出现最少n次最多m次
 * {n,}:表示前面的内容出现n次以上
 * 
 * (): 表示块，即：()里面的内容看成一个整体，可以用|指定
 *    多个块
 * 例如:
 * (abc): 表示一个abc
 * (abc|def):表示要么是abc要么是def
 * (abc){3}:表示连续出现3次abc,即:abcabcabc 
 * 
 * 
 * java字符串支持正则表达式操作的方法一:
 * boolean matches(String regex)
 * 用给定的正则表达式验证当前字符串是否匹配，匹配则返回true
 * @author Xiloer
 *
 */
public class MatchesDemo {
	public static void main(String[] args) {
		/*
		 * 验证email
		 * email的正则表达式:
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
		 */
		String email = "fan_cq@tedu.com.cn";
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		
		boolean match = email.matches(regex);
		if(match) {
			System.out.println("是邮箱!");
		}else {
			System.out.println("不是邮箱!");
		}
	}
}








