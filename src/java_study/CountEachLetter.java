package java_study;

import java.util.Scanner;
public class CountEachLetter {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        int[] count = countLetters(s);

        for(int i=0; i<count.length;i++){
            if(count[i] != 0 ){
                System.out.println((char)('a'+i) + " appears " + count[i] + " times");
            }
        }
    }

    public static int[] countLetters(String s){
        int[] count = new int[26];

        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                count[s.charAt(i) - 'a']++;
            }
        }

        return count;
    }
}
