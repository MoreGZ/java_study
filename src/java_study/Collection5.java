package java_study;

import java.util.*;
public class Collection5 {
    public static void main(String[] args){
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("smith",30);
        hashMap.put("more",20);
        hashMap.put("geroge",22);
        System.out.println(hashMap+"\n");

        System.out.println(hashMap.get("more"));

        count("Good morning, Have a good class. Have a good visit. Have fun!");
    }

    public static void count(String str){
        TreeMap<String, Integer> countMap = new TreeMap<String, Integer>();

        String[] words = str.split("[ \n\t\r.,;:!?(){]");
        for(String word: words){
            String key = word.toLowerCase();

            if(key.length()>0){
                if(countMap.get(key) == null){
                    countMap.put(key, 1);
                }else {
                    int value = countMap.get(key) + 1;
                    countMap.put(key, value);
                }
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = countMap.entrySet();

        for(Map.Entry<String, Integer> entry: entrySet){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }

}
