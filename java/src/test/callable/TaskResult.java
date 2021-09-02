package test.callable;

import java.io.Serializable;

/**
 * @Author liangjunhao
 * @Description 定义一个结果类
 * @Date 2021/9/2
 **/
public class TaskResult implements Serializable {

    /**
     * 任务状态
     */
    private Integer taskStatus;

    /**
     * 任务消息
     */
    private String taskMessage;

    /**
     * 任务结果数据
     */
    private String taskResult;

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskMessage() {
        return taskMessage;
    }

    public void setTaskMessage(String taskMessage) {
        this.taskMessage = taskMessage;
    }

    public String getTaskResult() {
        return taskResult;
    }

    public void setTaskResult(String taskResult) {
        this.taskResult = taskResult;
    }

    @Override
    public String toString() {
        return "TaskResult{" +
                "taskStatus=" + taskStatus +
                ", taskMessage='" + taskMessage + '\'' +
                ", taskResult='" + taskResult + '\'' +
                '}';
    }
}
