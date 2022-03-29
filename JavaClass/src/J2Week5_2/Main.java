package J2Week5_2;

public class Main {
    public static void main(String[] args){
        ComparableRectangle rectanglePlus1 = new ComparableRectangle(5, 4);
        ComparableRectangle rectanglePlus2 = new ComparableRectangle(6, 6);
        ComparableRectangle rectanglePlus3 = new ComparableRectangle(7, 2);
        ComparableRectangle rectanglePlus4 = new ComparableRectangle(4, 3);
        ComparableRectangle rectanglePlus5 = new ComparableRectangle(5, 2);

        // rectangle can't be compared, it has no "Comparable" interface
        Rectangle rectangle = new Rectangle(3, 3);

        // test comparable
        System.out.println(
                rectanglePlus1.compareTo(rectanglePlus2)
        );

        // create array and sort
        ComparableRectangle[] rectanglePlusArray = {
                rectanglePlus1,
                rectanglePlus2,
                rectanglePlus3,
                rectanglePlus4,
                rectanglePlus5
        };
        java.util.Arrays.sort(rectanglePlusArray);

        // display sorted
        for (ComparableRectangle rectPlus: rectanglePlusArray){
            System.out.println(rectPlus);
        }
    }
}
