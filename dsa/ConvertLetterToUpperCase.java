public class ConvertLetterToUpperCase {
    public static void main(String[] args) {
        String str = "hello I am om";
        StringBuilder upperCaseStr = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        upperCaseStr.append(ch);

        for (int i = 1; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == ' ') {
                upperCaseStr.append(ch);
                if (i + 1 < str.length()) {
                    ch = Character.toUpperCase(str.charAt(i + 1));
                    upperCaseStr.append(ch);
                    i++; // Skip the next character as it's already processed
                }
            } else {
                upperCaseStr.append(ch);
            }
        }

        System.out.println("Converted string: " + upperCaseStr.toString());
    }
}
