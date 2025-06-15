public class Main {

    public static void arraycc(int numbers[]) {
        int fnum = 0, lnum = numbers.length - 1;

        while (fnum < lnum) {
            // Proper swap logic
            int temp = numbers[fnum];
            numbers[fnum] = numbers[lnum];
            numbers[lnum] = temp;

            fnum++;
            lnum--;
        }
    }
    public static void pairs(int number[]){
        if(int i=0; i<number.length; i++){
            int crr = number[i];
            if(int j=i+1; j<number.length; j++ ){
                System.out.print("("+ crr + ","+ number[j]+")");
            }
        }
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};
         int number[] = {1, 2, 3, 4, 5, 6};
         pairs(number);
        arraycc(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
       
    }
}
