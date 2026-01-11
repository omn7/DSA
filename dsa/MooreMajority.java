

class MooreMajority{
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,3,5};
        int vote = 0;
        int curr = -1;
        int n = arr.length;

        for(int i=0; i<arr.length; i++){
            if(vote == 0 ){
                curr = arr[i];
                vote =  1;
            }
            else if(curr == arr[i]){
                vote++;
            }
            else{
                vote--;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == curr){
                vote++;
            }
            
        }
        if(vote > n/2 ){
                System.out.println(curr);
            }
    }
}