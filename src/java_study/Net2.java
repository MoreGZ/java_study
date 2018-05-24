package java_study;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Net2 {

    public static void main(String[] args)throws UnknownHostException,IOException {
        int port = 8000;
        String host = "localhost";
        DataInputStream in;
        DataOutputStream out;
        Socket socket;

        socket = new Socket(host, port);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());

        out.writeDouble(300);
        System.out.println(in.readDouble());
    }
}
