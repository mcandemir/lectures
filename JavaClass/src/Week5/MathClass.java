package Week5;
import java.util.Scanner;

public class MathClass {
    public static void main(String[] args){

        System.out.println(Math.sin(90));
        System.out.println(Math.toRadians(30));

        System.out.println(Math.exp(2));
        System.out.println(Math.log(2));

        System.out.println(Math.random());  //returns weird num
        System.out.println((int)(Math.random() * 10));  // returns int 0-9
        System.out.println(10 + (int)(Math.random() * 10));  // returns int 10-19

    }
}
