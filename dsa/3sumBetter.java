import java.util.*;

public class ThreeSumBetter {
	public List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> ans = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			Set<Integer> seen = new HashSet<>();   
			for (int j = i + 1; j < nums.length; j++) {
				int third = -(nums[i] + nums[j]);
				if (seen.contains(third)) {
					List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
					Collections.sort(temp);        
					ans.add(temp);
				}
				seen.add(nums[j]);               
			}
		}
		return new ArrayList<>(ans);
	}

	public static void main(String[] args) {
		ThreeSumBetter sol = new ThreeSumBetter();
		int[] nums = {-1, 0, 1, 2, -1, -4}; // Example input
		List<List<Integer>> result = sol.threeSum(nums);
		System.out.println("Triplets that sum to zero: " + result);
	}
}
