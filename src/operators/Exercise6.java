package operators;

public class Exercise6 {
    //ternary operators
    /*
    con ? result 1 : result 2;
    con true result 1
    con false result 2
     */
    public static void main(String[] args) {

        int x = 20;

        String answer =  x == 20 ? "Good to Go" : "Don't Go";
        System.out.println(answer);

        String answer1 = x != 20 ? "Good to Go" : "Don't Go";
        System.out.println(answer1);

    }
}
