package test;

import test.initthread.CallableThread;
import test.initthread.RunnableThread;
import test.initthread.ThreadTest;

import java.util.concurrent.*;

/**
 * @Author liangjunhao
 * @Description
 * @Date 2021/8/29
 **/
public class test {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        Thread thread = new Thread(new RunnableThread());
        thread.start();
//
//
//
//
//
//
//        CountDownLatch c = new CountDownLatch(5);
//
//        Future submit1 = Executors.newSingleThreadExecutor().submit(new CallableThread(c));
//        Future submit2 = Executors.newSingleThreadExecutor().submit(new CallableThread(c));
//        Future submit3 = Executors.newSingleThreadExecutor().submit(new CallableThread(c));
//        Future submit4 = Executors.newSingleThreadExecutor().submit(new CallableThread(c));
//        c.await();
//
//
//        Object o1 = submit1.get();
//        Object o2 = submit2.get();
//        Object o3 = submit3.get();
//        Object o4 = submit4.get();


//        Thread thread = new Thread(() -> {
//            try {
//                TimeUnit.SECONDS.sleep(10L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        thread.setDaemon(true);
//        thread.start();
//        System.out.println("jiesu");

    }

}
