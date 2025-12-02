public class RotateTheArrayByDOptimalway{

    
    public static void reverse(int[] arr, int start, int end){
        while(start <= end){
            //start <= end it should not overlap as start is being++ and end is --
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =  temp;
            start++;
            end--;
            

        }
    }
    public static void rotateTheArray(int[] arr, int d, int n){
        d = d % n;  
        if (d == 0) return;
       
       reverse(arr, 0, d-1);
       reverse(arr, d, n-1);
       reverse(arr, 0, n-1);

    }
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7};
       int d = 3;
       int n = arr.length;
       rotateTheArray(arr, d, n);
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]);
       }
    }
}