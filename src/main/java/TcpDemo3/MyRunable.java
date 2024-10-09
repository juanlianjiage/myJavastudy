package TcpDemo3;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunable implements Runnable{
    Socket socket;
    public MyRunable(Socket socket)
    {
        this.socket=socket;
    }
    @Override
    public void run() {
        try {


            //3.读取数据并保存到本地文件中
            String name = UUID.randomUUID().toString().replace("-","");
            //获取读取通道里面的输入流
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            //生成文件的输出流
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(name + ".jpg"));
            int len;
            byte[] bytes = new byte[1024];
            while ((len=bis.read(bytes))!=-1)
            {
                bos.write(bytes,0,len);
            }
            bos.close();
            //获取通道的输出流，目的是防止中文乱码，（字节读取会出现中文乱码！）
            BufferedWriter bw = new BufferedWriter(new
                    OutputStreamWriter(socket.getOutputStream()));
            bw.write("上传成功！");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (socket!=null)
            {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
