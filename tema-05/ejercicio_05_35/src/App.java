public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Por favor Introduzca la altura de la pirámide: "));
        
        int piramide = 1;
        int i = 0;
        int espacios = 0;
        int interno = 0;

        if ((altura % 2 == 0) || (altura < 3)) {
            System.out.println("Datos incorrectos. Debe introducir una altura impar o mayor o igual a 3");
        }else {

            while (piramide <= altura ){

                if (piramide < (altura/2)){

                    for (i = 1; i < altura; i++) {
                        System.out.print("* ");
                        for (int j = 2; j < altura; j++) {
                            System.out.print("  ");
                        }
                        System.out.println("*");
                    }
                }
                piramide++;
                espacios--;
                interno += 2;
            }
        }
    }
}
