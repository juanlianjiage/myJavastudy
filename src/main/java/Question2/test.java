package Question2;

public class test {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        MyThread2 t3 = new MyThread2();
        MyThread2 t4 = new MyThread2();
        MyThread2 t5 = new MyThread2();
        t2.setName("线程二");

        t1.setName("线程一");
        t3.setName("线程三");
        t4.setName("线程四");
        t5.setName("线程五");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
