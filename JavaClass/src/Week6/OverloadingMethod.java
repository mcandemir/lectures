package Week6;
import java.util.Scanner;

public class OverloadingMethod {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.println();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.println(max(a, b));
        System.out.println(max((int)a, (int)b));
    }

    public static int max(int a, int b){
        System.out.println("Normal func");
        if (a > b)
            return a;
        else if (b > a)
            return b;
        else
            return 0;
    }

    public static double max(double a, double b){
        System.out.println("Overloaded");
        if (a > b)
            return a;
        else if (b > a)
            return b;
        else
            return 0.0;
    }
}
