package src;
public class Coche extends Vehiculo {
    int recorreCoche;
    int kmCoche;

    public Coche() {
    }

    public int getrecorreCoche() {
        return recorreCoche;
    }

    public void setrecorreCoche(int recorreCoche) {
        super.setKilometrosRecorridos(recorreCoche);
        this.recorreCoche = recorreCoche;
    }

    public int getKmCoche() {
        return kmCoche;
    }

    public void setKmCoche(int kmCoche) {
        this.kmCoche = kmCoche;
        this.kmCoche += this.recorreCoche;
        super.setKilometrosRecorridos(this.kmCoche);
    }

    public void quemarRueda(){
        System.out.println("Estoy quemando rueda");
    }
    
}
