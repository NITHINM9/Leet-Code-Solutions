// 3300. Minimum Element After Replacement With Digit Sum
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You are given an integer array nums.

// You replace each element in nums with the sum of its digits.

// Return the minimum element in nums after all replacements.

 

// Example 1:

// Input: nums = [10,12,13,14]

// Output: 1

// Explanation:

// nums becomes [1, 3, 4, 5] after all replacements, with minimum element 1.

// Example 2:

// Input: nums = [1,2,3,4]

// Output: 1

// Explanation:

// nums becomes [1, 2, 3, 4] after all replacements, with minimum element 1.

// Example 3:

// Input: nums = [999,19,199]

// Output: 10

// Explanation:

// nums becomes [27, 10, 19] after all replacements, with minimum element 10.

 

// Constraints:

// 1 <= nums.length <= 100
// 1 <= nums[i] <= 104

//solution :

class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            min = Math.min(min, sum);
        }
        return min;
    }
}
