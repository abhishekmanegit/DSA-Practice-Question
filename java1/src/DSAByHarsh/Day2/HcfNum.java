package DSAByHarsh.Day2;

import java.util.Scanner;

public class HcfNum {
    public static void main(String [] args){
        int hcf = 1;

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i = 1; i<= x && i <= y;i++){

            if(x % i ==0 && y % i ==0){
                hcf = i;

            }


        }
        System.out.println(hcf+"");
    }
}
