package TcpDemo3;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost",10020);
        //读取文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("04.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        byte[] bytes = new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1)
        {
            bos.write(bytes,0,len);
        }
        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);
        socket.close();

    }
}
