package Question1;

public class test {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        t2.setName("线程二");

        t1.setName("线程一");
        t1.start();
        t2.start();
    }
}
