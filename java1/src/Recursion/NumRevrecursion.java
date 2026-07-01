package Recursion;

import java.util.Arrays;

public class NumRevrecursion {

    public static void Rev(int[] c,int i,int j){
        if(i >= j){

            System.out.println(Arrays.toString(c));
            return;
        }


        int temp = c[i];
        c[i] = c[j];
        c[j] = temp;

        Rev(c,++i,--j);

    }

    public static void main(String[] args) {
        int[] c = {1,3,4,5};
        int i = 0;
        int j = c.length-1;
        Rev(c,i,j);

    }
}
