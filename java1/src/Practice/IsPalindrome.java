package Practice;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class IsPalindrome {

    public static boolean isPali(int x){

        if(x < 0) return false;
        int og = x;

        int rev= 0;
        while(x != 0){
            int d = x%10;
            rev = rev * 10 + d;
            x = x/10;
        }

        return og == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPali(x));
    }
}
