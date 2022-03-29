package J2Week5_3;

public class Main {
    public static void main(String[] args){
        House house1 = new House(100, 125);
        House house2 = new House(101, 115);
        House house3 = new House(102, 135);
        House house4 = new House(103, 165);
        House house5 = new House(104, 145);
        House house6 = new House(105, 105);


        House[] houseArray = {
                house1,
                house2,
                house3,
                house4,
                house5,
                house6
        };

        java.util.Arrays.sort(houseArray);

        for (House house: houseArray){
            System.out.println(house);
        }


    }
}
