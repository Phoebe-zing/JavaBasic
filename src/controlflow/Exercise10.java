package controlflow;

import javax.lang.model.type.DeclaredType;

public class Exercise10 {
    public static void main(String[] args) {
//        Declare Condition;
//        switch(condition){
//            case condition 1; break;
//            default -> execute
//            }

        int age = 18;
        switch (age){
            case 10:
                System.out.println("Your age is 10");break;

            case 11:
                System.out.println("Your age is 11");break;

            case 18:
                System.out.println("Your age is 18");break;

            default:
                System.out.println("I don't know your age");
        }
    }
}
