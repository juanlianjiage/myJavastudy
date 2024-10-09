import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class suo {

  static Lock lock= new ReentrantLock();
  static int i=1;

  static class t1 implements Runnable{

      @Override
      public void run() {
          while(i<=100){
              synchronized(lock){
                  if (i%2==1){
                      System.out.println(Thread.currentThread().getName()+":"+i++);
                      lock.notify();
                  }

                  try {
                      lock.wait();
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
              }
          }

      }
  }
    static class t2 implements Runnable{
        @Override
        public void run() {
            while(i<=100){
                synchronized(lock){
                    if (i%2==0){
                        System.out.println(Thread.currentThread().getName()+":"+i++);
                        lock.notify();
                    }

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        new Thread(new t1()).start();
        new Thread(new t2()).start();

    }
}
