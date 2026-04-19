public class App {
    public static void main(String[] args) throws Exception {
        /* Con For */
        for (int i = 320; i >= 160; i -= 20) {
            System.out.print(i + " ");
        }
        System.out.println();
        /* Con While */
        int x = 320;
        while (x >= 160) {
            System.out.print(x + " ");
            x -= 20;
        }
        System.out.println();
        /* Con Do While */
        int y = 320;
        do {
            System.out.print(y + " ");
            y -= 20;
        } while (y >= 160);
    }
}
