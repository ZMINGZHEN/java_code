package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合操作
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("java");
        c1.add("c");
        c1.add("c++");
        System.out.println("c1:"+c1);
        Collection c2 = new ArrayList();
        c2.add("Android");
        c2.add("iOS");
        System.out.println("c2:"+c2);
        /*
            boolean addAll(Collecion c)
            将给定集合中的所有元素添加到当前集合中
         */
        c1.addAll(c2); //将集合c2中的元素添加到c1的末尾
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);
    }
}
