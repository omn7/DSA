public class ndiv2 {
    public static void main(String[] args) {
        
        int arr[]  = {1,1,1,2,3};
        int n = arr.length;

        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j =0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
               
            }
            if(count>n/2){
                    System.out.println(arr[i]);
                }
      
        }
                
       
    }
}
