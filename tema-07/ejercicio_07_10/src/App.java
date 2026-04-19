public class App {
    public static void main(String[] args) throws Exception {
        int[] n = new int[20];
        int[] par = new int[20];
        int[] impare = new int[20];
        int i = 0;
        int pares = 0;
        int impares = 0;

        System.out.println("Array original:");
        for (i = 0; i < 20; i++){
            n[i] = (int)(Math.random() * 101);
            System.out.print(n[i] + " ");
        }

        System.out.println();
        for (i = 0; i < 20; i++){
            if (n[i] % 2 == 0){
                par[pares] = n[i];
                pares++;
            }
            else{
                impare[impares] = n[i];
                impares++;
            }
        }
        System.out.println("Array conm pares al principio:");
        for (i = 0; i < pares; i++){
            System.out.print(par[i] + " ");
        }
        for (i = 0; i < impares; i++){
            System.out.print(impare[i] + " ");
        }
    }
}
