package DSAByHarsh.Day5;

import java.util.Arrays;

public class StrPalindrome {
    public static void main(String[] args) {
        String str = "aba";


        char ch[] = str.toCharArray();
        int i = 0;
        int j = ch.length-1;

        while(i < j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String str3 = new String(ch);
        System.out.println(ch);
        if(str3.equals(str)){
            System.out.println("String is Palindrome:");
        }
        else{
            System.out.println("NOT a palindrome:");
        }
    }
}
