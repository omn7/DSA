

class Subarray {
    public static void sub(int numbers[]) {

        int currSum = 0;
        int maxSum = Integer.MAX_VALUE;
        int prefix[] = new prefix[numbers.length];  //use to defined new array
        prefix[0] = numbers[0]; //we have set the value of the index of prefix equal to numbers

        for(int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];   //we use the formula in loop to calculate prefix of the number

        }

        for (int i = 0; i < numbers.length; i++) {
                int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end]: prefix[end]-prefix[start-1]; //ternary operator, 




                   if(currSum > maxSum){
                    maxSum = currSum;
                   }
                    
                    
                    
                }
               

                // for(int l = 1; l<numbers.length; l++){
                //     max = numbers[l];
                //     System.out.println("maxi" +max);
                }
            }
            System.out.println();
            
        }
        System.out.println(currSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 6, 7, 8, 9};
        sub(numbers);
    }
}
