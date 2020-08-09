package collection;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 集合提供了统一的遍历元素的方式：迭代器模式
 * Iterator iterator()
 * 该方法可以获取一个用于遍历当前集合元素的迭代器
 * java.util.Iterator 迭代器接口
 * 迭代器接口定义了遍历集合的相关方法，每个不同的集合都
 * 实现了一个用于遍历自身元素的迭代器实现类，我们无需记住
 * 名字，只要当它们是迭代器使用即可，迭代器遍历集合的方式
 * 遵循三步：问，取，删。
 * 其中删除元素不是我们遍历集合时的必要操作，多是一问一取。
 */
public class CollectionDemo5 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        System.out.println(c);

        //定义一个迭代器 it
        Iterator it = c.iterator();
        /*
            boolean hasNext()
            该方法判断集合是否还有下一个元素，第一次遍历之前则自动判断
            是否有一个元素。
            E next()
            该方法获取集合的下一个元素，同理，第一次调用则是自动获取的
            集合的第一个元素
         */
        while(it.hasNext()){
            /*
                String str = it.next();
                该语句报错原因，因为我们没有指定泛型，所以next()的返回
                值不是String的类型，因此要进行强制类型转换
            */
            String str = (String)it.next();
            //遍历过程中将“#”删除
            if("#".equals(str)){
                /*
                    c.remove(str);
                    有该语句会在程序执行过程中抛出异常：
                        java.util.ConcurrentModificationException
                    分析：迭代器遍历集合的过程中要求：不可以通过集合的方法
                    来增删元素，否则会抛出上述异常。
                    应使用迭代器提供的remove方法删除本次通过next获取到的
                    元素
                 */
                it.remove();
            }
            System.out.println(str);
        }
        System.out.println("c:"+c);
    }
}
