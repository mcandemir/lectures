package Week3;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double radius, area;
        double pi = 3.14159;

        System.out.print("radius: ");
        radius = scanner.nextDouble();

        area = radius * radius * pi;

        System.out.print("area: " + area);
    }
}
