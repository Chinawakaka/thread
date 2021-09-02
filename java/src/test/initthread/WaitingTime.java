package test.initthread;

import java.util.concurrent.TimeUnit;

/**
 * @Author liangjunhao
 * @Description 线程不断休眠
 * @Date 2021/9/2
 **/
public class WaitingTime implements Runnable{
    @Override
    public void run() {

        while (true){
            waitSecond(200);
        }

    }

    public static final void waitSecond(int seconds) {

        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
