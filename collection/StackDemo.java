package collection;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 栈可以保存一组元素，但是存取元素必须遵循先进后出的原则
 * 通常实现诸如"后退"，"前进"这样功能时可以使用栈来完成
 *
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        System.out.println("stack:"+stack);

        System.out.println("出栈操作pop()");
        String str = stack.pop();
        System.out.println(str);
        System.out.println(stack);

        //遍历栈中元素
        for(String s : stack){
            System.out.println(s);
        }

        while(!stack.isEmpty()){
            str = stack.pop();
            System.out.println(str);
        }
        System.out.println("栈为空时:"+stack);
    }
}
