package controlflow;

public class Exercise6 {
    public static void main(String[] args) {
        /*for loop
        car speed -> start point // initial speed
        end point // ending point
        increment
         */
        //for loop
        //for(start point; end point; increment or decrement)
        //process
        for(int i = 0; i < 100; i++) {
            System.out.println("Number is " + i);
        }
    }
}

/*1.start point -> condition check StructureViolationException
2.process
3.increment or decrement
4.go back to end point condition if end point condition true it continues
5.if it reaches the required condition the process stops*/