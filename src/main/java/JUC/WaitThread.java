package JUC;

import java.util.concurrent.CountDownLatch;

public class WaitThread {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);

        Thread daqiao = new Thread(() -> {
            System.out.println("�����Ѿ�λ��");
            countDownLatch.countDown();
        });
        Thread lanlingwang = new Thread(() -> {
            System.out.println("�������Ѿ�λ��");
            countDownLatch.countDown();
        });
        Thread anqila = new Thread(() -> {
            System.out.println("�������Ѿ�λ��");
            countDownLatch.countDown();
        });
        Thread nezha = new Thread(() -> {
            System.out.println("��߸�Ѿ�λ��");
            countDownLatch.countDown();
        });
        Thread kai = new Thread(() -> {
            System.out.println("���Ѿ�λ��");
            countDownLatch.countDown();
        });

        daqiao.start();
        lanlingwang.start();
        anqila.start();
        nezha.start();
        kai.start();

        countDownLatch.await();

        System.out.println("ȫԱ��λ����ʼ��Ϸ��");
    }
}
