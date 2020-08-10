package thread;

/**
 * java中所有的代码都是线程运行的，main方法也不例外
 * 当java程序启动后，操作系统会创建一个进程来执行当前java程序。
 * 程序启动后，JVM会启动一个线程来运行main方法，而该线程的线程名
 * 称为"main"，我们叫它主线程。ying'yong
 *
 * 进程的概念：
 * 进程是操作系统这个级别同时运行的一个人物(每个运行的应用程序都是
 * 在一个进程上的)，每个进程都有自己独立的内存，并且进程之间不会
 * 互访对方的内存。
 * 线程从属于进程，没有独立的内存，从属于同一个进程的线程之间共享该
 * 进程的内存。
 * 系统切换进程开销大，速度慢，但是在一个进程中切换线程速度快开销小。
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        //获取运行main方法的线程，也就是主线程
        Thread main = Thread.currentThread();
        System.out.println("运行main方法的线程是:"+main);
        dosome();
        //dosome方法执行后，主线程回到这里继续后续代码的执行
        Thread t = new Thread(){ //主线程实例化一个线程t
            public void run(){ //t线程start之后，run方法会很快执行
                Thread t = Thread.currentThread();
                System.out.println("自定义线程："+t);
                dosome(); //此时是自定义线程调用dosome()

            }
        };
        Thread t2 = new Thread(){
            public void run(){
                System.out.println("11111");
            }
        };


        t.start();//将t线程跑起来，此时，该线程就与主线程并发了
        t2.start();


    }

    public static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println("运行dosome方法的线程"+t);
    }
}
