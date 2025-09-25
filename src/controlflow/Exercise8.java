package controlflow;

public class Exercise8 {
    public static void main(String[] args) {
        /*initial point
        do{
        process
        initial point de / in
        } while (expression); condition check end point last
         */

        int i = 0; //initial point
        do {
            System.out.println("Number is " + i);//process
            i++;
        }
        while(i < 100); // end point

    }
}
