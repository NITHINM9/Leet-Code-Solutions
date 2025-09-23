// 3. Longest Substring Without Repeating Characters

// Given a string s, find the length of the longest substring without duplicate characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring


//solution 1 -> Sliding Window + HashSet
// Time Complexity: O(n)
class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Integer> set = new HashSet<>();
       int max=0, left = 0;
       for(int right=0; right<s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
           }
           set.add(s.charAt(right));
           max = Math.max(max, right-left+1);
       }
        return max;
    }
}

//solution 2 -> Sliding Window + HashMap
// Time Complexity: O(n)
class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character, Integer> map = new HashMap<>();
       int max=0, left = 0;
       for(int right=0; right<s.length(); right++){
           char c = s.charAt(right);
           if(map.containsKey(c)){
               left = Math.max(left, map.get(c)+1);
           }
           map.put(c, right);
           max = Math.max(max, right-left+1);
       }
        return max;
    }
}