package java_study;

public class example6 {
    public static int max(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }

    public  static  double max(double num1, double num2){
        return num1 > num2 ? num1 : num2;
    }
    public static void main(String[] args){
        int x = 34, y = 44;
        double a = 34.1, b = 55.24;

        int maxInt = max(x, y);
        double maxDouble = max(a, b);

        System.out.printf("this max int is %d, and the max double is %f", maxInt, maxDouble);
    }
}
