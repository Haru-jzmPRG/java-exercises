public class App {
    public static void main(String[] args) throws Exception {
        int altura = 0;

        do {            
            altura = Integer.parseInt(System.console().readLine("Introduzca la altura de los calcetines: "));
            if (altura < 4){
                System.out.println("La altura mínima es 4.");
            }
        }while (altura < 4);

        for (int i = 1; i <= altura - 2; i++){
            for (int j =1; j <= 3; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= 5; j++){
                System.out.print(" ");
            }
            for (int j =1; j <= 3; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=  2; i++){
            for (int j =1; j <= 6; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= 2; j++){
                System.out.print(" ");
            }
            for (int j =1; j <= 6; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
