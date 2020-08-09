package collection;
import java.util.Queue;
import java.util.LinkedList;
/**
 * 队列：java.util.Queue接口，该接口继承自Collection
 * 队列可以保存一组元素，但是存取元素必须遵循先进先出
 * (FIFO:First input First output)
 * 常用实现类：java.util.LinkedList
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        /*
            offer入队操作，将元素添加到队列末尾
         */
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        System.out.println(queue);

        /*
            poll：出队操作，获取队列元素后该元素即从队列中被删除
         */
        String str = queue.poll();
        System.out.println(str);
        System.out.println(queue);

        /*
            peek：引用队首元素，获取后该元素仍然在队列中
         */
        str = queue.peek();
        System.out.println(str);
        System.out.println(queue);

        /*
            使用迭代器遍历队列元素并不影响队列元素的个数，
            遍历后每个元素仍然在队列中
         */
        for(String s : queue){
            System.out.println(s);
        }
        System.out.println(queue);
        //循环，将用poll方法，将每个元素获取出来
        while(!queue.isEmpty()){
            str = queue.poll();
            System.out.println(str);
        }
        System.out.println("得到一个空的队列:"+queue);
    }
}
