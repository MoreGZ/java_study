package java_study;

import java.util.Date;
import java.util.Random;
public class example11 {
    public static void main(String[] args){
        Circle circle1 = new Circle();

        Circle circle2 = new Circle(4.0);
        Circle circle3 = new Circle(4.0);
        Circle circle4 = new Circle(4.0);

        System.out.println("the area of circle1 is " + circle1.getArea());
        System.out.println("the area of circle2 is " + circle2.getArea());
        System.out.println(circle4.count);
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.toString());
    }
}

class Circle {
    double radius;

    static int count = 0;

    Circle(){
        radius = 1.0;
        count++;
    }

    static int getCount(){
        return count;
    }

    Circle(double radius){
        this.radius = radius;
        count++;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }
}