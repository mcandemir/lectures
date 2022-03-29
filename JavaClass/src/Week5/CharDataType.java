package Week5;

public class CharDataType {
    public static void main(String[] args){

        char letter = 'A';
        char numChar = '4';

        System.out.println(letter + "\n" + numChar);
        System.out.println();

        letter = '\u0041';  //unicode
        numChar = '\u0034';  //unicode

        System.out.println(letter + "\n" + numChar);
        System.out.println();

        /*
        The increment and decrement operators can also be used on
        char variables to get the next or preceding Unicode character.
        */

        letter = 'A';
        numChar = '4';

        letter++;
        numChar++;

        System.out.println(letter + "\n" + numChar);
        System.out.println();

        letter = '\u0041';  //unicode
        numChar = '\u0034';  //unicode

        letter++;
        numChar++;

        System.out.println(letter + "\n" + numChar);
        System.out.println();


    }
}
