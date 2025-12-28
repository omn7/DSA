class Removeduplicate{
    public static void main(String[] args) {
        int index = 1;
        int[] arr = {1,1,1,2,2,2,3,3,3};
        for(int i=1; i<arr.length; i++){
            if(arr[i]!= arr[i-1]){
                arr[index] = arr[i];
                index++;
            }
        }
        
    }
}