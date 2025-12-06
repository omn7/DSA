class LongestSubarrayWithSumK{
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,5,6,7,8,8};
        int n = arr.length;
        int currSum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int start = i;

            for(int j=i; j<n; j++){
                int end = j;
                currSum = 0;

                for (int k = start; k <= end; k++) {
                    currSum = currSum + arr[k];
                }
                if(max < currSum){
                    max = currSum;

                }
            }
           
        }
         System.out.print("Sum of the max subarray: " + max);

    }
}