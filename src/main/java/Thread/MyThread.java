package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    //售卖的数量，同时为了多个线程同时访问使用static修饰
    static int ticket=0;
    //定义互斥锁
    static Lock lock=new ReentrantLock();

    @Override
    public void run() {
        //循环进入卖票
        while (true)
        {
            //上锁
            lock.lock();
            try {
                //卖票逻辑
                if (ticket==100)
                {
                    break;
                }else {
                    Thread.sleep(1);
                    ticket++;
                    System.out.println(getName()+"---"+ticket);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                //释放锁
                lock.unlock();
                try {
                    //防止一个线程一直拿到锁，休眠2秒
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
