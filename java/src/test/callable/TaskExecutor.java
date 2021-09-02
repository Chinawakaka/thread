package test.callable;

/**
 * @Author liangjunhao
 * @Description 任务执行类
 * @Date 2021/9/2
 **/
public class TaskExecutor implements Runnable {

    //定义一个回调接口，并在接口中定义接收任务结果数据的方法，具体逻辑在回调接口的 实现类中完成。
    // 将回调接口与任务参数一同放进线程或线程池中运行，任务运行后调用接口方法，执行 回调接口实现类中的逻辑来处理结果数据
    private TaskCallable<TaskResult> taskCallable;

    private String taskparameter;

    public TaskExecutor(TaskCallable<TaskResult> taskCallable, String taskparameter) {
        this.taskCallable = taskCallable;
        this.taskparameter = taskparameter;
    }


    @Override
    public void run() {

        //TODO 一系列业务逻辑,将结果数据封装成TaskResult对象并返回
        TaskResult result = new TaskResult();
        result.setTaskStatus(1);
        result.setTaskMessage(this.taskparameter);
        result.setTaskResult("异步回调成功");

        //执行回调方法
        taskCallable.callable(result);

    }
}
