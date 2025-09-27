package method;

public class CallStaticAndNonStatic {

    public static void main(String[] args) {
        theEnd();
    }

    //static method
    public static void task(){
        CallStaticAndNonStatic c = new CallStaticAndNonStatic();
        c.heynow();
    }
// non static
    public void heynow(){

    }
    public static void theEnd(){

    }

    public void hello(){

    }
}
