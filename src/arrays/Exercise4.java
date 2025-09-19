package arrays;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};//original array
        int[] copyNumbers = new int [6];//determine copy array for original
        // numbers , index 1, index 4, copyNumbers, 0
        //System.arraycopy(name of original array,start to original index, name of copy array, start of copy array position, length of array to copy)
        System.arraycopy(numbers, 0, copyNumbers, 0, 6);
        System.out.println(Arrays.toString(copyNumbers));//Arrays.toString


    }
}
