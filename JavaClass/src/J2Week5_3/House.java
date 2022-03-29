package J2Week5_3;
import java.lang.Cloneable;
import java.lang.Comparable;

public class House implements Cloneable, Comparable<House>{
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id, double area){
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId(){ return id; }
    public double getArea(){ return area; }
    public java.util.Date getWhenBuilt(){ return whenBuilt; }

    @Override
    public Object clone(){
        try{
            return super.clone();
        }
        catch(CloneNotSupportedException ex){
            return null;
        }
    }

    @Override
    public int compareTo(House obj){
        if (getArea() > obj.getArea())
            return 1;
        else if (getArea() == obj.getArea())
            return 0;
        else
            return -1;
    }

    @Override
    public String toString(){
        return "ID: " + id +
                " Area: " + area +
                " Built: " + whenBuilt;
    }
}
