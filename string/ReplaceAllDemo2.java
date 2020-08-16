package string;
/**
 * 和谐用语
 * @author Xiloer
 *
 */
public class ReplaceAllDemo2 {
	public static void main(String[] args) {
		String regex = "(wqnmlgdsb|cnm|mdzz|nmsl|nc|djb)";
		String message = "wqnmlgdsb!你怎么这么nc,cnm!你就是一个djb!";
		message = message.replaceAll(regex, "***");
		System.out.println(message);
		
	}
}








