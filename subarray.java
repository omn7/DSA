class subarray {
    public static void sub(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int start = numbers[i];
             for(int j=i; j<numbers.length; j++ ){
            int end = numbers[j];
                for(int k=start; k<end; k++){
                    System.out.print( numbers[k]);
                }
                System.out.println();

        }
        System.out.println();
        }
       

    }
    public static void main(String[] args) {
        int numbers[] = {2,4,5,6,7,8,9};
        sub(numbers);

        
    }
}