package src.ej;
public class App {
    public static void main(String[] args) throws Exception {
        Caballo caballo1 = new Caballo("Avra");
        System.out.println("Hola, me llamo " + caballo1.getNombre());
        caballo1.Camina();
        caballo1.Sonido();

        Caballo caballo2 = new Caballo("Lykos");
        System.out.println("Hola, me llamo " + caballo2.getNombre());
        caballo2.Comer();
        caballo2.Camina();
    }
}
