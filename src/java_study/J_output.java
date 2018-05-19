package java_study;

import java.io.File;
import java.io.PrintWriter;
public class J_output {
    public static void main(String[] args) throws Exception{
        File file = new File("src/outpu");
        if(file.exists()){
            System.out.println("the file has existed");
            System.exit(0);
        }

        PrintWriter output = new PrintWriter(file);

//        output.print("this txt is from george more ");
        output.println(34);
        output.println("this txt is from george more");

        output.close();
    }

}
