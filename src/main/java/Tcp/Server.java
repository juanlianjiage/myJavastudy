package Tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ssc = new ServerSocket(10020);
        Socket socket = ssc.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while((b=br.read())!=-1)
        {
            System.out.print((char)b);
        }

        OutputStream os = socket.getOutputStream();
        os.write("666".getBytes());
        socket.close();
        ssc.close();
    }
}
