package src;
public class Bicicleta extends Vehiculo {
    int recorreBici;
    int kmBici;

    public Bicicleta() {
    }

    public int getrecorreBici() {
        return recorreBici;
    }

    public void setrecorreBici(int recorreBici) {
        super.setKilometrosRecorridos(recorreBici);
        this.recorreBici = recorreBici;
    }

    public int getKmBici() {
        return kmBici;
    }

    public void setKmBici(int kmBici) {
        this.kmBici = kmBici;
        this.kmBici += this.recorreBici;
        super.setKilometrosRecorridos(this.kmBici);
    }

    public void hacerCaballito(){
        System.out.println("Estoy haciendo el cabalito");
    }

}
