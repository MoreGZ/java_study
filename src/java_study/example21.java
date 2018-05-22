package java_study;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class example21 {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));

        try{
            while (true){
                System.out.println(input.readUTF() + " " + input.readDouble());
            }
        }catch (EOFException ex){
            System.out.println();
            System.out.println("All data read");
        }
    }
}
