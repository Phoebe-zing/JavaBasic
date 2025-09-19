package operators;

public class Exercise3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
//        a += --b;
//        System.out.println(a);
        a += b--;

        System.out.println(a);

        boolean single = true;
        boolean result = !single;
        System.out.println(result);
    }
}
