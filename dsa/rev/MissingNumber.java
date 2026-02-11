class Solution {
    int missingNum(int arr[]) {
        // code here
        long sum = 0;
        long n = arr.length+1;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        long expected = n * (n + 1) / 2;
        return (int)(expected-sum);
    }
}