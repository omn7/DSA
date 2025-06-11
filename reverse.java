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

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};
        arraycc(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
