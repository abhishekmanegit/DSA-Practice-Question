/*
! Permutation in String

Q. Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Test Case Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

*/


public class PermutationString{
     public boolean checkInclusion(String s1, String s2) {
 if(s1.length() > s2.length()) return false;

 int k = s1.length();

 int[] s1Count = new int[26];
 int[] windowCount = new int[26];

 for(char c: s1.toCharArray()){
    s1Count[c - 'a']++;
 }

 for(int i = 0; i< s2.length();i++){
    windowCount[s2.charAt(i) - 'a']++;

    if(i >= k){
        windowCount[s2.charAt(i - k) - 'a']--;
    }


 
 if(Arrays.equals(s1Count, windowCount)) return true;
 }
  return false; 

     }
}