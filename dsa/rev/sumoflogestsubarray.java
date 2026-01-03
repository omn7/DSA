class sumoflogestsubarray{
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,6,7,2,3};
        int sum = 0;
        int k=2;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++ ){
                sum+= arr[j];
                if(sum == k){
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}