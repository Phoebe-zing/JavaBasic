package arrays;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        String[] cars = {"BMW","Mercedes","Supra","Mitsubishi","Land Cruiser","Honda"};

    /*    String[] copyCars = new String[5];

        System.arraycopy(cars, 1, copyCars, 0, 5);

        System.out.println(Arrays.toString(copyCars));

     */
//direct copy -> Arrays.copyOfRange (original arrays, start of index, end of index + 1)
        String[] copyCars = Arrays.copyOfRange(cars, 0,6);
        System.out.println(Arrays.toString(copyCars));

    }
}
