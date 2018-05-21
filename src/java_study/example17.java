package java_study;

public class example17 {
    public static void main(String[] args){
        try{
            Gcircle gcircle1 =new Gcircle(2);
            Gcircle gcircle2 =new Gcircle(-12);
            Gcircle gcircle3 =new Gcircle(-2);
        }catch (IllegalArgumentException ex){
            System.out.println(ex);
        }finally {
            System.out.println(Gcircle.getCount());

        }

        System.out.println(Gcircle.getCount());

    }
}
