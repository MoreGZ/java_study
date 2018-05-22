package java_study;

import java.io.*;

public class example20 {
    public static void main(String[] args) throws IOException {
//        DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
//
//        output.writeUTF("莫");
//        output.writeDouble(23.12);
//        output.writeUTF("george");
//        output.writeDouble(23.12);
//        output.writeUTF("ting");
//        output.writeDouble(23.12);
//
//        output.close();

        DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));

        System.out.println(input.readUTF()+" "+input.readDouble());
        System.out.println(input.readUTF()+" "+input.readDouble());
        System.out.println(input.readUTF()+" "+input.readDouble());

        input.close();
    }
}
