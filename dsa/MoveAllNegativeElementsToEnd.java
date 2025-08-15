// User function Template for Java

class MoveAllNegativeElementsToEnd {
    public void segregateElements(int[] arr) {
        // Your code goes here
        int[] temp = new int[arr.length];
        int index = 0;
        
        for(int i=0; i<arr.length; i++){
          if(arr[i]>=0){
              temp[index++] = arr[i];
              
          }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                temp[index++] = arr[i];
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        
    }
}