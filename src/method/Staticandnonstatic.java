package method;

public class Staticandnonstatic {

    public static void main(String[] args) {//static method

        Staticandnonstatic s = new Staticandnonstatic();
        Job();//no create obj
        s.task();//need create obj
    }

    public static void Job(){
        System.out.println("I am Phoebe");
    }
    public void task(){
        //non static method
        System.out.println("I am non static method");
    }
}
