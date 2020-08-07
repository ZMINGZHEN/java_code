package socket;

import java.util.Arrays;

/**
 * 测试从数组中删除指定元素的逻辑
 */
public class Test {
    public static void main(String[] args) {
        int[] allOut = {7,8,9,4,5,6,876,1,2,3,0};

        int pw = 876;
        System.out.println(Arrays.toString(allOut));
        //编写代码，将pw的值从数组中删除
        /*
            删除思路
            找到要删除元素的位置，将数组最后一位的元素放到该位置
            然后对数组进行缩容
         */
        for(int i=0;i<allOut.length;i++){
            if(allOut[i] == pw){
                allOut[i] = allOut[allOut.length - 1 ];
                allOut = Arrays.copyOf(allOut,allOut.length - 1);
                break;
            }
        }
        System.out.println(Arrays.toString(allOut));
    }
}
