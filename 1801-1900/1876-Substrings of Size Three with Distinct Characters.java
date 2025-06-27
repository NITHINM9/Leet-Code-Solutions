// 1876. Substrings of Size Three with Distinct Characters

// Easy

// Hint
// A string is good if there are no repeated characters.

// Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

// Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

// A substring is a contiguous sequence of characters in a string.

 

// Example 1:

// Input: s = "xyzzaz"
// Output: 1
// Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
// The only good substring of length 3 is "xyz".
// Example 2:

// Input: s = "aababcabc" 
// Output: 4
// Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc". 
// The good substrings are "abc", "bca", "cab", and "abc".
 

// Constraints:  

// 1 <= s.length <= 100
// s​​​​​​ consists of lowercase English letters.


//Solution 1: 

class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for(int i = 0 ; i < s.length() - 2; i++){
            if(chars[i] != chars[i + 1] && chars[i] != chars[i + 2] && chars[i +1] != chars[i + 2]){
                count++;
            }
        }
        return count;
    }
}


//solution 2:

class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            String substring = s.substring(i, i + 3);
            if (isGood(substring)) {
                count++;
            }
        }
        return count;
    }

    private boolean isGood(String substring) {
        return substring.charAt(0) != substring.charAt(1) &&
               substring.charAt(0) != substring.charAt(2) &&
               substring.charAt(1) != substring.charAt(2);
    }
}


// solution 3:
class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for(int i = 0 ; i <= s.length() - 3; i++){
            Set<Character> set = new HashSet<>();
            for (int j = i; j < i + 3; j++) {
                set.add(s.charAt(j));
            }
            if(set.size() == 3){
                count++;
            }
        }
        return count;
    }
}