public class rearrangeArray{
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int n = nums.length;
       
        int[] posti = new int[n/2];
        int[] neg = new int[n/2];
        
        int pIndex = 0;
        int nIndex = 0;

        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                posti[pIndex++] = nums[i];
            }
            else{
                neg[nIndex++] = nums[i];
            }
        }
        for(int i=0; i<n; i++){
          
            if(i%2 == 0){
                nums[i] = posti[i/2];
            }
            else{
                nums[i] = neg[i/2];
            }
        }
         for(int i=0; i<n; i++){
          
           System.out.println(nums[i]);
        }

 

    }
}