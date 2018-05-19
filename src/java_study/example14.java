package java_study;

import java.util.SplittableRandom;
import java.lang.Character;
import java.lang.String;
public class example14 {
    public static void main(String[] args){
        String str1 = "java";
        String str2 = "java";

        String str3 = new String("java");

        System.out.printf("%s %s %s \n", str1, str2, str3);
        if(str1 == str2){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

        if(str1 == str3){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

        if(str1.equals(str3)){
            System.out.println("yes");

        }

        int length = str1.length();

        char a = str1.charAt(0);

        String str4 = str2 + " " + str3;

        String str5 = str1.concat(str2);

        String str6 = str1.substring(0,3);

        char[] chars = str1.toCharArray();

    }
}
