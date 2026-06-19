public class MaxInArray {

    public static int max(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
//        System.out.println("Maximum is:"+max);
        return max;
    }

    public static void main(String [] args){
        int arr[] = {1 , 5 , 7, 4};

        System.out.println(max(arr));

    }
}