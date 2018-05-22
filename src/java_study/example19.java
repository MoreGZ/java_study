package java_study;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class example19 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream output = new FileOutputStream("temp.dat");
//
//        for(int i=1; i<=10; i++){
//            output.write(i);
//        }
//
//        output.close();
//
//        FileInputStream input = new FileInputStream("temp.dat");
//
//        int value;
//        while ((value = input.read()) != -1){
//            System.out.print(value + " ");
//        }
//
//        input.close();

//        PrintWriter printWriter = new PrintWriter(new FileOutputStream("temp.txt"));
        PrintWriter printWriter = new PrintWriter(new File("temp.txt"));

        printWriter.print("梦 ");

        printWriter.close();
    }
}
