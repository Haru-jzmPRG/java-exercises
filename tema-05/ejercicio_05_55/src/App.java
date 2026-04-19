public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Introduzca un número: "));

        int volteado = 0;
        int digito = 0;
        int digitos = 1;
        int aux = 0;
        

        while (num > 0) {
            digito = num % 10;            
            if (digitos == 1) {
                aux = (aux * 10) + digito;
            }else {
                volteado = (volteado * 10) + digito;
            }
            digitos++;
            num /= 10;            
        }
        digito = 0;
        while (volteado > 0) {
            digito = volteado % 10;
            aux = (aux * 10) + digito;
            volteado /= 10;
        }
        
         
        System.out.printf("El número resultado es %d.", aux);
    }
}