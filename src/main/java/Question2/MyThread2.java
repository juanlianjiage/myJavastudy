package Question2;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread2 extends Thread{

    static int bao=100;
    static int count=3;


    @Override
    public void run() {
       synchronized (MyThread2.class)
       {
           if (count==0)
           {
               System.out.println(getName()+"没有抢到红包！");
           }else {
               int prize=0;
               if (count==1)
               {
                   prize=bao;
                   count--;
                   System.out.println(getName()+"抢到了"+prize);
               }
               else {
                   Random random = new Random();
                   int i = random.nextInt(bao);
                   prize=i;
                   bao-=i;
                   count--;
                   System.out.println(getName()+"抢到了"+prize);
               }
           }
       }
    }
}
