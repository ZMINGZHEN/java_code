package collection;

import java.util.*;

/**
 * 排序自定义类型元素
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1,2));
        list.add(new Point(78,68));
        list.add(new Point(8,9));
        list.add(new Point(8,5));
        System.out.println(list);
        /*
            Collections.sort(List list)这个方法要求集合元素必须实现
            接口：Comparable并重写其中要求的抽象方法compareTo，否则编译
            不通过。
            但是这里不建议这样做，因为会对我们的程序造成侵入性。
            侵入性：当我们使用某个API完成某个功能时，该API方法要求我们为其
            修改其他额外的代码，这就是侵入性。需改的地方越多，则侵入性越强。
            侵入性不利于程序的维护，应尽量降低或避免。
            compare 比较
            comparable 可比较的
         */

//        Collections.sort(list);  编译器报错，无法对list的类型直接进行比较
/*
        MyComparator c = new MyComparator();
        Collections.sort(list,new MyComparator());
        System.out.println(list);
        结合类MyComparator使用Collections.sort()方法

 */
        /*
        //也可以使用匿名内部类
        Comparator<Point> c = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {

                return o1.getX()*o1.getX()+o1.getY()*o1.getY()-
                        o2.getX()*o2.getX()-o2.getY()*o2.getY();
            }
        };
        Collections.sort(list,c);
        System.out.println(list);
        */

        /*
        //继续简化代码
        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.getX()*o1.getX()+o1.getY()*o1.getY()-
                        o2.getX()*o2.getX()-o2.getY()*o2.getY();
            }
        });
        System.out.println(list);

         */

        /*
        Collections重载的sort方法要求我们再传入一个参数：比较器，相当于
        临时传入一种比较的规则，这样sort方法内部会将集合中的两两元素使用
        传入的比较器中的compare方法进行比较。区分大小后按照从小到大的顺序
        进行排序。这个方法就不再要求集合元素必须实现Comparable接口了。
         */

        //使用lambda表达式直接定义比较规则
        Collections.sort(list,(o1, o2) ->
                o1.getX()*o1.getX()+o1.getY()*o1.getY()-
                o2.getX()*o2.getX()-o2.getY()*o2.getY()
        );
        System.out.println("比较后的list:"+list);
    }
}

//实现类
class MyComparator implements Comparator<Point>{

    /*
     * 定义o1与o2的大小关系
     * 返回值>0,表示o1>o2
     * 返回值<0,表示o1<o2
     * 返回值=0,表示o1==o2
     */
        public int compare(Point o1,Point o2){
            int len1 = o1.getX()*o1.getX() + o1.getY()*o1.getY();
            int len2 = o2.getX()*o2.getX() + o2.getY()*o2.getY();
            return len1 - len2;
        }
}