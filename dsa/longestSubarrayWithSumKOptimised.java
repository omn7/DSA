class longestSubarrayWithSumKOptimised{
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,3,3};
        int left = 0;
        int currSum = 0;
        int maxlen = 0;
        int n = arr.length;
        int k = 6;


        for(int right = 0; right < n; right++ ){
            currSum += arr[right];
        
        while(left > k && left <= right){
            currSum-= arr[left];
            left++;
        }
        if(currSum == k){
            maxlen = Math.max(maxlen, right-left+1);
        }

        }
        System.out.println(maxlen);
    }
}