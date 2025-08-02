class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int sum = 0;
        int max = Integer.MIN_VALUE;
        boolean hasPositive = false;
        
        
        
        for(int i=0; i<arr.length; i++){
            
           if(arr[i] >= 0){
               hasPositive = true;
           }
            
           sum = sum + arr[i];
           max = Math.max(sum, max);
           
           if(sum < 0){
               sum = 0;
           }
           
           
        }
        return hasPositive ? max : maxIntNegative(arr);
    }
    int maxIntNegative(int[] arr){
        int max =arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            
        }
        return max;
    }
}
