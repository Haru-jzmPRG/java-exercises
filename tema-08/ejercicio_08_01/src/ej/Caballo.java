package src.ej;
public class Caballo {

    String nombre;

    public Caballo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void Camina() {
        System.out.println("Tocotoc tocotoc tocotoc");
    }

    public void Comer() {
        System.out.println("Ñam ñam ñam");
    }

    public void Sonido() {
        System.out.println("Hiiiiiiieeeeee");
    }

}
