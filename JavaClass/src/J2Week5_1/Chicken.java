package J2Week5_1;

public class Chicken extends Animal implements Edible {
    public void sound(){
        System.out.println("*Chicken sounds*");
    }

    public String howToEat(){
        return "*How to eat a Chicken*";
    }

}
