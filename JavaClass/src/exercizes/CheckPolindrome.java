package exercizes;
import java.util.Scanner;

public class CheckPolindrome {
    public static void main(String[] args){

        while(true){
            Scanner scanner = new Scanner(System.in);

            System.out.print("input: ");
            String string = scanner.next();
            boolean palindrome = true;

            int len = string.length();
            for (int i = 0; i < len / 2; i++)
                if (string.charAt(i) != string.charAt(len - 1 - i))
                    palindrome = false;

            System.out.println(palindrome);
        }
    }
}
