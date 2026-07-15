//import java.util.Arrays;
//package Leetcode.TwoPointers;
//
//class ThreeSumClose {
//    public int threeSumClosest(int[] nums, int target) {
//        Arrays.sort(nums);
//
//        int closestSum = nums[0]+nums[1]+ nums[2];
//
//        for(int i = 0;i<nums.length-2;i++){
//
//            int lo = i + 1;
//            int hi = nums.length-1;
//
//
//            while(lo < hi){
//
//                int sum = nums[i] + nums[lo] + nums[hi];
//
//                if(Math.abs(sum - target) < Math.abs(closestSum - target)){
//                    closestSum = sum;
//
//
//
//                }
//                else if(sum == target ){
//                    return sum;
//                }
//                else if(sum > target){
//                    hi--;
//                }
//                else{
//                    lo++;
//                }
//            }
//        }
//        return closestSum;
//    }
//}