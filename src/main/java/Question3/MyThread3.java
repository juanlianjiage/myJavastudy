package Question3;

import Question1.MyThread1;
import Question2.MyThread2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyThread3 extends Thread{

    ArrayList<Integer> list;

    public MyThread3(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true)
        {
            synchronized (MyThread3.class)
            {
                if (list.size()==0){
                    break;
                }else {
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
                    System.out.println(getName()+"抽到了"+prize+"元！！");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
