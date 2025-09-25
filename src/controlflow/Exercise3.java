package controlflow;

public class Exercise3 {
    public static void main(String[] args) {
        int examResult = 80;

        if(examResult >= 0 && examResult <= 40){
            System.out.println("You fail");
        }
        else if(examResult >= 41 && examResult <= 79){
            System.out.println("You are merit");
        }
        else{
            System.out.println("You are a distiction student");
        }

    }
}
