public class App {
    public static void main(String[] args) throws Exception {
        int x;
        int y;

        x = 144;
        y = 999;

        System.out.printf("\nx = %d", x);
        System.out.printf("\ny = %d", y);
        System.out.printf("\nx + y = %d", (x + y));
        System.out.printf("\nx - y = %d", (x - y));
        System.out.printf("\nx / y = %.8f", ((float)x / (float)y));
        System.out.printf("\nx * y = %d", (x * y));
    }
}
