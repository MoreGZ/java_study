package java_study;

public class interface1 {
    public static void main(String[] args){
        Fruit apple = new Apple();
        System.out.println(apple.howToEat());
    }


}
interface Edible{
    public abstract String howToEat();
}

abstract class Fruit implements Edible{

}

class Apple extends Fruit {
    public String howToEat(){
        return "Apple: make apple cider";
    }
}