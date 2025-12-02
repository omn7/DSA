class Solution {
	public void moveZeroes(int[] nums) {
		int n = nums.length;
		int left = 0;  // Points to position where next non-zero should go
        
		// First pass: move all non-zero elements to the left
		for (int i = 0; i < n; i++) {
			if (nums[i] != 0) {
				nums[left] = nums[i];
				left++;
			}
		}
        
		// Second pass: fill remaining positions with zeros
		for (int i = left; i < n; i++) {
			nums[i] = 0;
		}
	}
}

