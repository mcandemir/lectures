package Week9;
import java.util.*;
import java.io.*;

public class Arrays {
    public static void main(String[] args) throws IOException{

        // init our array
        int SIZE = 10;
        int MIN = 5;
        int MAX = 15;
        double[] arr = initArray(SIZE, MIN, MAX);

        //return and print size
        System.out.println(getSize(arr));

        // show array
        showArray(arr);


        // filename
        String file_name = "array.txt";

        // write and read
        writeArrayToFile(arr, file_name);
        readArrayFile(file_name);


    }

    // init an array
    public static double[] initArray(int SIZE, int MIN, int MAX){
        double[] arr = new double[SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++){
            double n = random.nextDouble(MAX - MIN) + MIN;
            double roundOff = 100.0;
            arr[i] = Math.round(n*roundOff)/roundOff;
        }

        return arr;
    }

    // get the size of the array
    public static int getSize(double[] arr){
        return arr.length;
    }

    // print each number
    public static void showArray(double[] arr){
        for (double i:arr)
            System.out.print(i + " ");
        System.out.println();
    }

    // write array to a new txt file
    public static void writeArrayToFile(double[] arr, String file_name) throws IOException{
        File file = new File(file_name);
        PrintWriter writer = new PrintWriter(file_name);

        for (double i: arr){
            writer.print(i + " ");
        }

        writer.close();
    }

    // read the file
    public static void readArrayFile(String file_name) throws IOException{
        File file = new File(file_name);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            System.out.print(scanner.next() + " ");
        }
    }


    // =========== end of class ===========
}
