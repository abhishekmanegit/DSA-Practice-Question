package RePractice;

import java.util.Scanner;

public class fibonacii {

    public static void printFibonaci(int n){

        int a = 0, b = 1;

        for(int i = 0; i<n;i++){
            System.out.println(a +" ");

            int next = a+b;
            a = b;
            b= next;
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonaci(n);
    }
}
