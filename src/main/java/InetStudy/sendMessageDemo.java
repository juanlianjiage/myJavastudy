package InetStudy;

import java.io.IOException;
import java.net.*;

public class sendMessageDemo {
    public static void main(String[] args) throws IOException {
        //通信管道
        DatagramSocket ds = new DatagramSocket();
        //数据
        String str="你好！";
        byte[] bts=str.getBytes();
        //send ip port
        InetAddress add = InetAddress.getByName("localhost");
        int port=10086;
        //数据包
        DatagramPacket dp = new DatagramPacket(bts, bts.length, add,port);

        ds.send(dp);
        ds.close();
    }

}
