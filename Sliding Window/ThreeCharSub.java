/*
Number of Substrings Containing All Three Characters

q. Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.

 

Test Case Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 


*/

public class ThreeCharSub{
    public int numOfSub(String s){

        int[] last = {-1, -1, -1};
        int count = 0;

        for(int right = 0;right < s.length();right++){

            last[s.charAt(right) - 'a'] = right;

            count += Math.min(last[0], Math.min(last[1],last[2]))

            
        }

        return count;

    }
}