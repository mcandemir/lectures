package Week6;
import java.util.Scanner;


public class DefiningMethods {

    // print name
    public static void showName(String name){
        System.out.println(name);
    }

    // take name input and return
    public static String myNameIs(){
        Scanner scan_name = new Scanner(System.in);
        System.out.print("Name: ");
        return scan_name.nextLine();
    }

    public static void main(String[] args){
        // register name
        String name = myNameIs();

        // print name
        showName(name);
    }
}
