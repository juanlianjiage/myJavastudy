package TcpDemo3;


import TcpDemo2.MyRunable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class Sever {
    public static void main(String[] args) throws IOException {
        //客户端：将本地文件上传到服务器。接收服务器的反馈。
        //服务器：接收客户端上传的文件，上传完毕之后给出反馈。


        //构建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//线程核心数量
                16,//线程池大小
                60,//空闲时间
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),//队列大小
                Executors.defaultThreadFactory(),//构造线程的方法
                new ThreadPoolExecutor.AbortPolicy()//z阻塞队列的

        );
        //1.创建对象并绑定端口
        ServerSocket ss = new ServerSocket(10020);

        //2.等待客户端来连接
        while (true) {
            Socket socket = ss.accept();
            pool.submit(new MyRunable(socket));
        }

    }

}