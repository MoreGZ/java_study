package java_study;
import java.util.Scanner;

public class example {
    public static  void main(String[] args){
        final double PI = 3.141592;
        double radius, area;
        Scanner input = new Scanner(System.in);

        radius = input.nextDouble();

        area = radius * radius * PI;

        System.out.print("the radius of this circle is "+ radius + " and the atea is " + area);

    }

}
