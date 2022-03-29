package J2Week5_2;
import java.lang.Comparable;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>{
    //construct object
    public ComparableRectangle(double h, double w){
        super(h, w);
    }

    public int compareTo(ComparableRectangle rectangle){
        if (getArea() > rectangle.getArea())
            return 1;
        else if (getArea() == rectangle.getArea())
            return 0;
        else
            return -1;
    }

    @Override // Implement the toString method in GeometricObject
    public String toString() {
        return "Width: " + getWidth() + " Height: " + getHeight() +
                " Area: " + getArea();
    }
}
