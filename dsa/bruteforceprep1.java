public class bruteforceprep1 {
    public static void main(String[] args) {
        //what does a bruteforce do
        //its calculate max of sum of sub array

    int arr[] = {1,2,3,4,7,8,9};
    int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
        maxSum = arr[i] + arr[i+1];
        for(int j=0; j<arr.length; j++){
            int currentSum = 0;
            for(int k=i; k<=j; k++){
                currentSum += arr[k];
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }

            }
        }
        System.out.println(maxSum);

        }


    }
}
