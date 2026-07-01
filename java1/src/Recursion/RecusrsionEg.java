package Recursion;

public class RecusrsionEg {

    public static void print(int i, int n) {
        if (i >= n) {
            return;
        }
        System.out.println("HI");
        System.out.println(i);
        print(i + 1, n);

    }


    public static void main(String[] args) {
        print(0,3);
    }
}
