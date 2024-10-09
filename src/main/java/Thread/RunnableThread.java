package Thread;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("该线程实现Runnable接口-------");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
