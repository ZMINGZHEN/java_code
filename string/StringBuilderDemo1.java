package string;
/**
 * java.lang.StringBuilder
 * StringBuilder是专门设计为了解决字符串修改内容的API。
 * 里面提供了修改字符串的常用操作，比如:增，删，改，插等
 * StringBuilder内部维护一个可变的char数组，因此不会每次
 * 修改内容都创建新对象，所以效率高，开销小。
 * @author Xiloer
 *
 */
public class StringBuilderDemo1 {
	public static void main(String[] args) {
		//默认表示空字符串：""
//		StringBuilder builder = new StringBuilder();
		
		String str = "好好学习java";
		//也可以基于某个字符串创建
		StringBuilder builder = new StringBuilder(str);
		
		//StringBuffer是线程安全的，StringBuilder不是
//		StringBuffer builder = new StringBuffer(str);
		/*
		 * 好好学习java,为了找个好工作!
		 * append():将指定内容追加到字符串末尾
		 */
		builder.append(",为了找个好工作!");
		//通过toString方法获取修改后的字符串
		str = builder.toString();
		System.out.println(str);
		
		/*
		 * 好好学习java,为了找个好工作!
		 * 好好学习java,就是为了改变世界!
		 * 
		 * replace(int start,int end,String str)
		 * 将当前字符串中指定范围内的内容换成给定字符串
		 */
		builder.replace(9, 16, "就是为了改变世界");
		System.out.println(builder);
		
		/*
		 * 好好学习java,就是为了改变世界!
		 * ,就是为了改变世界!
		 * delete(int start,int end)
		 * 删除当前字符串中指定范围内的内容
		 */
		builder.delete(0, 8);
		System.out.println(builder);
		
		
		/*
		 * ,就是为了改变世界!
		 * 活着,就是为了改变世界!
		 * insert(int index,String str)
		 * 将给定的内容插入到指定位置
		 */
		builder.insert(0, "活着");
		System.out.println(builder);
		
		//反转字符串
		builder.reverse();
		System.out.println(builder);
	}
}








