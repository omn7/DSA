public class removeDuplicatesOptimalWay{
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,4};
        
        int index = 1;

        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[index] = arr[i]; 
                index++;

            }
        }
        System.out.println(index);


    }
}