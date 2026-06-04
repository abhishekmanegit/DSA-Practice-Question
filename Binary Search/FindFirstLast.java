/*
Q.  Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
*/

class FindFirstLast {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums,itarget);
        int last = findLast(nums,target);
        return new int[] {first, last};


    }
    private int findFirst(int nums[],int target){
        int lo = 0;
        int hi = nums.length -1;
        int result = -1;

        while(lo <= hi){
            int mid = lo +(hi - lo)/2;

            if(nums[mid] == target){
                result = mid;
                hi = mid - 1;
            }
            else if(nums[mid] > target){
                hi = mid -1;
            }
            else{
                lo = mid+ 1;
            }
        }

        return result;
    }

     private int findLast(int nums[],int target){
        int lo = 0;
        int hi = nums.length -1;
        int result = -1;

        while(lo <= hi){
            int mid = lo +(hi - lo)/2;

            if(nums[mid] == target){
                result = mid;
                lo = mid+1;
            }
            else if(nums[mid] > target){
                hi = mid -1;
            }
            else{
                lo = mid+ 1;
            }
        }

        return result;
    }

}
