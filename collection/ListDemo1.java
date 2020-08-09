package collection;
import java.util.List;
import java.util.ArrayList;
/**
 * java.util.List接口
 * List继承自Collection，这一类集合的特点是：可以存放重复元素
 * 并且有序。
 * 常用实现类：
 *  java.util.ArrayList:内部使用数组实现，查询性能更好
 *  java.util.LinkedList:内部使用链表实现，增删元素性能更好
 */
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println("list:"+list);
        /*
            E   get(int index)
            获取当前List集合指定下标对应的元素
         */
        String str = list.get(2);
        System.out.println(str);

        //通过循环下标可以遍历List集合
        for(int i=0;i<list.size();i++){
            str = list.get(i);
            System.out.println(str);
        }
        /*
            void add(int index, E e)
            在List集合指定位置插入一个元素
         */
        //实现[one,six,two,three,four,five]
        list.add(1,"six");
        System.out.println("index=1插入element=six"+list);
        /*
            E set(int index, E e)
            将给定元素设置到指定位置，返回值为原位置被替换的元素
         */
        String old = list.set(2,"2");
        System.out.println("被替换元素old："+old);
        System.out.println(list);
        /*
            E remove(int index)
            删除并返回指定位置上对应的元素
         */
        old = list.remove(4);
        System.out.println("被删除的元素是:"+old);
        System.out.println(list);
    }
}
