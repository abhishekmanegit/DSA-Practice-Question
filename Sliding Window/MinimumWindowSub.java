/*
Q. Minimum Window Substring

Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

 

Test Case 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
*/

class MinimunWindowSub {
    public String minWindow(String s, String t) {
        
        if(s.length() < t.length()) return "";

        int[] need = new int[128];
        int[] window = new int[128];

        for(char c : t.toCharArray()) need[c]++;

        int have =0;
        int required = 0;
        for(int x:need) if(x > 0) required++;

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        for(int right = 0; right < s.length();right++){
            char c = s.charAt(right);
            window[c]++;
            if(need[c] > 0 && window[c] == need[c]) have++;

            while(have == required ){
                if(right - left + 1 < minLen){
                    minLen = right -left +1;
                    minStart = left;
                }
                char l =s.charAt(left);
                window[l]--;
                if(need[l] > 0 && window[l] < need[l]) have--;
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart+minLen);


    }
}