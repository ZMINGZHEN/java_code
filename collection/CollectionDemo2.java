package collection;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合中与元素equals相关的方法
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(1,2)); //重复元素，可以存入ArrayList
        /*
            输出集合时，集合会调用元素的toString方法作为元素内容显示
         */
        System.out.println(c);
        /*
            boolean contains(Object o)
            判断当前集合是否包含给定元素o
            该方法的判断依据是看当前集合是否有和o对象equals比较为
            true的元素，有则返回true
         */
        Point p = new Point(1,2);
        boolean contains = c.contains(p);
        System.out.println("是否包含:"+contains);
        /*
            remove方法删除元素时，也是删除与给定元素equals比较为true的
            元素，如果集合中有多个与给定元素equals比较为true的情况，则
            只删除一个。
         */
        System.out.println("删除前:"+c);
        c.remove(p);
        System.out.println("删除后:"+c);
        c.remove(p);
        System.out.println("再删除:"+c);
        c.remove(p);
        System.out.println("再删除(1,2)，等报错");
        System.out.println("然而不会报错");

    }
}
