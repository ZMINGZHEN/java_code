package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 当集合元素已经实现了Comparable接口，但是该
 * 比较规则不能满足我们的排序时，
 * 我们也可以额外提供比较器进行排序
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("计算机组成原理");
        list.add("计算机网络");
        list.add("数据结构");
        list.add("一种操作系统的实现");
        System.out.println(list);

        //我们重新定义比较器，按照字数的多少进行排序
        Collections.sort(list,(o1, o2) -> o1.length()-o2.length());
        System.out.println("按照字数排序:"+list);
    }
}
