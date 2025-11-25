public class selsor{

    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 3, 8, 4};

    for(int i=0; i<arr.length-1; i++){
        int minPos = i;
        //firstly the minimum position is of index zero
        //element 
        for(int j=i+1; j<arr.length; j++){
            if(arr[j]<arr[minPos]){
                minPos = j;
            }
        }
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;


    }

    }
}