package DSAByHarsh.Day3;

public class MaxNum {

    public static void main(String[] args) {

        int[] arr = {3, 1, 2,1,3,5};
        int max = 0;
        int currFrq;
        int ans =-1;
        int count = 0;
        for(int i = 0; i< arr.length;i++){

            for(int j = i+1;j < arr.length;j++){
                currFrq=1;

                if(arr[i] == arr[j]) {
                    currFrq++;
                }
                  if(currFrq > max) {
                      max = currFrq;
                      ans = arr[i];
                  }


            }


        }
        System.out.println("Total Occurance "+max);
        System.out.println("The Number is "+ans);
    }
}
