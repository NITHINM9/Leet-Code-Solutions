// 2099. Find Subsequence of Length K With the Largest Sum
// Easy

// You are given an integer array nums and an integer k. You want to find a subsequence of nums of length k that has the largest sum.

// Return any such subsequence as an integer array of length k.

// A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

 

// Example 1:

// Input: nums = [2,1,3,3], k = 2
// Output: [3,3]
// Explanation:
// The subsequence has the largest sum of 3 + 3 = 6.
// Example 2:

// Input: nums = [-1,-2,3,4], k = 3
// Output: [-1,3,4]
// Explanation: 
// The subsequence has the largest sum of -1 + 3 + 4 = 6.
// Example 3:

// Input: nums = [3,4,3,3], k = 2
// Output: [3,4]
// Explanation:
// The subsequence has the largest sum of 3 + 4 = 7. 
// Another possible subsequence is [4, 3].
 

// Constraints:

// 1 <= nums.length <= 1000
// -105 <= nums[i] <= 105
// 1 <= k <= nums.length


//solution 1 - >
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] arr = new int[n][2];  // [value, index]

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // Sort by value descending
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        // Take top k elements (value, index)
        int[] selected = new int[k];
        for (int i = 0; i < k; i++) {
            selected[i] = arr[i][1];  // store index
        }

        // Sort selected indices to preserve order in original array
        Arrays.sort(selected);

        // Build result from original array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[selected[i]];
        }

        return result;
    }
}


//solution -2 

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        // Pair each element with its index
        int[][] pairs = new int[n][2]; // [num, index]
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        // Sort by value descending
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);

        // Take the top k elements and store their original indices
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            indices.add(pairs[i][1]);
        }

        // Sort indices to maintain original order
        Collections.sort(indices);

        // Build result
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = nums[indices.get(i)];
        }

        return res;
    }
}
