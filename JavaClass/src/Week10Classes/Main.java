package Week10Classes;
import util.Util;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            // init scanner
            System.out.print("radius: ");
            double radius = scanner.nextDouble();
            System.out.println();

            // init class
            Circle circle = new Circle(radius);

            // get circle data
            double cradius = circle.getRadius();
            double carea = circle.getArea();

            // roundoff
            cradius = Util.DoubleRoundTo2Digit(cradius, 3);
            carea = Util.DoubleRoundTo2Digit(carea, 2);

            // test method
            System.out.println("Radius: " + cradius);
            System.out.println("Area: " + carea);
        }
    }
}
