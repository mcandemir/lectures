package J2Week5_2;

public abstract class GeometricObject {
    private final java.util.Date dateCreated = new java.util.Date();

    protected GeometricObject(){
    }

    //abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();

}
