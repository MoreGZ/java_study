package java_study;

public class GeometricObject1 {
    protected String color;
    private boolean filled;
    private java.util.Date createDate;

    public GeometricObject1(){
        createDate = new java.util.Date();
    }

    public GeometricObject1(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.createDate = new java.util.Date();
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getCreateDate(){
        return createDate;
    }

    public String toString(){
        return  "created on " + createDate + "\ncolor: " + color + "and filled: " + filled;
    }
}
