package java_study;

public class Generic2 {
    public static void main(String[] args){
        String[] arr1 = {"39","32","3993"};

        Integer[] arr2 = {23,34,31,11};

        Generic2.<String>print(arr1);
        Generic2.<Integer>print(arr2);
    }

    public static <E> void print(E[] arr){
        for(E i: arr){
            System.out.println(i);
        }
    }
}
