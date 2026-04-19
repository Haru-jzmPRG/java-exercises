public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Ingrese la altura de la figura: "));

        int delante = 1;
        int aux = altura - 1;
        

        for (int i = 1; i < altura; i++){
            int interno = aux - 2;            
            if (i == 1){
                for (int j = altura; j > 0; j--){
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int j = 0; j < delante; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = interno; k > 0; k--){
                System.out.print(" ");
            }
            System.out.println(aux > 1 ? "*" : "");
            delante++;
            aux--;

        }
    }
}
