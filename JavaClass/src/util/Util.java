package util;
import java.util.Scanner;

public final class Util {
    public static double DoubleRoundTo2Digit(double num, int digit){
        double roundoff = (double)digit * 10.0;
        return ((double) Math.round(num) * roundoff) / roundoff;
    }

    // ---------------------------------------------------------------

    public static int UserIntInput(String message){
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print(message);

            try{
                return scanner.nextInt();
            }
            catch (RuntimeException ex){
                System.out.println("InputError: please enter an integer.\n");
            }
        }   // end of while
    }

    // ---------------------------------------------------------------

    public static double UserDoubleInput(String message){
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print(message);

            try{
                return scanner.nextDouble();
            }
            catch (RuntimeException ex){
                System.out.println("InputError: please enter a double value.\n");
            }
        }   // end of while
    }

}// end of Util
