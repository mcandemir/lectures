package J2Week4_1;

public class Rectangle extends GeometricObject {
    private double height;
    private double width;

    // default constructor
    public Rectangle(){
    }

    // height, width constructor
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    // getArea
    public double getArea(){ return height * width; }

    // getPerimeter
    public double getPerimeter(){ return (height + width) * 2; }
}
