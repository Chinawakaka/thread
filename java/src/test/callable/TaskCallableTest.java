package test.callable;

/**
 * @Author liangjunhao
 * @Description
 * @Date 2021/9/2
 **/
public class TaskCallableTest {

    public static void main(String[] args) {
        TaskCallable<TaskResult> taskHandler = new TaskHandler();

        TaskExecutor taskExecutor = new TaskExecutor(taskHandler, "测试回调任务");

        new Thread(taskExecutor).start();

    }
    
}
