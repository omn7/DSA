class MajorElement2Brute {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // WAIT! Did we already add this number to our answer? 
            // If yes, skip it! Don't do useless work!
            if (result.contains(nums[i])) {
                continue; 
            }
            
            int count = 0;
            // Go through the whole array and count this specific number
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            
            // Is the count big enough?
            if (count > n / 3) {
                result.add(nums[i]);
            }
        }
        return result;
    }
}