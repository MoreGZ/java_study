package java_study;


import java.util.*;
public class Collection3 {
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(23);
        arrayList.add(34);
        arrayList.add(0, 333);

        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
        linkedList.add(1,"red");
        linkedList.removeLast();
        linkedList.addFirst(new Gcircle(20));
        System.out.println(linkedList);
    }
}
