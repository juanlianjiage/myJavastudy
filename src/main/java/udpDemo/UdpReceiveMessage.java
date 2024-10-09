package udpDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpReceiveMessage {

    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];

        while (true) {
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
            ds.receive(dp);
            byte[] data = dp.getData();
            int len = dp.getLength();
            InetAddress ip = dp.getAddress();
            String hostName = dp.getAddress().getHostName();
            System.out.println("ip为："+ip+",主机名为："+hostName+",发送了数据："+new String(data,0,len));
        }

    }
}
