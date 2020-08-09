package collection;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * 数组转换为List集合
 * 数组的工具类Arrays提供了一个静态方法：asList可以将一个数组转换为一个
 * List集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        int[] array1 = {1,2,3,4,5};
        System.out.println("Array:"+ Arrays.toString(array));
        System.out.println("Array1:"+Arrays.toString(array1));

//        List<String> list = new List<>();
        List<String> list = new ArrayList<>();
        /*
            Arrays的一个静态方法asList将数组转换为集合
         */
        list = Arrays.asList(array);
        System.out.println("list:"+list);
//        list = array;  不能直接进行赋值操作
        /*
            通过对集合list中的元素进行操作，观察原数组中元素的变化
         */
        list.set(1,"2"); //将索引为1的集合中的元素替换为“2”，（返回被替换值可不表示）
        System.out.println("更换元素后的集合list:"+list);
        System.out.println("原数组的变化array:"+Arrays.toString(array));
        /*
            所以对数组转换的集合的元素进行操作，就是对原数组对应的元素进行操作
            注意是数组转换的集合
         */
        /*
        list.add("six");
        System.out.println(list);
        由于数组是定长的，因此会改变数组长度的操作都是不支持的
        会报错:UnsupportedOperationException
        */

        /*
        所有的集合都支持一个参数为Collection的构造器，作用是创建当前集合的同时
        包含给定集合中的所有元素
         */
        List<String> list2 = new ArrayList<>(list);
        /*
            List<String> list2 = new ArrayList<>(list);等同于
            list2.addAll(list);
         */
        System.out.println("list2"+list2);

        list2.add("six");
        System.out.println("list2:"+list2);
        list2.addAll(list); //继续将list集合添加到list2集合末尾
        System.out.println("list2:"+list2);
        list2.addAll(list);//可重复添加
        System.out.println("list"+list2);

    }
}
