package src;
public class Vehiculo {
    String vehiculoCreados;
    int kilometrosRecorridos;
    int kilometrosTotales;

    public Vehiculo() {        
    }

    public String getVehiculoCreados() {
        return vehiculoCreados;
    }

    public void setVehiculoCreados(String vehiculoCreados) {
        this.vehiculoCreados = vehiculoCreados;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public void setKilometrosTotales(int kilometrosTotales) {
        this.kilometrosTotales = kilometrosTotales;
    }
}
