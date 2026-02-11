class movezeroatlast{
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int left = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] !=0){
                nums[left] = nums[i];
                left++;
            }
        }
        for(int i=left; i<nums.length; i++){
            nums[i] = 0;

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}