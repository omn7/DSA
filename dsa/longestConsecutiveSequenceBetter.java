import java.util.Arrays;

class longestConsecutiveSequenceBetter {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        Arrays.sort(nums);
        int lastCount = 0;
        int lastNum = Integer.MIN_VALUE;
        int longest = 1;

        for(int i=0; i<nums.length; i++){
            if(nums[i]-1 == lastNum){
                lastCount++;
                lastNum = nums[i];
            }
            else if(nums[i] != lastNum){
                lastCount = 1;
                lastNum = nums[i];
            }
            longest = Math.max(longest, lastCount);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums)); // Expected: 4 (1, 2, 3, 4)
    }
}
