package java_study;

public class Grectangle extends GeometricObject1 {
    private double width;
    private double height;

    public Grectangle() {
        this(1,1);
    }

    public Grectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public  Grectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
