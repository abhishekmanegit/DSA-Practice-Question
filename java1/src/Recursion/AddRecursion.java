package Recursion;

public class AddRecursion {

    public static void main(String[] args) {
        int i =0;
        int n =5;
        int sum = 0;

        AddNumbers(i,n,sum);


    }

    public static void AddNumbers(int i,int n,int sum){
        if( i > n){
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        AddNumbers(i+1,n,sum);

    }
}
