package java_study;
import javax.swing.JOptionPane;
public class example4 {
    public static void main(String[] args){
        int x = 3;
        boolean y = true;
//        if(y){
//            System.out.print("true");
//        }else {
//            System.out.print("false");
//        }
//        switch (x){
//            case 3:
//                System.out.print("3");
//                break;
//            case 4:
//
//                break;
//            default:
//                System.out.print("default");
//        }

//        int a = 34;
//        double b = 33;
//        String str = "this is an string";
//
//        System.out.printf("this is an int %d and this is a double %f, last this is a string %s", a, b, str);

        int option = JOptionPane.showConfirmDialog(null,"content");

        System.out.println(option);
    }
}
