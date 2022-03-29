package J2Week4_1;

public class Circle extends GeometricObject {
    private double radius;

    // construct DEFAULT
    public Circle(){
    }

    // construct with radius
    public Circle(double radius){
        this.radius = radius;
    }

    // return area
    public double getArea(){
        return Math.PI * radius * radius;
    }

    // return perimeter
    public double getPerimeter(){ return 2 * Math.PI * radius; }
}
