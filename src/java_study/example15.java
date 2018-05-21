package java_study;

public class example15 {
    public static void main(String[] args){
         Gcircle gcircle = new Gcircle(6,"red",true);
         Grectangle grectangle = new Grectangle(10,5,"red", true);

        System.out.printf("%s \n%s \n\n", gcircle.toString(), gcircle.getArea());
        System.out.printf("%s \n%s \n", grectangle.toString(), grectangle.getArea());
    }
}




