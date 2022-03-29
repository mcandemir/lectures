package J2Week4_1;

import util.Util;

public class Main {
    private final Shelf shelf = new Shelf();

    public static void main(String[] args){

        GeometricObject obj1 = new Circle(5);
        GeometricObject obj2 = new Rectangle(4, 5);

        displayGeometricObject(obj1);
        displayGeometricObject(obj2);


//        while(true){
//            ActiontMenu();
//        }
    }
    // copied --------------------------------------------------------
    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
        System.out.println("INFO: " + object);
    }
    // --------------------------------------------------------------

    public static GeometricObject ObjectMenu(){
        System.out.println("1-Circle\n2-Rectangle");
        int opt = Util.UserIntInput("opt: ");

        GeometricObject obj = null;
        if (opt == 1) {
            double r = Util.UserDoubleInput("radius: ");
            obj = new Circle(r);
        }
        else if (opt == 2) {
            double h = Util.UserDoubleInput("height: ");
            double w = Util.UserDoubleInput("width: ");
            obj = new Rectangle(h, w);
        }
        return obj;
    }

    // --------------------------------------------------------------

    public static void ActiontMenu(){
        System.out.println("1-Create object\n2-Delete object\n3-Exit");
        int opt = Util.UserIntInput("opt: ");

        GeometricObject obj = ObjectMenu();


    }


}  // ===============================================================
