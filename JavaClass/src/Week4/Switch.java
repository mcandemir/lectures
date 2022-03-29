package Week4;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        while_loop:
        while(true){
            Scanner scanner = new Scanner(System.in);
            int opt = scanner.nextInt();

            switch (opt){
                case 1: System.out.println("** 1"); break;
                case 2: System.out.println("** 2"); break;
                default: System.out.println("** NONE"); break while_loop;
            }
        }


    }
}
