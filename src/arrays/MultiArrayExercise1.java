package arrays;
//two dimensiona array
public class MultiArrayExercise1 {
    public static void main(String[] args) {
        //multi dimension array [][]
        String[] person = {};//single array

        String [] [] people = {
                {"Mg Mg","Su Su"} ,//->row 0
                {"Aung Aung","Kyaw Kyaw"} ,//->row 1
                {"Ko Ko","Nyi Nyi","Oo Oo"} //row-> 2
        };
        /*
        mg mg -> row 0,0
        oo oo ->row 2,2
         */
        System.out.println(people[0][0]);
        System.out.println(people[1][1]);
        System.out.println(people[2][2]);
    }
}
