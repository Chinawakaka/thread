package test.callable;

import java.util.concurrent.*;

/**
 * @Author liangjunhao
 * @Description 有返回结果的异步模型  结合线程池使用
 * @Date 2021/9/2
 **/
public class FutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "测试Future获取异步结果";
            }
        });

        System.out.println(future.get());
        executorService.shutdown();

    }

}
