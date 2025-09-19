package operators;

public class Exercise2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        ++ b;//+1
        a ++;//+1
        System.out.println(a);
        System.out.println(b);

        int c = 0;
        int d = 5;
        c += d++;
        System.out.println(c);
        int e = 0;
        int f = 5;
        e += ++f;
        System.out.println(e);
    }
}
