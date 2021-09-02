package test;

/**
 * @Author liangjunhao
 * @Description
 * @Date 2021/9/2
 **/
public class ThreadSort02 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println("thread1");
        });
        thread1.setName("thread1");
        System.out.println(thread1.getName());

        Thread thread2 = new Thread(() -> {
            System.out.println("thread2");
        });
        thread2.setName("thread2");
        System.out.println(thread2.getName());

        Thread thread3 = new Thread(() -> {
            System.out.println("thread3");
        });
        thread3.setName("thread3");
        System.out.println(thread3.getName());


        thread1.start();
        //join方法可以让子线程完成再执行主线程
        thread1.join();

        thread2.start();
        thread2.join();

        thread3.start();
        thread3.join();

    }


}
