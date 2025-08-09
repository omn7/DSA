class StringCompress {
    public static void main(String args[]) {
        String word = "aaabbcccdd";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int count = 1;

            // Count consecutive same characters
            while (i < word.length() - 1 && ch == word.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append character
            sb.append(ch);

            // Append count if greater than 1
            if (count > 1) {
                sb.append(count);
            }
        }

        System.out.println(sb.toString());
    }
}
