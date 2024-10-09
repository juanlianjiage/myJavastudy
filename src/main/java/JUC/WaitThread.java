package JUC;

import java.util.concurrent.CountDownLatch;

public class WaitThread {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);

        Thread daqiao = new Thread(() -> {
            System.out.println("大乔已就位！");
            countDownLatch.countDown();
        });
        Thread lanlingwang = new Thread(() -> {
            System.out.println("兰陵王已就位！");
            countDownLatch.countDown();
        });
        Thread anqila = new Thread(() -> {
            System.out.println("安其拉已就位！");
            countDownLatch.countDown();
        });
        Thread nezha = new Thread(() -> {
            System.out.println("哪吒已就位！");
            countDownLatch.countDown();
        });
        Thread kai = new Thread(() -> {
            System.out.println("铠已就位！");
            countDownLatch.countDown();
        });

        daqiao.start();
        lanlingwang.start();
        anqila.start();
        nezha.start();
        kai.start();

        countDownLatch.await();

        System.out.println("全员就位，开始游戏！");
    }
}
