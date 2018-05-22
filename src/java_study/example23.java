package java_study;

import java.io.*;

public class example23 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("object.txt")));

        output.writeUTF("john");
        output.writeDouble(23.11);
        output.writeObject(new java.util.Date());

        output.close();

        ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream("object.txt")));

        String name = input.readUTF();
        double scorce = input.readDouble();
        java.util.Date date = (java.util.Date)(input.readObject());

        input.close();
        System.out.println(name+"  "+scorce+"  "+date);
    }
}
