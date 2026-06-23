package DSAByHarsh.Day1;

public class pattern {
    public  static void main(String [] args){

        int n =5;
        int row = 1;
        int ss = 2*n-1;

        for(int i = 1; i <= 5; ++i){

            System.out.print("*");


            for(int j = 1; j<=i;j++){

             System.out.print(" ");
                System.out.print("*");


            }
            System.out.println("");
        }
    }
}
