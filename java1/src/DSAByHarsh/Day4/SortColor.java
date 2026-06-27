package DSAByHarsh.Day4;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {

        int[] arr = {0,1,2,1,0,2,1};

        int l = 0;
        int h = arr.length -1;
        int idx = 0;

        while(idx <= h) {
            if(arr[idx] == 0) {
                int temp = arr[l];
                arr[l] = arr[idx];
                arr[idx] = temp;
                idx++;
                l++;
            }
            else if(arr[idx] == 2){
                int temp = arr[h];
                arr[h] = arr[idx];
                arr[idx] = temp;

                h--;
            }
            else {
                idx++;
            }
        }



        System.out.println(Arrays.toString(arr));
    }
}

//colorsort
//prdt except itself