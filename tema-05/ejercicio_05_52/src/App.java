public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Introduzca un número: "));

        int volteado = 0;
        int digito = 0;
        int digitos = 0;
        int ultimo = 0;
        

        while (num > 0) {
            digito = num % 10;
            volteado = (volteado * 10) + digito;
            digitos++;
            num /= 10;
        }

        digito = 0;
        int ultimoD = digitos;
        while (volteado > 0){
            
            if (ultimoD == digitos){
                ultimo = volteado % 10;
                digitos--;
            }else {
                digito = volteado % 10;
                num = (num * 10) + digito;
            }
            volteado /= 10;
        }
        num = (num * 10) + ultimo; 
        System.out.printf("El número resultado es %d.", num);
    }
}
