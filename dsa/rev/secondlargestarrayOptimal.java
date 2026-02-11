class secondlargestarrayOptimal{
    public static void main(String[] args){
        int first_largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int[] nums = {1, 2, 4, 7, 7, 5};
        int n = nums.length;


        for(int i=0; i<n; i++){
            if(nums[i] > first_largest){
                second_largest = first_largest;
                first_largest = nums[i];
            }
        }
        System.out.print(second_largest);
    }
}