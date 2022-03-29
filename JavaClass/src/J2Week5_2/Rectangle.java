package J2Week5_2;

public class Rectangle extends GeometricObject{
    private double height, width;

    Rectangle(double h, double w){
        height = h; width = w;
    }

    //get attributes
    protected double getHeight(){ return height; }
    protected double getWidth(){ return width; }

    //implement abstract methods
    public double getArea(){
        return (height + width) * 2;
    }

    public double getPerimeter(){
        return height * width;
    }
}
