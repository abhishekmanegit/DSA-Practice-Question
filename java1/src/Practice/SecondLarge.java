package Practice;

public class SecondLarge {
    public static int secondLarge(int[] arr){

        int largest = Integer.MIN_VALUE;
        int Slargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                Slargest = largest;
                largest = num;
            } else if (num < largest && num > Slargest) {
                Slargest = num;
            }
        }
        return Slargest;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,8,12,11};
        int result = secondLarge(arr);
        System.out.println(result);
    }

}
