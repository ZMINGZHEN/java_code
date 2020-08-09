package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
/**
 * 集合转换为数组
 * Collection提供了一个方法：toArray，可以将
 * 集合转换为一个数组
 */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        System.out.println(c);
        Object[] array = c.toArray();
        /*
               toArray方法要求传入一个数组,，如果该数组可用
               即长度可以存下集合中所有元素，就可以直接使用该
               数组，将集合元素存入后将其返回
               否则会按照传入数组的类型创建一个心数组，且长度与
               集合size一致的数组并将元素存入后返回。
               是要求实实在在传入一个存在的数组，所以要new一块空间
               并且指定好长度
         */
        String[] array2 = c.toArray(new String[c.size()]);
        System.out.println("array:"+Arrays.toString(array));
        System.out.println("array2:"+Arrays.toString(array2));

    }
}
