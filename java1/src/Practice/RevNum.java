package Practice;

import java.util.Scanner;

public class RevNum {
    public static int revNum(int x) {

        int rev = 0;
        while (x != 0) {
            int d = x % 10;

            rev = rev * 10 + d;
            x = x / 10;

            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) return 0;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(revNum(x));

    }
}
