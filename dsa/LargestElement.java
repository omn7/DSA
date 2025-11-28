class LargestElement {
    public static int largest(int[] arr) {
        // code here
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
