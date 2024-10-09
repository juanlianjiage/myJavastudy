package TcpDemo2;

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
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(name + ".jpg"));
            int len;
            byte[] bytes = new byte[1024];
            while ((len=bis.read(bytes))!=-1)
            {
                bos.write(bytes,0,len);
            }
            bos.close();
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
