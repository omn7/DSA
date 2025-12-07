
import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsKUsingOptimal {

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> seenPrefixSums = new HashMap<>();
        // Prefix sum 0 appears once before we start (helps subarrays from index 0)
        seenPrefixSums.put(0, 1);

        int currentSum = 0;
        int result = 0;

        for (int num : nums) {
            currentSum += num;

            int needed = currentSum - k;
            if (seenPrefixSums.containsKey(needed)) {
                result += seenPrefixSums.get(needed);
            }

            seenPrefixSums.put(currentSum, seenPrefixSums.getOrDefault(currentSum, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        SubarraySumEqualsKUsingOptimal sol = new SubarraySumEqualsKUsingOptimal();

        System.out.println(sol.subarraySum(new int[]{1, 1, 1}, 2));        // Output: 2
        System.out.println(sol.subarraySum(new int[]{1, 2, 3}, 3));        // Output: 2
        System.out.println(sol.subarraySum(new int[]{1, -1, 0}, 0));       // Output: 3
        System.out.println(sol.subarraySum(new int[]{3, 4, -7, 3}, 0));    // Output: 2
    }
}