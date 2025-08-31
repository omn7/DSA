public class trappingrainwater{
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,5,8};
        
        int leftmax[] = new int[arr.length];
        int rightmax[] = new int[arr.length];
        leftmax[0] = arr[0];
        rightmax[0] = arr[0];
        int trapwater = 0;

        for(int i=1; i<arr.length-1; i++){
            leftmax[i] = Math.max(arr[i], leftmax[i-1]);
        }
        for(int i=arr.length-2; i>=0; i--){
            rightmax[i] = Math.max(arr[i], rightmax[i+1]);
        }
        for(int i=0; i<arr.length; i++){
           
           int waterLevel = Math.min(leftmax[i], rightmax[i]);
            trapwater+= waterLevel-arr[i];
        }
        System.err.println(trapwater);
    }
}