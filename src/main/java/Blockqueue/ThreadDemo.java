package Blockqueue;


import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> strings = new ArrayBlockingQueue<>(1);
        Cook c=new Cook(strings);
       Foodie f=new Foodie(strings);
        c.setName("厨师");
        f.setName("吃货");
        c.start();
        f.start();
    }
}
