package J2Week5_1;

public class Main {
    public static void main(String[] args){
        Orange orange = new Orange();
        Apple apple = new Apple();
        Chicken chicken = new Chicken();
        Tiger tiger = new Tiger();

        System.out.println(orange.howToEat());

        System.out.println(apple.howToEat());

        chicken.sound();
        System.out.println(chicken.howToEat());

        tiger.sound();



    }
}
