package thread;

/**
 * 线程提供了一个方法:join
 * 可以让线程之间同步运行
 *
 * 同步运行:运行存在先后顺序进行
 * 异步运行:各干各的,互不干扰。多线程本身就是异步运行的。
 */
public class JoinDemo {
        //表示图片是否下载完毕
        public static boolean isFinish = false;

    public static void main(String[] args) {
        /*

         */
        Thread download = new Thread(){
            public void run(){
                System.out.println("down：开始下载图片。。。");
                for(int i=1;i<=100;i++){
                    System.out.println("down:"+i+"%");
                    try{
                        Thread.sleep(50);
                    }catch(InterruptedException e){

                    }
                }
                System.out.println("down：图片下载完毕");
                isFinish = true;
            }
        };

        Thread show = new Thread(){
            public void run(){
                try{
                    System.out.println("show:开始显示文字...");
                    Thread.sleep(2000);
                    System.out.println("show:显示文字完毕！");
                    //这里要先让show线程阻塞，直到download执行完毕
                    download.join();
                    System.out.println("show:开始显示图片...");
                    if(!isFinish){
                        //将一个异常抛出当前线程的run方法之外时，
                        //该线程会被杀死
                        throw new RuntimeException("show:图片加载失败！");
                    }
                    System.out.println("show:图片显示完毕！");
                }catch (InterruptedException e){}
            }
        };

        show.start();
        download.start();
    }
}
