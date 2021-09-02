package test.initthread;

import java.sql.Time;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Author liangjunhao
 * @Description
 * @Date 2021/9/2
 **/
public class CallableThread implements Callable {

    private CountDownLatch c;

    public CallableThread(CountDownLatch c) {
        this.c = c;
    }

    @Override
    public Object call() throws Exception {
        System.out.println("实现callable");
        TimeUnit.SECONDS.sleep(10L);
        c.countDown();
        return null;
    }
}
