class leftrotatethearray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 3;
        d = d%n;

        int[] temp = new int[n];

        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }
        for(int i=d+1; i<n; i++){
            arr[i-d] = arr[i];
        }
        for(int i=n-d; i<n; i++){
            arr[i] = temp[i-(n-d)];
        }

        for(int num: arr){
            System.out.println(num);
        }
        
    }
}