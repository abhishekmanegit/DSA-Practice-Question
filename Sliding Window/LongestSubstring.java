/*
 Q. Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

*/


class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for(int right = 0; right<s.length();right++){
            char c = s.charAt(right);

            if(map.containsKey(c) && map.get(c) >= left){
                left = map.get(c) + 1;
            }

            map.put(c,right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
        
    }

}