public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Introduzca un número entero (mayor que 0): "));

        int volteado = 0;
        int digito = 0;

        while (num > 0) {
            digito = num % 10;           

            if (digito == 0 || digito == 8) {
                num /= 10;
            }else {
                volteado = (volteado * 10) + digito;
                num /= 10;
            }            
            
        }
        digito = 0;
        while (volteado > 0) {
            digito = volteado % 10;
            num = (num * 10) + digito;
            volteado /= 10;
        }

        System.out.printf("Después de haber sido comido por el gusano nmérico se queda en %d.", num);
    }
}
