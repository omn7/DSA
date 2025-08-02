public class bintodec {
     public static int bintodecimal(int binNum){
            int power = 0;
            int decimalNum = 0;
            while(binNum >0){
                int lastDigit = binNum % 10;
                decimalNum = decimalNum + (lastDigit * (int)Math.pow(2, power));
                power++;
                binNum = binNum / 10; // Reduce binNum to avoid infinite loop
            }
            return decimalNum;
        }
    public static void main(String[] args) {
      int yoo = bintodecimal(100); // Calling the function to convert binary to decimal
       System.out.println("Decimal number is: " + yoo); // Print the decimal number
    }
}