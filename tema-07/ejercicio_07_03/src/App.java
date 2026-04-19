public class App {
    public static void main(String[] args) throws Exception {
        int[] num = new int[10];
        System.out.println("Por favor, introduzca 10 números enteros.");
        System.out.println("Pulsa la tecla INTRO después de cada número.");
        for (int i = 0; i < 10; i++){
            num[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println("Los números introducidos al reves son: ");
        for (int i = 9; i >= 0; i--){
            System.out.println(num[i]);
        }
    }
}
