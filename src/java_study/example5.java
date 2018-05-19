package java_study;

public class example5 {
    public static void main(String[] args){
        int i = 0;
        int sum = 0;
//        while(i<=100){
//            sum += i;
//            i++;
//        }
//        do{
//            sum += i;
//            i++;
//            if(i == 1){
//                int x = 34;
//            }
//        } while (i<=100);


        for(;i<=100;i++){
//            System.out.print(i);
            sum += i;
        }
        System.out.print(sum);
    }
}
