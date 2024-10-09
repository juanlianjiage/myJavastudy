package TcpDemo2;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Sever {
    public static void main(String[] args) throws IOException {
        //客户端：将本地文件上传到服务器。接收服务器的反馈。
        //服务器：接收客户端上传的文件，上传完毕之后给出反馈。


        //1.创建对象并绑定端口
        ServerSocket ss = new ServerSocket(10020);

        //2.等待客户端来连接
        while (true) {
            Socket socket = ss.accept();
            new Thread(new MyRunable(socket)).start();
        }

    }

}