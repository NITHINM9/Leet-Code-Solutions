// 1749. Maximum Absolute Sum of Any Subarray
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// You are given an integer array nums. The absolute sum of a subarray [numsl, numsl+1, ..., numsr-1, numsr] is abs(numsl + numsl+1 + ... + numsr-1 + numsr).

// Return the maximum absolute sum of any (possibly empty) subarray of nums.

// Note that abs(x) is defined as follows:

// If x is a negative integer, then abs(x) = -x.
// If x is a non-negative integer, then abs(x) = x.
 

// Example 1:

// Input: nums = [1,-3,2,3,-4] 
// Output: 5
// Explanation: The subarray [2,3] has absolute sum = abs(2+3) = abs(5) = 5.
// Example 2:

// Input: nums = [2,-5,1,-4,3,-2]
// Output: 8
// Explanation: The subarray [-5,1,-4] has absolute sum = abs(-5+1-4) = abs(-8) = 8.
 

// Constraints:

// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104


// solution - >

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = nums[0];
        int cur = nums[0];
        for(int i = 1; i < nums.length; i++){
            cur = Math.max(nums[i] ,nums[i] + cur);
            max = Math.max(max , cur);
        }
        
        cur = nums[0];
        int min = nums[0];
        for(int i = 1; i < nums.length; i++){
            cur = Math.min(nums[i] ,nums[i] + cur);
            min = Math.min(min , cur);
        }
        
        return Math.max(max, -min);
    }
}