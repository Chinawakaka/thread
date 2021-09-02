package test.callable;

/**
 * @Author liangjunhao
 * @Description 回调函数的实现类
 * @Date 2021/9/2
 **/
public class TaskHandler implements TaskCallable<TaskResult>{
    @Override
    public TaskResult callable(TaskResult taskResult) {

        //TODO 拿到结果数据后进一步处理
        System.out.println(taskResult.toString());
        return taskResult;
    }
}
