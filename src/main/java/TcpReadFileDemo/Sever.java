package TcpReadFileDemo;


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
        Socket socket = ss.accept();

        //3.读取数据并保存到本地文件中
        String name = UUID.randomUUID().toString().replace("-","");
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(name + ".jpg"));
        int len;
        byte[] bytes = new byte[1024];
        while ((len=bis.read(bytes))!=-1)
        {
            bos.write(bytes,0,len);
        }
        bos.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功！");
        bw.newLine();
        bw.flush();
        socket.close();
        ss.close();
    }

}