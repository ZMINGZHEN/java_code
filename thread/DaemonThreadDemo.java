package thread;

/**
 * 守护线程
 *
 * 守护线程是由普通线程在start之前调用方法setDaemon(true)改变而来的。
 * 因此守护线程实际上在创建与使用上与普通线程没有区别，但是在结束时机上有
 * 一点不同：进程的结束。
 *
 * 进程结束：当一个进程中的所有普通线程都结束时，进程就会结束，并且在结束前
 * 会将所有守护线程杀死。
 *
 * 守护线程上执行的任务通常都是不关心何时应该停止，只要我程序主要工作都停止
 * 时，它可以跟着停止
 * CG就是跑在守护线程上的。
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("rose:let me go!");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){}
                }
                System.out.println("rose:啊啊啊啊啊");
                System.out.println("噗通落水");
            }// run方法执行完毕，rose线程结束
        };

        Thread jack = new Thread(){
            public void run(){
                while(true){
                    System.out.println("jack:you jump!I jump!");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){

                    }
                }
            }
        };

        rose.start();
        //该方法必须在线程start之前调用
        jack.setDaemon(true);
        jack.start();
        //当rose结束后，由于主线程还活着，进程就不会结束，jack就不会被杀掉
//        while(true){//主线程进入死循环
//
//        }
    }
}
