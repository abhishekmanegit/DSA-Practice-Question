/*
Intersection of Two Arrays

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Test Case Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int n : nums1) set1.add(n);

        for(int n : nums2){
            if(set1.contains(n)) result.add(n);
        }

        int[] ans = new int[result.size()];
        int i = 0;
        for(int n: nums) ans[i++] = n;

        return ans;

    }}