package controlflow;

import java.io.BufferedReader;
import java.io.InputStreamReader;

    public class Exercise4 {
        public static void main(String[] args) throws Exception{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter you salary:");
            int salary = Integer.parseInt(reader.readLine()); //String -> Integer type conversion

            if(salary >= 80000){
                System.out.println("Your salary is high");
            }
            else if(salary >= 50000 && salary < 80000){
                System.out.println("Your salary is middle");
            }
            else{
                System.out.println("Your salary is low");
            }
        }
    }
/*
Enter your salary
input -> 65000
condition
1st condition -> 65000 >= false skip
2nd condition -> 65000 true
 */

