package java_study;

public class Generic3 {
    public static void main(String[] args){
        Gcircle gcircle = new Gcircle(20);
        Grectangle grectangle = new Grectangle(23,10);

        System.out.println(Generic3.<GeometricObject1>equalArea(gcircle,grectangle));
    }

    public static <E extends GeometricObject1> boolean equalArea(E o1, E o2){
        return o1.getArea() == o2.getArea();
    }
}
