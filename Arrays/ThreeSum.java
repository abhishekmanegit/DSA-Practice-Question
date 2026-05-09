/*
Q. 3SUM

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Test Case 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

*/

class ThreeSum { 
    public List<List<integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length-2; i++)
        {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;

            int lo = i+1;
            int hi = nums.length-1;

            while(lo < hi){
                int sum = nums[i] + nums[lo] + nums[hi];

                if(sum == 0) {
                    result.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                    while(lo < hi && nums[lo] == nums[lo+1]) lo++;
                    while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                    lo++;
                    hi--;

                }
                else if(sum < 0){
                    lo++;
                }
                else{
                    hi--;
                }
            }
        }

        return result;
    }

}



