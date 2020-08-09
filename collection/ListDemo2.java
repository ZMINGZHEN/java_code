package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List subList(int start,int end)
 * 获取当前集合中指定范围内的子集。
 * 两个参数表示下标
 * 表示范围，含头不含尾
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);

        List<Integer> subList = list.subList(3,8);
        System.out.println("subList:"+subList);
        //将子集的每个元素扩大10倍
        for(int i=0;i<subList.size();i++){
            subList.set(i,subList.get(i)*10);
        }
        System.out.println("subList:"+subList);
        /*
            对子集元素的操作就是对原集合对应元素的操作
         */
        System.out.println("list:"+list);
        /*
            void clear()
            该方法将集合中的元素删除
         */
        //删除List集合中2-8位置上的元素
        list.subList(2,9).clear();
        System.out.println(list);
    }
}
