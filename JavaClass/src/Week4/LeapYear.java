package Week4;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year;

        while (true){
            boolean leap = false;

            System.out.print("Year: ");
            year = scanner.nextInt();
            System.out.println();

            if (year % 400 == 0)
                leap = true;
            else if (year % 4 == 0 && year % 100 != 0)
                leap = true;

            System.out.println("Leap year: " + leap);
        }
    }
}
