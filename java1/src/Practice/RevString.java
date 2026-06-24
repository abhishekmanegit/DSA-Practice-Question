package Practice;

import java.util.Scanner;

public class RevString {

    public static void revString(char[] s){

        int l =0, r= s.length-1;

        while(l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
        char[] s = new char[size];

        for(int i = 0; i< s.length;i++){
            s[i] = sc.next().charAt(0);
        }

        revString(s);

        for (char c : s) {
            System.out.print(c);
        }

    }
}
