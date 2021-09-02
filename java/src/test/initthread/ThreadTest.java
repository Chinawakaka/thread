package test.initthread;

/**
 * @Author liangjunhao
 * @Description 实现线程大体分为三种，继承thread类，实现runnable接口，实现callable接口
 * @Date 2021/9/2
 **/
public class ThreadTest extends Thread{

    @Override
    public void run() {
        System.out.println("执行run方法");
    }

}
