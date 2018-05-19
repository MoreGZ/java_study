package java_study;

        import javafx.beans.binding.NumberBinding;
        import java.util.Scanner;

public class example7 {
    public static void main(String[] args){
        final int NUMBER_OF_ARRAY = 5;
        double[] array = new double[NUMBER_OF_ARRAY];

        Scanner input = new Scanner(System.in);

        int sum = 0;
        for(int i = 0; i<NUMBER_OF_ARRAY; i++){
            System.out.print("please input the number ");

            array[i] = input.nextDouble();
            sum += array[i];
        }

        double average = sum / NUMBER_OF_ARRAY;

        System.out.printf("the average of this number is %f", average);
    }
}
