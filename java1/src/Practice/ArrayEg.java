package Practice;

import java.util.Scanner;

public class ArrayEg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. Of rows:");
        int r = sc.nextInt();

        System.out.println("Enter No. of cols");
        int c = sc.nextInt();

        int[][] arr1 = new int[r][c];
        int[][] arr2 = new int[r][c];
        int[][] res = new int[r][c];


//

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                arr1[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = sc.nextInt();
            }
        }


        System.out.println("Addition is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = arr1[i][j] + arr2[i][j];
                System.out.println(res[i][j]);

            }

            System.out.println("Multiplication:");
            for (i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    res[i][j] = arr1[i][j] * arr2[i][j];
                    System.out.println(res[i][j]);

                }

                System.out.println("Division:");
                for (i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        res[i][j] = arr1[i][j] / arr2[i][j];
                        System.out.println(res[i][j]);

                    }

                    System.out.println("Substraction:");
                    for (i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            res[i][j] = arr1[i][j] - arr2[i][j];
                            System.out.println(res[i][j]);

                        }
                    }

                }
            }
        }
    }
}