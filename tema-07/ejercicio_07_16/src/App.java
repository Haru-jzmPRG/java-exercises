public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[20];

        for (int i = 0; i < 20; i++) {
            nums[i] = (int) (Math.random() * 401);
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.println("¿Qué úmeros quieres resaltar?");
        System.out.println("1) los múltiplos de 5");
        System.out.println("2) los múltiplos de 7");
        int opccion = Integer.parseInt(System.console().readLine("Elija una opción: "));

        switch(opccion) {
            case 1: 
            for (int i = 0; i < 20; i++) {
                if (nums[i] % 5 == 0) {
                    System.out.print("[" + nums[i] + "] ");
                }else {
                    System.out.print(nums[i] + " ");
                }
            }
            break;
            case 2:
            for (int i = 0; i < 20; i++) {
                if (nums[i] % 7 == 0) {
                    System.out.print("[" + nums[i] + "] ");
                }else {
                    System.out.print(nums[i] + " ");
                }
            }
            break;
            default:
            System.out.println("Opción incorrecta");
        }
    }
}
