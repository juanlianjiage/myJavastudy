package Thread.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrent {
    public static int a=1;
//    public static   HashMap<String,Integer> map = new HashMap<>();
public static ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentHashMap<String,String> hashMap = new ConcurrentHashMap<>();
//        hashMap.put("你好","666");
//        System.out.println(hashMap.get("你好"));

        RunnableTest test1 = new RunnableTest();
        RunnableTest test2 = new RunnableTest();
        RunnableTest test3 = new RunnableTest();
        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test2);
        Thread t3 = new Thread(test3);
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(10000);
        for (Map.Entry<String, Integer> next : map.entrySet()) {
            System.out.println("key为" + next.getKey() + "------value" + next.getValue());
        }
    }
    public static class RunnableTest implements Runnable{

        @Override
        public void run() {
            System.out.println("插入数据");
            map.put("插入"+a,a);
            a++;
        }
    }
}
