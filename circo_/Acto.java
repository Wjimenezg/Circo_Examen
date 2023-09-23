package circo_;

public class Acto {
    private String nombre;
    private double duracion;
    
    public Acto(String nombre, double duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    

    
}

class Boleto {
    private String tipo;
    private double precio;
    
    public Boleto(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }
    
    // Getters y setters
}