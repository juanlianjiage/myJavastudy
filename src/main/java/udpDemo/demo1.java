package udpDemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class demo1 {
    static  CopyOnWriteArrayList<Integer> list1 = new CopyOnWriteArrayList<>();
//    static ArrayList<Integer> list1=new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }


        t1 t1 = new t1();
        t2 t2 = new t2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread2.start();
        thread1.start();
        Thread.sleep(3000);
        System.out.println("list1的大小"+list1.size());
    }
    public static class t1 implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 10; i++) {
                    if (list1.get(i)==5)
                    {
                        list1.remove(4);
                    }
                }
        }
    }
    public static class t2 implements Runnable{
        @Override
        public void run() {
            Iterator<Integer> iterator = list1.iterator();
            int a=0;
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                a++;
                System.out.println(iterator.next());
            }
            System.out.println("迭代器输出了"+a+"次");
        }
    }
}
