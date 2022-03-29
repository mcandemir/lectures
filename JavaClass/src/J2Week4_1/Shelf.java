package J2Week4_1;
import java.util.ArrayList;

public class Shelf {
    public ArrayList<GeometricObject> objects = new ArrayList<GeometricObject>();

    public String toString(){
        String str = "";
        for (GeometricObject object : objects){
            str += object + "\n";
        }
        return str;
    }
}
