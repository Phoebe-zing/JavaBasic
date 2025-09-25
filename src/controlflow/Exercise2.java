package controlflow;

public class Exercise2 {
    /*
    if(condition){
    condition true -> this block work
    }
    else{
    condition false -> this block work
    }
     */
    public static void main(String[] args) {
        int examResult = 50;

        if(examResult >= 40) {
            System.out.println("You pass the exam");
        }
        else{
            System.out.println("You fail the exam");

        }
    }
}
