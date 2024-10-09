package Thread;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.concurrent.*;

public class lockUnlock {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3=new MyThread();
        t1.setPriority(1);
        t2.setPriority(3);
        t3.setPriority(10);
        t1.setName("1号");
        t2.setName("2号");
        t3.setName("3号");
        t1.start();
        t2.start();
        t3.start();
//        t1.start();
//        t1.start();
//        t1.start();
//        t1.run();
//        t1.run();
//        t1.run();

//        CallableThread callableThread = new CallableThread();
//        //创建FutureTask对象
//        FutureTask<String> task = new FutureTask<>(callableThread);
//        //创建Thread对象
//        Thread thread = new Thread(task);
//        thread.start();
//        String s = task.get();
//        System.out.println(s);
//
//        //创建线程池对象
//        ExecutorService threadPool = Executors.newFixedThreadPool(3);
//        threadPool.submit(new MyThread());
//        //关闭线程池
//        threadPool.shutdown();

    }
}
