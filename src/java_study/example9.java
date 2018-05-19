package java_study;

import java.lang.System;
import java.util.Arrays;
public class example9 {
    public static void printMax(int[] args){
        if(args.length == 0){
            System.out.print("this is an void array");
            return ;
        }

        int max = args[0];

        for(int i=0;i<args.length;i++){
            if(args[i] > max){
                max = args[i];
            }
        }

        System.out.print(max);
    }


    public static int[] reserve(int[] arr){
        int[] newArr = new int[arr.length];

        for(int i=0,j=arr.length-1;i<arr.length;i++,j--){
            newArr[j] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args){
        int[] arr1 = new int[5];
        int[] arr2 = {21,34,23,55,3,1,33};



        System.arraycopy(arr2, 0, arr1, 0,  5);
        int[] arr3 = reserve(arr1);

        for(int i=0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        System.out.println();

        for(int i=0; i<arr3.length;i++){
            System.out.println(arr3[i]);
        }

        System.out.println();

        Arrays.sort(arr2);

        for(int i=0; i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        printMax(arr2);
    }
}
