public class LargestStringAlbhabetically {
    public static void main(String[] args) {
        String str[] = {"apple", "banana", "cherry", "date", "elderberry"};
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].compareTo(largest) > 0) {
                largest = str[i];
            }
        }
        System.out.println("Largest string alphabetically: " + largest);
        

    }
}
