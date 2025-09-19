package operators;

public class Exercise5 {
    public static void main(String[] args) {
        //&& ||
        int age = 20;
        int limit = 18;
        //condition 1 and condition 2
        boolean result = age == 20 && limit > age;
        System.out.println("This is Result :" + result);

        boolean result1 = age == 20 || limit > age;
        System.out.println("This is Result: " + result1);

        boolean result2 = limit > age || age == 20 || limit == 20 || age < 17;
        System.out.println("The result is: " + result2);

        boolean result3 = limit > age || age == 20 && limit == 20 || age < 17;
        System.out.println("The result is: " + result3);



    }
}
