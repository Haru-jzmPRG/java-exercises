public class App {
    public static void main(String[] args) throws Exception {
        int i = 4; /* Máximo de intentos */
        boolean codigo = false; /* Variable para comprobar si la clave es correcta */

        do {

            int clave = Integer.parseInt(System.console().readLine("Introduzca la clave numérica: ")); /* Introducir clave por teclado */

            if (clave == 8888) { /* Clave correcta */
                codigo = true; /* La variable se intercambia de valor */
            } else {
                 System.out.println("Clave incorrecta."); /* Se equivocan de clave */
            }
            i--; /* Decrementa el número de intentos */
        } while ((i > 0) && (!codigo)); /* Mientras queden intentos y la clave no sea correcta */
        if (codigo) {
            System.out.println("Ha abierto la caja fuerte."); /* Clave correcta */
        } else {
            System.out.println("Lo siento, ha agotado las 4 oportunidades."); /* Se acaban los intentos */
        }
    }
}
