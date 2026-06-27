package DSAByHarsh.Day3;

public class MaxSub {
    public static void main(String[] args) {

        int[] arr = {4, 1, -3,-2,1};

        int max = Integer.MIN_VALUE;

                for(int i = 0; i< arr.length;i++){
                      int sum = 0;
                    for(int j = i ; j < arr.length;j++){

                        sum = sum + arr[j];

                        if(max < sum){
                            max = sum;
                        }

                    }

                }
        System.out.println(max);

    }
}
