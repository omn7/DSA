import java.util.ArrayList;

class leaderInARRAY {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
       ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        
        
        for(int i=0; i<n; i++){
            boolean leader = true;
            for(int j=i+1; j<n; j++){
                if(arr[j] > arr[i]){
                   leader = false;
                   break;
                }
            }
            if(leader == true){
                ans.add(arr[i]);
            }
        }
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