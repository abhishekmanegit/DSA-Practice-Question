package DSAByHarsh.Day3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrEg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = 0;

        int sum = 0;
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }
        System.out.print(sum + " ");


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println(max);

        int min = arr[0];


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];

            }
        }
        System.out.println(min);
    }


}

