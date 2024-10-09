package shejimoshi.danlimoshi;

import Thread.Collections.Concurrent;

import java.util.*;

public class test {
    public static void main(String[] args) {

        EagerSingletonThreadPool instance = EagerSingletonThreadPool.getInstance();
        instance.getExecutorService().submit(()->{
            System.out.println("1111111");
        });


    }


    }





