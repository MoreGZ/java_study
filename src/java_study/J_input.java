package java_study;

import java.io.File;
import java.util.Scanner;
public class J_input {

    public static void main(String[] args) throws Exception{

        File file = new File("src/outpu");

        Scanner input = new Scanner(file);

        while (input.hasNext()){
            String str = input.next();
            System.out.println(str);
        }

        input.close();
    }
}
