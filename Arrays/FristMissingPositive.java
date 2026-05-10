/*
Q. First Missing Positive

Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 
Test Case:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

*/

public class FirstMissingPositive {
      public int firstMissingPositive(int[] nums) {
      
        int n = nums.length;

        for(int i = 0;i < n;i++){
            while(nums[i] > 0 && nums[i] < n && nums[nums[i]-1] = nums[i]){
                int correct = nums[i] -1;
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
        }
        for(i=0; i<n; i++){
            if(nums[i] != i+1) return i+1;
        }

        return n+1;

      }




    
}


