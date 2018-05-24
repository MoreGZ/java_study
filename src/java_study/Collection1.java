package java_study;


import  java.util.*;
public class Collection1 {
    public static void main(String[] args){
        Set<String> set1 = new LinkedHashSet<String>();

        set1.add("more");
        set1.add("geroge");
        set1.add("ting");

        System.out.println(set1);

        Set<String> set2 = new HashSet<String>();

        set2.add("more");
        set2.add("geroge");
        set2.add("ting");

        System.out.println(set2);

        TreeSet<String> set3 = new TreeSet<String>();
        set3.add("more");
        set3.add("ting");
        set3.add("geroge");
        set3.add("ssss");


        System.out.println(set3);
        System.out.println("first(): "+set3.first());
        System.out.println("last(): "+set3.last());
        System.out.println("headSet(): "+set3.headSet("more"));
        System.out.println("tailSet(): "+set3.tailSet("more"));
        System.out.println("lower(): "+set3.lower("more"));
        System.out.println("higher(): "+set3.higher("more"));
        System.out.println("floor(): "+set3.floor("more"));
        System.out.println("ceiling(): "+set3.ceiling("more"));
    }
}
