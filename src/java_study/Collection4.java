package java_study;

//import java.util.Arrays;
import java.util.*;

public class Collection4 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("i","infin","jfij");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
