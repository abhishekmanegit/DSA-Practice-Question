package RePractice;

public class SecondLargest {

    public static int isLarge(int[] arr) {

        int large = Integer.MIN_VALUE;
        int Slarge = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > large) {
                Slarge = large;
                large = num;
            } else if (num < large && num > Slarge){
                Slarge = num;

                
            }


        }
        return Slarge;

    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7};
        int result = isLarge(arr);
        System.out.println(result);
    }


}
