package test;

import test.initthread.BlockedThread;
import test.initthread.WaitingState;
import test.initthread.WaitingTime;

/**
 * @Author liangjunhao
 * @Description 线程的各种状态，测试线程的生命周期
 * @Date 2021/9/2
 **/
public class ThreadState {


    public static void main(String[] args) {
        new Thread(new WaitingTime(), "waitingtimeThread").start();
        new Thread(new WaitingState(), "waitingStateThread").start();

        //加锁
        new Thread(new BlockedThread(), "BlockedThread-01").start();
        //阻塞
        new Thread(new BlockedThread(), "BlockedThread-02").start();

    }

}
