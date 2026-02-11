
import java.util.HashSet;

class removeduplicate1{
    public static void main(String[] args) {
         int[] nums = {0,0,1,1,1,2,2,3,3,4};
         HashSet<Integer> seen = new HashSet<>();
         int index = 0;
         for(int num: nums){
            if(!seen.contains(num))
            seen.add(num);
            nums[index] = num;
            index++;

         }
         System.err.println(seen);

    }
}