public class App {
    public static void main(String[] args) throws Exception {
        int[] n = new int[100];
        int max = 0;
        int min = 0;

        for (int i = 0; i < 100; i++){
            n[i] = (int)(Math.random() * 501);
            System.out.print(n[i] + " ");

            if (n[i] > max){
                max = n[i];
            }
            if (min == 0 || n[i] < min){
                min = n[i];
            }
        }
        System.out.println();
        System.out.print("¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
        int opcion = Integer.parseInt(System.console().readLine());
        if (opcion == 1){
            for (int i = 0; i < 100; i++){
                if (n[i] == min){
                    System.out.print("**"+n[i]+"** ");
                }else{
                    System.out.print(n[i] + " ");
                }
            }
        }else{
            for (int i = 0; i < 100; i++){
                if (n[i] == max){
                    System.out.print("**"+n[i]+"** ");
                }else{
                    System.out.print(n[i] + " ");
                }
            }
        }
    }
}
