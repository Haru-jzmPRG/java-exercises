public class App {
    public static void main(String[] args) throws Exception {
        int[] numero = new int [12];
        int[] cuadrado = new int [12];
        int[] cubo = new int [12];

        for (int i = 0; i < 12; i++) {
            numero[i] = (int) (Math.random() * 100);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * numero[i] * numero[i];
        }

        System.err.println("   n  |   n²  |  n³  |");
        System.err.println("----------------------");

        for (int i = 0; i < 12; i++) {
            System.err.printf("%3d | %5d | %6d |\n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
