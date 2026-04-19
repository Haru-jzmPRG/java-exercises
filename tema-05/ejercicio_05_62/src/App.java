public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Introduzca un número: "));
        int si = 0;
        int no = 0;
        int aux = num;

        while (aux > 0) {
            int digito = aux % 10;

            switch (digito) {
                case 3, 7, 8, 9:
                    si++;
                    break;

                default:
                    no++;
                    break;
            }

            aux = aux / 10;
        }

        if (si > no) {
            System.out.printf("El número %d es un número afortunado", num);
        } else {
            System.out.printf("El número %d no es un número afortunado", num);
        }

    }
}
