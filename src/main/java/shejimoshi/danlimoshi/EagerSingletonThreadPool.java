package shejimoshi.danlimoshi;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* Ë«ÖØ¼ì²éËø
* */
public class EagerSingletonThreadPool {


    private static volatile EagerSingletonThreadPool instance = new EagerSingletonThreadPool();
    private final ExecutorService executorService;

    private EagerSingletonThreadPool() {
        executorService= Executors.newFixedThreadPool(10);
    }
    public static EagerSingletonThreadPool getInstance() {
        if (instance == null) {
            synchronized (EagerSingletonThreadPool.class) {
                if (instance == null) {
                    instance=new EagerSingletonThreadPool();
                }
            }
        }
        return instance;
    }
    public ExecutorService getExecutorService() {
        return executorService;
    }



}
