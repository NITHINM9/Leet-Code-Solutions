// 1748. Sum of Unique Elements

// You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

// Return the sum of all the unique elements of nums.

 

// Example 1:

// Input: nums = [1,2,3,2]
// Output: 4
// Explanation: The unique elements are [1,3], and the sum is 4.
// Example 2:

// Input: nums = [1,1,1,1,1]
// Output: 0
// Explanation: There are no unique elements, and the sum is 0.
// Example 3:

// Input: nums = [1,2,3,4,5]
// Output: 15
// Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
 

// Constraints:

// 1 <= nums.length <= 100
// 1 <= nums[i] <= 100


//solution 1->
class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue().equals(1)){
                sum += entry.getKey();
            }
        }
        return sum;
    }
}

//solution 2->
class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101]; 
        for (int num : nums) {
            freq[num]++;
        }
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (freq[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
