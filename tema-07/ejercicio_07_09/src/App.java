public class App {
    public static void main(String[] args) throws Exception {
        int[] num = new int[8];

        System.out.println("Introduzca 8 números enteros, pulse INTRO despues de cada número.");

        for (int i = 0; i < 8; i++){
            num[i] = Integer.parseInt(System.console().readLine());
        }
        
        for (int i = 0; i < 8; i++){
            if (num[i] % 2 == 0){
                System.out.println(num[i] + " par");
            }else{
                System.out.println(num[i] + " impar");
            }
        }
    }
}
