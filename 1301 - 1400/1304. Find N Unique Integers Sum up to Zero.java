// 1304. Find N Unique Integers Sum up to Zero

// Given an integer n, return any array containing n unique integers such that they add up to 0.

 

// Example 1:

// Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
// Example 2:

// Input: n = 3
// Output: [-1,0,1]
// Example 3:

// Input: n = 1
// Output: [0]
 

// Constraints:

// 1 <= n <= 1000


//solution 1 ->
class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int i = 0;
        int random = 1;
        if(n % 2 != 0){
            arr[0] = 0;
            i++;
        }
        while( i < n){
            arr[i] = random;
            arr[i+1] = -random;
            random++;
            i+=2;
        }
        return arr;
    }
}

//solution 2 ->
class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int num = 1;
        for (int i = 0; i < n / 2; i++) {
            arr[i] = num;
            arr[n - 1 - i] = -num;
            num++;
        }
        return arr;
    }
}
