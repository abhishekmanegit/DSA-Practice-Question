package Practice;

import java.util.*;
public class ArrSwap {

    public static void swap(int[] arr, int i1, int i2){

        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public static void main(String[] args){

        int arr[] = {1,3,5,7};
        swap(arr,1,3);

        System.out.println(Arrays.toString(arr));
    }
}
