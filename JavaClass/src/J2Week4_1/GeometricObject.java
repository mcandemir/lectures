package J2Week4_1;

public abstract class GeometricObject {

    private String color = "White";
    private final java.util.Date dateCreated;

    // construct a geo object by DEFAULT
    protected GeometricObject(){
        this.dateCreated = new java.util.Date();
    }

    // Construct a geo object with color
    protected GeometricObject(String color){
        this.dateCreated = new java.util.Date();
        this.color = color;
    }

    // return color
    public String getColor(){
        return color;
    }

    // return date created
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    // overwrite toString
    public String toString(){
        return "Color: " + this.color + "\n" +
                "Date: " + this.dateCreated + "\n";
    }

    // define abstract getArea
    public abstract double getArea();

    // define abstract getPerimeter
    public abstract double getPerimeter();

}
