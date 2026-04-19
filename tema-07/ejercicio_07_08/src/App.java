public class App {
    public static void main(String[] args) throws Exception {
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int[] temperatura = new int[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese la temperatura del mes " + mes[i] + ": ");
            temperatura[i] = Integer.parseInt(System.console().readLine());
        }

        for (int i = 0; i < 12; i++) {
            System.out.printf("%10s |",mes[i]);
            int aux = temperatura[i];
            for (int j = 0; j < aux; j++) {
                System.out.print("*");
            }
            System.out.println(" " + temperatura[i] + "°C");
        }
    }
}
