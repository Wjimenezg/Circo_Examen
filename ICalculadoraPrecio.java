
package circo_;


public interface ICalculadoraPrecio {
    double calcularPrecio(double base);
}

class CalculadoraPrecioNormal implements ICalculadoraPrecio {
    @Override
    public double calcularPrecio(double base) {
        return base;
    }
}

class CalculadoraPrecioDescuento implements ICalculadoraPrecio {
    private double descuento;

    public CalculadoraPrecioDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecio(double base) {
        return base - (base * descuento);
    }
}

class BoletosConPrecio {
    private ICalculadoraPrecio calculadoraPrecio;

    public BoletosConPrecio(ICalculadoraPrecio calculadoraPrecio) {
        this.calculadoraPrecio = calculadoraPrecio;
    }

    public double obtenerPrecio(double precioBase) {
        return calculadoraPrecio.calcularPrecio(precioBase);
    }
}