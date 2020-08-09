package collection;
import java.util.List;
import java.util.ArrayList;

/**
 * JDK8之后集合提供了一种基于lambda表达式的遍历操作
 * foreach方法
 */
public class ForeachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        //使用迭代器
        for(String s: list){
            System.out.println(s);
        }

        //foreach方式
        list.forEach(
                (a)-> System.out.println(a)
        );
    }
}
