package udpDemo;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UdpsendMessage {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        //打包数据
        while (true) {
            System.out.println("请输入您要说的话：");
            String str = sc.nextLine();
            if ("886".equals(str))
            {
                break;
            }
            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("localhost");
            int port=10086;
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address, port);
            ds.send(dp);
        }
        ds.close();

    }
}
