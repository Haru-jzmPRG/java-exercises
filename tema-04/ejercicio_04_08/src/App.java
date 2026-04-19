public class App {
    public static void main(String[] args) throws Exception {
        float n1;
        float n2;
        float n3;

        System.out.print("Introduce la primera nota: ");
        n1 = Float.parseFloat(System.console().readLine());
        System.out.print("Introduce la segunda nota: ");
        n2 = Float.parseFloat(System.console().readLine());
        System.out.print("Introduce la tercera nota: ");
        n3 = Float.parseFloat(System.console().readLine());

        float media = (n1 + n2 + n3) / 3;
        System.out.printf("La media es %.2f\n", media);

        if (media < 5) {
            System.out.println("Insuficuiente");
        } else if (media >= 5) {
            System.out.println("Suficiente");
        } else if (media >= 7) {
            System.out.println("Bien");
        } else if (media >= 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");    
        }    
        
    }
}


