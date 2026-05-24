/*
Q1. Limit Occurrences in Sorted Array©leetcode


You are given a sorted integer array nums and an integer k.

Return an array such that each distinct element appears at most k times, while preserving the relative order of the elements in nums.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2

Output: [1,1,2,2,3]©leetcode

*/

class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

        List<Integer> result = new ArrayList<>();
        int count = 1;
        result.add(nums[0]);

        for(int i = 1; i < nums.length;i++){

            if(nums[i] == nums[i -1 ]) count++;
            else count = 1;

            if(count <= k) result.add(nums[i]);
        }



        return result.stream().mapToInt(i -> i).toArray();©leetcode



    }}