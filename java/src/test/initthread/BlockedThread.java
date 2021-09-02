package test.initthread;

/**
 * @Author liangjunhao
 * @Description 加锁后不再释放锁
 * @Date 2021/9/2
 **/
public class BlockedThread implements Runnable {


    @Override
    public void run() {
        synchronized (BlockedThread.class) {
            while (true) {
                WaitingTime.waitSecond(100);
            }
        }

    }
}
