package Question3;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,800,2,80,300,700);
        MyThread3 t1 = new MyThread3(list);

        MyThread3 t2 = new MyThread3(list);

        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();
    }
}
