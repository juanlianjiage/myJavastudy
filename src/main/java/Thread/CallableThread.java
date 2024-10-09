package Thread;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "该线程实现了Callable接口-------";
    }
}
