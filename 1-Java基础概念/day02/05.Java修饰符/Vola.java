/**
 * 通常情况下，在一个线程调用run（）方法，在另一个线程调用stop（）方法。
 * 如果第一行中缓冲区的active值被使用，那么第二行的active值为false时循环不会停止
 * 但是如下代码使用了volatile修饰active，所以循环会停止
 * */
public class Vola implements Runnable{
    private volatile boolean active;
    public void run() {
        active = true;
        while (active) // 第一行
        {
           // 代码
        }
    }
    public void stop() {
        active = false; // 第二行
    }
}