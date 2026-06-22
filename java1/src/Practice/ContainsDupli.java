package Practice;

import java.util.Arrays;

public class ContainsDupli {
    public static boolean contain(int[] nums){

        Arrays.sort(nums);

        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i + 1]) return true;
        }

        return false;
    }

    public static void main(String[] args){

        int[] nums = {1 ,3,4,1};

        System.out.println(contain(nums));
    }
}
