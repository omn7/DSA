import java.util.*;

public class 3sumBrute{
	public List<List<Integer>> threeSum(int[] nums) {
		int n = nums.length;
		List<List<Integer>> store = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
						Collections.sort(triplet);
						if (!store.contains(triplet)) {
							store.add(triplet);
						}
					}
				}
			}
		}
		return store;
	}

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4}; // Example input
        List<List<Integer>> result = sol.threeSum(nums);
        System.out.println("Triplets that sum to zero: " + result);
    }
}
