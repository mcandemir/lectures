package Week5;

public class CastingBetweenTypes {
    public static void main(String[] args){

        char ch = (char)65.25;
        System.out.println(ch);

        // explicit casting
        int i = (int)'A';
        System.out.println(i);

        // implicit casting
        char c = 97;
        System.out.println(c);


    }
}
