package test.initthread;

/**
 * @Author liangjunhao
 * @Description 线程在warting上等待
 * @Date 2021/9/2
 **/
public class WaitingState implements Runnable {
    @Override
    public void run() {
        while (true) {
            synchronized (WaitingState.class){
                try {
                    WaitingState.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
