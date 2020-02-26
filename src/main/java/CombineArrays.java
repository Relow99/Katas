import java.util.Arrays;

public class CombineArrays {
    public static void combine(int[] num1, int[] num2) {

        int[] combine = new int[num1.length + num2.length];

        for (int t = 0; t < num1.length*2; t+=2) {
                for (int s = 0; s < num1.length; s++){
                    combine[t]= num1[s];
                    t+=2;
                }
        }
        for (int t = 1; t < num2.length*2; t+=2) {
                for (int s = 0; s < num2.length; s++){
                    combine[t]= num2[s];
                    t+=2;
                }
        }
        System.out.println(Arrays.toString(combine));

    }
    public static void main (String[]args){

        combine(new int[]{1,2,3,4,5}, new int[]{21,22,23,24,25});
    }
}

