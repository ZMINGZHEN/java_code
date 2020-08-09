package collection;

import java.util.Collection;
import java.util.ArrayList;

/**
 * 集合
 * java.util.Collection 接口
 * Collection是所有集合顶级接口，规定了所有集合都应当具备的功能。
 * 集合与数组一样，用来保存一组元素，并且对元素的操作都封装成了方法，
 * 直接调用即可。
 * Collection下面有多种不同的数据结构可供使用。
 * Collection接口下面又划分为几种不同的集合，常见的子接口：
 * java.util.List：List又称为线性表，特点是可以保存重复元素，并且有序。
 * 常见的实现类：java.util.ArrayList和java.util.LinkedList
 *
 * java.util.Set：Set集合是不重复集合，里面不能放重复元素。
 * 常用实现类：java.util.HashSet
 * 元素是否重复取决于元素自身equals比较的结果
 *
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection e = new ArrayList();
        /*
        Collection e = new HashSet();
         */
        /*
            boolean add(E e)
            向当前集合中添加给定元素，如果元素成功添加到集合中则返回值为
            true，否则为false
            集合只能存放引用类型，对于基本类型而言，实际会触发自动装箱
            将基本类型转换为包装类后才能存入集合
         */
        e.add("one");
        e.add("two");
        System.out.println(e);

        /*
            int size()
            返回当前集合元素的个数
         */
        int size = e.size();
        System.out.println("size:"+size);

        /*
            boolean isEmpty()
            判断当前集合是否为空集，当集合size为0时，此方法返回值为true
         */
        boolean isEmpty = e.isEmpty();
        System.out.println("是否为空集合:"+isEmpty);
        /*
            void clear()
            清空集合
         */
        e.clear();
        System.out.println(e);
    }
}
