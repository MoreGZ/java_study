package java_study;

import java.awt.desktop.SystemSleepEvent;
import java.util.*;

public class Collection2 {
    public static void main(String[] args){
        Set<GeometricObject1> set = new TreeSet<GeometricObject1>(new GeometricObjectComparator());

//        set.add(new Gcircle(233));
//        set.add(new Grectangle(23,400));
//        set.add(new Gcircle(20));
//        set.add(new Gcircle(99));

        System.out.println(set);

        for(GeometricObject1 e: set){
            System.out.println(e.getArea());
        }

    }
}

class GeometricObjectComparator implements Comparator<GeometricObject1>, java.io.Serializable {
    public int compare(GeometricObject1 o1, GeometricObject1 o2){
        if(o1.getArea() > o2.getArea()) {
            return 1;
        }else if(o1.getArea() < o2.getArea()) {
            return -1;
        }else {
            return 0;
        }
    }
}
