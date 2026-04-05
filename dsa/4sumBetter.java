import java.util.*;

public class FourSumBetter {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		int n = nums.length;
		Set<List<Integer>> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				HashSet<Long> seen = new HashSet<>();
				for (int k = j + 1; k < n; k++) {
					long sum = (long) nums[i] + nums[j] + nums[k];
					long needed = (long) target - sum;
					if (seen.contains(needed)) {
						List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) needed);
						Collections.sort(temp);
						set.add(temp);
					}
					seen.add((long) nums[k]);
				}
			}
		}
		return new ArrayList<>(set);
	}

	public static void main(String[] args) {
		FourSumBetter sol = new FourSumBetter();
		int[] nums = {1, 0, -1, 0, -2, 2}; // Example input
		int target = 0;
		List<List<Integer>> result = sol.fourSum(nums, target);
		System.out.println("Quadruplets that sum to target: " + result);
	}
}
