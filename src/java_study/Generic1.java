package java_study;

import java.util.ArrayList;

public class Generic1 {
    public static void main(String[] args){
//        ArrayList<Integer> intArray = new ArrayList<Integer>();
//        intArray.add(23);
//        intArray.add(23);
//        intArray.add(23);
//
//        for(int i=0; i<intArray.size();i++){
//            System.out.println(intArray.get(i));
//        }


        GenericStack<String> strStack  = new GenericStack<String>();
        strStack.push("more");
        strStack.push("geroge");
        strStack.push("ting");

        System.out.println(strStack.pop());
        System.out.println(strStack.pop());
        System.out.println(strStack.pop());

        GenericStack<Integer> intStack = new GenericStack<Integer>();
        intStack.push(23);
        intStack.push(13);
        intStack.push(35);

        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
    }
}

class GenericStack<E> {
    private  ArrayList<E> list = new ArrayList<E>();

    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize());
    }

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}