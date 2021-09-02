package test.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author liangjunhao
 * @Description 测试FutureTask获取异步结果    结合thread使用
 * @Date 2021/9/2
 **/
public class FutureTaskTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Object> futureTask = new FutureTask<>(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                return "测试FutureTask获取异步结果";
            }
        });

        new Thread(futureTask).start();
        System.out.println(futureTask.get());

    }



}
