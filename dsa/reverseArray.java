public class reverseArray{

    public static void reverseArrays(int[] arr, int f, int r){
        if(f>=r){
            return;  
        }
        else{
           int temp = arr[f];
           arr[f] = arr[r];
           arr[r] = temp;
           reverseArrays(arr, f+1, r-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,8,10};
        reverseArrays(arr, 0, arr.length-1);
        
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}