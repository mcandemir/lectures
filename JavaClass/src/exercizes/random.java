package exercizes;

import java.io.FilterOutputStream;

public class random {
    public static void main(String[] args){

        double max_f = 120.0, max_c = 40.0;
        while (max_c > 30.0){
            System.out.print(max_c + "\t" + celsiusToFahreneit(max_c));
            System.out.print("\t" + "|" + "\t");
            System.out.print(max_f + "\t" + fahreneitToCelsius(max_f) + "\n");
            max_c -= 1;
            max_f -= 10;
        }
    }

    public static double celsiusToFahreneit(double c){
        return (9.0 / 5.0) * c + 32;
    }

    public static double fahreneitToCelsius(double f){
        return (5.0 / 9.0) * (f - 32);
    }
}
