package Week5;
import java.util.Scanner;

public class ReadCharFromConsole {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("input: ");
        String line = scanner.nextLine();
        System.out.println(line);

        System.out.println("input2: ");
        String test = scanner.nextLine();
        System.out.println(test);

        System.out.println("inputInt: ");
        int inttest = scanner.nextInt();
        System.out.println(inttest);


//        System.out.println(line);
//        System.out.println(test);

    }
}
