package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;
/**
 * 集合的排序
 * 集合的工具类：java.util.Collection提供了很多便于操作集合的
 * 方法，其中有一个静态方法sort可以对集合进行自然排序
 *
 * 常见问题：
 * 分别说明Collection和Collections
 * Collection:是所有集合的顶级接口，规定了所有集合都具有的功能
 * Collections:集合的工具类，里面有很多静态方法便于我们操作集合
 */
public class SortListDemo1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(random.nextInt(100));
        }
        System.out.println("随机数集合:"+list);
        Collections.sort(list);
        System.out.println("被排序后的集合:"+list);

        /*
            反向排列
            Collections.sort(list,(o1,o2)->o2-o1);
            使用了lambda表达式
         */
        /*
            JDK8之后，List方法自身提供了sort方法，也可以根据给定的比较器
            完成对元素的比较进行排序
            对于一个线程安全的集合而言，这个sort方法排序时是可以和该集合的
            其他操作之间互斥的
         */
        list.sort(((o1, o2) -> o2 - o1));
        System.out.println("从大到小："+list);
    }
}
