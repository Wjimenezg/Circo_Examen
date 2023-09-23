package circo_;


import java.util.ArrayList;
import java.util.List;

public class Localidad {
    private String nombre;
    private List<Boleto> boletosDisponibles;

    public Localidad(String nombre) {
        this.nombre = nombre;
        this.boletosDisponibles = new ArrayList<>();
    }

    public void agregarBoleto(Boleto boleto) {
        boletosDisponibles.add(boleto);
    }

    public List<Boleto> getBoletosDisponibles() {
        return boletosDisponibles;
    }
}