import java.util.Arrays;

class longestConsecutiveSequenceBrute {
    // Linear search function to check if an element exists in the array
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        int maxLen = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int length = 1;
            
            // In brute force, for each element, we check if the consecutive next number exists
            while (linearSearch(nums, current + 1)) {
                current += 1;
                length += 1;
            }
            maxLen = Math.max(maxLen, length);
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums)); // Expected: 4 (1, 2, 3, 4)
    }
}
