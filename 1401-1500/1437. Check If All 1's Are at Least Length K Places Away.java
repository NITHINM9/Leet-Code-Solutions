// 1437. Check If All 1's Are at Least Length K Places Away

// Given an binary array nums and an integer k, return true if all 1's are at least k places away from each other, otherwise return false.

// Example 1:

// Input: nums = [1,0,0,0,1,0,0,1], k = 2
// Output: true
// Explanation: Each of the 1s are at least 2 places away from each other.
// Example 2:


// Input: nums = [1,0,0,1,0,1], k = 2
// Output: false
// Explanation: The second 1 and third 1 are only one apart from each other.
 

// Constraints:

// 1 <= nums.length <= 105
// 0 <= k <= nums.length
// nums[i] is 0 or 1


//solution
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int j = 0 ,diff = 0, i = 0;
        int last = 0;
        while(i < nums.length){
            if(nums[i] == 1){
                last++;
                if(last > 1){
                    diff = i - j - 1;
                    j = i;
                    if(diff < k){
                        return false;
                    }
                }
                else{
                    j = i;
                }
            }
            i++;
        }
        return true;
    }
}