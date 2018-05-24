package java_study;

public class Generic4 {
    public static void main(String[] args) {
        Max.max("2","23");
    }
}

class Max{
    public static <E extends Comparable<E>>boolean max(E o1, E o2) {
        if(o1.compareTo(o2) > 0) {
            return true;
        }else {
            return false;
        }
    }
}
