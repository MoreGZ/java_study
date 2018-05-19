package java_study;

import java.io.File;
public class J_file {
    public static void main(String[] args){
        File file = new File("src/java_study/example.java");

        System.out.println(file.isFile());
    }
}
