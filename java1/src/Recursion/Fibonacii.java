package Recursion;

import java.util.Scanner;

public class Fibonacii {
    public static void fibonaci(int n , int i,int a, int b, int next){
        if(i < n) {
            return;
        }
        System.out.println(a+ " ");
        fibonaci(n,i+1,a,b,next);
        next = a + b;
        a = b;
        b = next;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int i =0;
        int next = a+b;
fibonaci(n,i,0,1,next);

    }
}
