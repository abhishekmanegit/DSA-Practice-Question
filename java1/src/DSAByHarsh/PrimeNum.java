package DSAByHarsh;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean t = true;
       for(int i = 2; i< num -1;i++) {
    if (num % 2== 0) {

        t = false;
        break;


    }

    System.out.println("Number is NOt Prime");
    return;
    }
        System.out.println("Number is Prime");
}


    }
