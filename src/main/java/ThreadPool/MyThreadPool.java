package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool {
    public static void main(String[] args) {

//        ExecutorService pool = Executors.newCachedThreadPool();
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.submit(new MyRunable());
        pool.submit(new MyRunable());
        pool.submit(new MyRunable());
        pool.submit(new MyRunable());
        pool.submit(new MyRunable());
        pool.submit(new MyRunable());

    }

}
