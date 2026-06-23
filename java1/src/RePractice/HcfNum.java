package RePractice;

import java.util.Scanner;

public class HcfNum {
    public static int isHcf(int x, int y){

        int hcf =0;
        for(int i =1;i<=x && i<=y;i++ ){
            if(x % i == 0 && y % i == 0 ){
               hcf = i;
            }
        }
        return hcf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(isHcf(x,y));
    }
}
