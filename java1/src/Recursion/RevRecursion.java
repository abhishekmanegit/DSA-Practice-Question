package Recursion;

import java.util.Arrays;

public class RevRecursion {

    public static void Rev(char[] c,int i,int j){
        if(i >= j){

            System.out.println(c);
            return;
        }


        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;

        Rev(c,++i,--j);

    }

    public static void main(String[] args) {
        String arr = "Abhishek";
        char[] c = arr.toCharArray();
        int i = 0;
        int j = arr.length()-1;
        Rev(c,i,j);

    }
}
