package java_study;

public final class Gcircle extends GeometricObject1 {
    private double radius;
    private static int count = 0;

    public Gcircle(){
        this(1);
        this.count++;
    }

    public Gcircle(double radius){
        this.setRadius(radius);
//        System.out.print(this.count);
        this.count++;
    }

    public Gcircle(double radius, String color, boolean filled){
        super(color,filled);
        this.setRadius(radius);
        this.count++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        if(radius >= 0){
            this.radius = radius;
        }else {
            throw new IllegalArgumentException("radius cannot be negative");
        }
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }

    public double getDiamater(){
        return radius * 2;
    }

    public String toString(){
        return  "created on " + getCreateDate() +
                "\ncolor: " + getColor() + "and filled: " + isFilled() + "\n" +
                "this is an circle width " + getRadius() + " radius and " + getArea() + " area";
    }

    public static int getCount(){
        return count;
    }
}
