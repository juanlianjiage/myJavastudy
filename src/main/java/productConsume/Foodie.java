package productConsume;

import sun.security.krb5.internal.crypto.Des;

public class Foodie extends Thread{
    @Override
    public void run() {

        while(true)
        {
            synchronized (Desk.lock)
            {
                if (Desk.count==0)
                {
                    break;
                }else {
                    if (Desk.foodFlag==0)
                    {
                        try {
                            Desk.lock.wait();//让当前线程与锁进行绑定
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }else {
                        Desk.count--;
                        System.out.println("吃货在吃面条"+Desk.count+"碗！！");
                        Desk.lock.notifyAll();
                        Desk.foodFlag=0;
                    }
                }
            }
        }
    }
}
