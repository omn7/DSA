class SubarraySumEqualsKBruteforce{


    public static int subarraySum(int[] nums, int k){
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,2,4};
        int k = 3;
        int result = subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}