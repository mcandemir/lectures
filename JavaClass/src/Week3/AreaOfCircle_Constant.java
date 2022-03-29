package Week3;
import java.util.Scanner;

public class AreaOfCircle_Constant {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double radius, area;
        final double pi = 3.14159;

        System.out.print("radius: ");
        radius = scanner.nextDouble();

        area = radius * radius * pi;
        System.out.print("area: " + (int)area);

        radius++;

        area = radius * radius * pi;
        System.out.print("\narea: " + (int)area);

    }
}
