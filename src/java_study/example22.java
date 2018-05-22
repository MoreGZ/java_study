package java_study;

import java.io.IOException;

public class example22 {
    public static void main(String[] args){
        String[] arr = {"temp.txt","target1.txt"};
        try{
            copy.main(arr);

        }catch (IOException ex){
            System.out.println(ex);
        }
    }
}
