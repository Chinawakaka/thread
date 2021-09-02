package test.callable;

/**
 * @Author liangjunhao
 * @Description 定义一个回调接口
 * @Date 2021/9/2
 **/
public interface TaskCallable<T> {
    T callable(T t);
}
