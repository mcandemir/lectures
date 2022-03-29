package J2Week5_1;


// ???
public interface Edible2 extends Edible{
    default void howToEat2(){
        System.out.println("=How to Eat 2=");
    }
}
