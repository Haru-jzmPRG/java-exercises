public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Ingrese la altura de la figura: "));


        for (int i = altura; i > 0; i--) {
            if (i == altura || i == 1){
                if (i == 1){
                    System.out.print("*");
                }else{
                    for (int j = 0; j <= (i -1); j++) {
                        System.out.print("*");
                    }
                }
            }else{
                System.out.print("*");
                for (int j = 0; j < (i -2); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
