package controlflow;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise5{
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first floating decimal point number: ");
        double firstNumber = Double.parseDouble(reader.readLine());
        System.out.println("Enter second floating decimal point number");
        double secondNumber = Double.parseDouble(reader.readLine());

        firstNumber = Math.round(firstNumber*1000);
        double resultOne = firstNumber/1000;

        secondNumber = Math.round(secondNumber*1000);
        double resultTwo = secondNumber/1000;

        if(resultOne == resultTwo){
            System.out.println("Same numbers.");
        }
        else{
            System.out.println("Numbers are  different.");
        }
    }
}
