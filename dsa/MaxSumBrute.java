class MaxSumBrute {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Solution solution = new Solution();
        int result = solution.maxSubArray(nums);
        System.out.println("Max Subarray Sum: " + result);
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0; 
        int maxi = nums[0];
        for(int i=0; i<nums.length; i++){

            sum+= nums[i];
            if(sum > maxi){
                maxi = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}