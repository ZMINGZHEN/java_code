package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionReverse {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        for(int i=0;i<list.size()/2;i++){
            int d = list.get(i); //获取正数元素的位置
            //将正数元素设置到倒数位置上，并获取到被替换下来的元素
            d = list.set(list.size() -1 - i,d);
            list.set(i,d); //将倒数被替换下来的位置换到正数位置
        }
        System.out.println("reverse之后的list:"+list);
    }

}
