package collection;

import java.util.LinkedList;
import java.util.Deque;
/**
 * 双端队列：java.util.Deque接口
 * Deque继承自Queue，特点是队列两端都可以做出入队操作
 * 实现类:java.util.LinkedList
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offer("one");
        deque.offer("two");
        deque.offer("three");
        deque.offer("four");
        System.out.println("入队结束后的deque:"+deque);
        deque.offerFirst("five");
        System.out.println("队首插入five后的deque:"+deque);
        //出队列操作，队首
        System.out.println("出队列");
        String str = deque.poll();
        System.out.println(str);
        System.out.println(deque);
        System.out.println("尾端出队列");
        str = deque.pollLast();
        System.out.println(str);
        System.out.println(deque);
        System.out.println("poll操作等同于pollFirst");
        System.out.println("使用pollFirst进行出队列操作");
        str = deque.pollFirst();
        System.out.println(str);
        System.out.println(deque);
    }
}
