package InetStudy;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class receiveMessageDemo
{
    public static void main(String[] args) throws IOException {
        //通信管道，确定接收端口号
        DatagramSocket ds = new DatagramSocket(10086);
        //数据包
        byte[] bts = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bts, bts.length);

        //receive阻塞方法
        ds.receive(dp);
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        System.out.println("address："+address+"port："+port+"数据："+new String(data,0,len));
    }
}
