package java_study;
import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("please input 3 double number and we will show you the average of them");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        System.out.print(average);
    }
}
