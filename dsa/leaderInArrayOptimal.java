import java.util.ArrayList;
import java.util.Collections;

class leaderInArrayOptimal {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int maxRight = Integer.MIN_VALUE;
        
        for(int i=n-1; i>=0; i--){
            if(arr[i] >= maxRight){
                ans.add(arr[i]);
                maxRight = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = leaders(arr);
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
