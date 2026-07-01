package Recursion;

public class RecusrsionEg {

    public static void print(int i, int n,int sum) {
        if (i >= n) {
            System.out.println(sum);
            return;
        }
//        System.out.println("HI");
//        System.out.println(i);
        print(i + 1, n,sum);
        sum = sum + i;


    }


    public static void main(String[] args) {
        print(0,3,0);
    }
}
