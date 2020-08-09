package collection;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 新循环 JDK5推出时推出的新特性
 * 新循环可以用相同的语法遍历数组或集合
 * 语法：
 * for(元素类型 元素变量 ： 集合或数组){
 *     循环体
 * }
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        for(int i=0;i<array.length;i++){
            String str = array[i];
            System.out.println(str);
        }

        /*
            新循环遍历数组会被编译器改为普通for循环遍历
         */
        for(String str : array){
            System.out.println(str);
        }
        /*
            泛型：JDK5之后推出的一个特性，也称为参数化类型，可以在使用
            某个类的时候指定该类中某个方法的参数类型或返回值类型，以及属性
            的类型。泛型在集合中广泛使用，用于在使用集合时指定集合中的
            元素类型。
         */
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        /*
        c.add(123);
        该语句编译不通过，因为传入的参数与集合指定的泛型类型不一致
         */
        System.out.println("============");
        /*
            新循环遍历集合会被编译器改为使用迭代器遍历，因此不要循环遍历
            的过程中使用集合的方法增删元素，否则会抛出异常。
         */

        for(String str : c){
            System.out.println(str);
        }
        /*
            迭代器也支持泛型，与其遍历的集合指定的泛型一致即可
         */
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
