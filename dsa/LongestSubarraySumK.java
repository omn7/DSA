import java.util.*;

public class LongestSubarraySumK {
    
    public static int longestSubarrayWithSumK(int[] arr, int K) {
        // Map to store prefix sum and its first occurrence index
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        
        int prefixSum = 0;
        int maxLength = 0;
        
        // Initialize with prefix sum 0 at index -1
        // This handles cases where subarray starts from index 0
        prefixSumMap.put(0, -1);
        
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            
            // If (prefixSum - K) is seen before, then subarray from (prevIndex + 1) to i has sum K
            if (prefixSumMap.containsKey(prefixSum - K)) {
                int prevIndex = prefixSumMap.get(prefixSum - K);
                maxLength = Math.max(maxLength, i - prevIndex);
            }
            
            // Store the prefix sum only if not already present (we want earliest index)
            if (!prefixSumMap.containsKey(prefixSum)) {
                prefixSumMap.put(prefixSum, i);
            }
        }
        
        return maxLength;
    }

    // Test the function
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7, 5};
        int K1 = 12;
        System.out.println("Example 1: " + longestSubarrayWithSumK(arr1, K1)); // Output: 3 (subarray [2,3,7])

        int[] arr2 = {10, 5, 2, 7, 1, 9};
        int K2 = 15;
        System.out.println("Example 2: " + longestSubarrayWithSumK(arr2, K2)); // Output: 4 (subarray [5,2,7,1])

        int[] arr3 = {-1, 1, 0, 1, -1};
        int K3 = 0;
        System.out.println("Example 3: " + longestSubarrayWithSumK(arr3, K3)); // Output: 5 (entire array)

        int[] arr4 = {1, -1, 1, -1};
        int K4 = 0;
        System.out.println("Example 4: " + longestSubarrayWithSumK(arr4, K4)); // Output: 2
    }
}