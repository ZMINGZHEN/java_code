package string;
/**
 * String substring(int start,int end)
 * 截取当前字符串中指定范围内的字符串，两个参数分别表示从
 * 哪里截取到哪里。
 * 注:在javaAPI中有一个小特点,通常用两个数字表示范围时，
 * 都是含头不含尾的。
 * @author Xiloer
 *
 */
public class SubstringDemo {
	public static void main(String[] args) {
		//            01234567890
		String str = "www.tedu.cn";
		
		String sub = str.substring(4,8);
		System.out.println(sub);
		
		//从指定位置一直截取到字符串末尾
		sub = str.substring(4);
		System.out.println(sub);
		
		
		sub = getHostName("http://www.tedu.cn");
		System.out.println(sub);//tedu
		
		sub = getHostName("www.baidu.com");
		System.out.println(sub);//baidu
		
		//注意这个后面有两个"."
		sub = getHostName("www.taobao.com.cn");
		System.out.println(sub);//taobao
	}
	/**
	 * 过去给定的网址中的域名
	 * @param url
	 * @return
	 */
	public static String getHostName(String url) {
		//截取的起始位置(第一个"."之后的第一个字符位置)
		int start = url.indexOf(".")+1;
		//截取的截止位置(第二个"."的位置)
		int end = url.indexOf(".",start);
		return url.substring(start,end);
	}
}




