package arrays;
//three dimension array
public class MultiArrayExercise2 {
    public static void main(String[] args) {
        String [][][] names = {
                //array 1
                {

                        {"Aung Aung","Mg Mg","Kyaw Kyaw"},
                        {"Moe Moe","Su Su","Lin LIn"},
                },
                {
                        {"Zaw Zaw","Khin Khin"},
                        {"Soe Soe","Ko Ko"}
                },
                {
                        {"Pa Pa","Phoo Phoo"},
                        {"Zin Zin","Aye Aye"}
                },

        };
        System.out.println(names[0][0][0]);
        System.out.println(names[2][0][1]);
    }
}
