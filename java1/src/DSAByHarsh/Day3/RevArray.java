package DSAByHarsh.Day3;

import java.util.Arrays;

public class RevArray {
    public static void main(String[] args) {

        int[] arr = {1,45,67,8,9};
        int l =0;
        int r= arr.length-1;

        while(l < r){

            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
