package DSAByHarsh.Day3;

public class SecondLarge {

    public static int isLarge(int n) {

        int d =0;
        int first = -1;
        int second = -1;

        while (n > 0) {

             d = n % 10;

            if (d > first) {
                second = first;
                first = d;

            } else if (d > second && d < first) {
                second = d;
            }


        }
        return d;
    }



    public static void main(String[] args) {
        int n = 14679;

        int result = isLarge(n);
        System.out.println(result);
    }
}

