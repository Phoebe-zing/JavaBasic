package method;
/*
creating method
1.method name
2.return type(void or no void)
3.acess modifiers(public, protected, default)
4.parameter (value)
5.method body{ }

Rule
start with small letter CamelCase
 */
public class CreatingMethod {
    public static void main(String[] args) {
     //class name obj var  new ()
        CreatingMethod cm = new CreatingMethod();
        System.out.println(cm.jobName());
        cm.task(3);

    }
//creating method with void no return value
   public void task(int i){
       System.out.println("Do website for CRM" + i);

   }
   //creating method without void and with return value its datatype
   public String jobName(){
        String job = "Software Developer";
        return job;
   }
}
