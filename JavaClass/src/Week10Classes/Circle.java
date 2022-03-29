package Week10Classes;
import java.util.Scanner;


public class Circle {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius * radius;
    }
}
