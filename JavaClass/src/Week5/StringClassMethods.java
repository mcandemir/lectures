package Week5;

import java.util.Locale;

public class StringClassMethods {
    public static void main(String[] args){

        // basics
        String msg = " This is a string ";
        String msg2 = "concatenated!";

        System.out.println(msg.length());
        System.out.println(msg.charAt(3));
        System.out.println(msg.concat(msg2));
        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.trim());
        System.out.println(msg);

        System.out.println();


        // compare
        String msg3 = "Case";
        String msg4 = "case";

        System.out.println(msg3.equals(msg4));
        System.out.println(msg3.equalsIgnoreCase(msg4));
        System.out.println(msg3.compareTo(msg4));
        System.out.println(msg4.compareTo(msg3));
        System.out.println(msg3.compareToIgnoreCase(msg4));


        // analyze
        String msg5 = "hey there";
        String msg6 = "Bruh";

        System.out.println(msg5.startsWith("hey"));
        System.out.println(msg6.endsWith("uh"));
        System.out.println(msg5.contains(" :"));


        // Substring
        String msgsub = msg5.substring(4);
        String msgsub2 = msg5.substring(2, 5);

        System.out.println(msgsub);
        System.out.println(msgsub2);


        // look for a specific char
        String fullname = "Mehmet Can Demir";
        System.out.println(fullname.indexOf(' '));





    }
}
