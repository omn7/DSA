public class linearsearch{
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};
        int n = arr.length;
        int k = 3;
        for(int i=0; i<n; i++){
            if(arr[i]==k){
                System.out.print("found at index  " + i);
            }
           
        } 
       
                 System.out.print("not found");
            
       
    }
}