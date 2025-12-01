public class RotateTheArrayByDburtef{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int d = 3;
        int n = arr.length;
        int[] temp = new int;
        d = d%n;
        for(int i=d; i<)
        
        
            }
}

public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;
        k = k % n;
        if (k == 0) return;

        int[] temp = new int[k];
        
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }
        
        
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        
      
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}