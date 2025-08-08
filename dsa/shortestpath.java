public class shortestpath {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        String key = "WNEENESENNN";

        for (int i = 0; i < key.length(); i++) {
            char dir = key.charAt(i);

            if (dir == 'W') {
                x -= 1;
            } else if (dir == 'N') {
                y += 1;
            } else if (dir == 'E') {
                x += 1;
            } else if (dir == 'S') {
                y -= 1;
            } else {
                System.out.println("Key not found");
            }
        }

        double distance = Math.sqrt((x * x) + (y * y));
        System.out.println("Shortest distance: " + distance);
    }
}
