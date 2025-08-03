// User function Template for Java

class bubblesortbykthterm {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int n = arr.length;
        
        // Bubble sort to sort the array
        for(int i = 0; i < n-1; i++) {
            boolean swapped = false;
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // If no swapping occurred, array is already sorted
            if(!swapped) {
                break;
            }
        }
        
        // Return the kth smallest element (1-indexed)
        return arr[k-1];
    }
}
