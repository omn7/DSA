//this is done by using only one parameter
public class RecursionReverseNum{

    public static void revNum(int[] arr, int i){
        int n = arr.length;
        if(i >= n/2){
            return;
        }
        else{
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
         revNum(arr, i+1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,8,10};
        revNum(arr, 0);
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}