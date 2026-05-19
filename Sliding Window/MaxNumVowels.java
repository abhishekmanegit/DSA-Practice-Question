/* 

Maximum Number of Vowels in a Substring of Given Length

Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

Test Case Example :

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.

*/

public class MaxNumVowels{
    public int maxVowels(String s, int k){

        Set<Character> Vowels = Set.of('a','e','i','o','u');

        int count = 0;

        for(int i = 0;i < k ; i++){
            if(Vowels.contains(charAt(i))) count++;

        }

        for(int i = k; i < s.length;i++){
            if(Vowels.contains(charAt(i))) count++;
            if(Vowels.contains(charAt(i - k))) count--;
            max = Math.max(max,count);
        }

        return max;
    }
}