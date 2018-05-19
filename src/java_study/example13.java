package java_study;

public class example13 {
    public static    void main(String[] args){
        Circle[] circles = {new Circle(),new Circle(32)};

        for(Circle circle : circles){
            System.out.println(circle.getArea());
        }
    }
}
