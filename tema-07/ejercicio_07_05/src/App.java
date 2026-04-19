public class App {
    public static void main(String[] args) throws Exception {
        int[] num = new int[8];

        System.out.println("Vaya introduciendo número enteros pulsando INTRO: ");
        for (int i = 0; i < 8; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println();

        int max = 0;
        int min = 0;

        for (int i = 0; i < 8; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }

        for (int i = 0; i < 8; i++) {
            if (num[i] == max) {
                System.out.println(num[i] + " máximo");
            }else if (num[i] == min) {
                System.out.println(num[i] + " mínimo");
            }else {
                System.out.println(num[i]);
            }
        }

    }
}
