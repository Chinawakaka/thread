package test;

import net.jcip.annotations.NotThreadSafe;

/**
 * @Author liangjunhao
 * @Description
 * @Date 2021/8/29
 **/
@NotThreadSafe
public class UnsafeSequence {

    private int value;

    public int getNext() {
        return value++;
    }


}
