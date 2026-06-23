package DSAByHarsh.Day2;

import java.util.Scanner;

public class BostonNum {



    public static int isPrime(int n) {
        int i = 2;
        int Psum=0;
        while (n != 1) {

            if (n % i == 0) {
                 Psum += i;
                System.out.println(i + " ");
                n = n / i;
            } else {
                i++;
            }


        }
        return Psum;
    }

        public static int sumDigit( int n){


            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += d;
                n = n / 10;
            }

            return sum;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (isPrime(n) == sumDigit(n)) {
                System.out.println("Boston number");
            } else {
                System.out.println("Not a Boston Number");
            }
        }



}

