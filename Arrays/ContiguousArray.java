/*
Contiguous Array

Given a binary array nums, return the maximum length of a contiguous subarray with an 
equal number of 0 and 1.

 

Test Case Example 1:

Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
*/

class ContiguousArray{
    public int findMaxLength(int[] nums){

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        int max = 0;

        for(int i =0; i< nums.length;i++){
            if(nums[i] == 0){
                sum += -1;
            }
            else {
                sum += 1;
            }

            if(map.containsKey(sum)){

                max = Math.max(max, i - map.get(sum));
            }
            else{
                map.put(sum, i);
            }
        }
            return max;
            

    }
}