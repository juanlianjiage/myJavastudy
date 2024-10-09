package Question1;

public class MyThread1 extends Thread{
    static int flag=1;

    @Override
    public void run() {
        while (true)
        {
            synchronized (MyThread1.class)
            {
                if (flag>100)
                {
                    break;
                }
                else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (flag%2!=0)
                    {
                        System.out.println(getName()+"奇数"+flag);
                        flag++;
                    }
                    else {
                        flag++;
                        continue;
                    }

                }
            }

        }
    }
}
