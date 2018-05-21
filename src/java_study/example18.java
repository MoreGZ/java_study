package java_study;

public class example18 {
    public static void main(String[] args){
        GeometricObject1 o1 = new Gcircle(32);
        GeometricObject1 o2 = new Grectangle(13,44);

        System.out.println(equalArea(o1,o2));
        System.out.print(((Gcircle) o1).getRadius());
    }

    public static boolean equalArea(GeometricObject1 o1, GeometricObject1 o2){
        return o1.getArea() == o2.getArea();
    }

    public static void print(GeometricObject1 o){
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
