class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}

public class findMaxConsecutiveOnesArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test case 1
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Max consecutive ones in [1,1,0,1,1,1]: " + sol.findMaxConsecutiveOnes(nums1));
        
        // Test case 2
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Max consecutive ones in [1,0,1,1,0,1]: " + sol.findMaxConsecutiveOnes(nums2));
        
        // Test case 3
        int[] nums3 = {0, 0, 0};
        System.out.println("Max consecutive ones in [0,0,0]: " + sol.findMaxConsecutiveOnes(nums3));
    }
}
