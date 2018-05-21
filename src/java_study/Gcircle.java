package java_study;

public final class Gcircle extends GeometricObject1 {
    private double radius;

    public Gcircle(){
        this(1);
    }

    public Gcircle(double radius){
        this.radius = radius;
    }

    public Gcircle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getDiamater(){
        return radius * 2;
    }

    public String toString(){
        return  "created on " + getCreateDate() +
                "\ncolor: " + getColor() + "and filled: " + isFilled() + "\n" +
                "this is an circle width " + getRadius() + " radius and " + getArea() + " area";
    }
}
