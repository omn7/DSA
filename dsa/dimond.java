class Main {
    public static void dimond(int n) {
        // Top Half
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom Half (Fixed)
        for (int i = n - 1; i >= 0; i--) { // Fix: Loop properly downward
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        dimond(5);
    }
}