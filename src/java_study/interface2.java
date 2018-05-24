package java_study;

public class interface2 {
    public static void main(String[] args){
        House house = new House(232);
        Object str  = (Object)house;
        System.out.println(house.compareTo(new House1(333)));
        System.out.println(house);
    }
}

class House implements Cloneable, Comparable {

    double area;
    int value;

    public House(double area){
        this.area = area;
        this.value = 1;
    }

    public House(){
        this(1.0 );
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public int compareTo(Object o){
        if(area > ((House)o).area){
            return 1;
        } else if(area < ((House)o).area){
            return -1;
        }else {
            return 0;
        }
    }

//    public String toString(){
//        return "House";
//    }
}

class House1 extends House{
    public House1(double area){
        super(area);
    }

    public void tell(){
        System.out.println("this is not the House, is the House1");
    }
}
