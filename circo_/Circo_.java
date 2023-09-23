
package circo_;

import java.util.*;

public class Circo_ {
    public static void main(String[] args) {
        // Crear actos
        Acto acto1 = new Acto("Acto 1", 1.5);
        Acto acto2 = new Acto("Acto 2", 2.0);

        // Crear boletos
        Boleto boletoNormal = new Boleto("Normal", 50.0);
        Boleto boletoVIP = new Boleto("VIP", 100.0);

        // Crear localidades
        Localidad localidad1 = new Localidad("Localidad 1");
        localidad1.agregarBoleto(boletoNormal);

        Localidad localidad2 = new Localidad("Localidad 2");
        localidad2.agregarBoleto(boletoNormal);
        localidad2.agregarBoleto(boletoVIP);

        // Administrar actos
        AdministradorActos adminActos = new AdministradorActos();
        adminActos.agregarActo(acto1);
        adminActos.agregarActo(acto2);

        // Administrar boletos
        AdministradorBoletos adminBoletos = new AdministradorBoletos();
        adminBoletos.agregarBoleto(boletoNormal, localidad1);
        adminBoletos.agregarBoleto(boletoNormal, localidad2);
        adminBoletos.agregarBoleto(boletoVIP, localidad2);

        // Ejemplo de cálculo de precio con descuento del 10%
        CalculadoraPrecioDescuento calculadoraDescuento = new CalculadoraPrecioDescuento(0.10);
        BoletosConPrecio boletosConDescuento = new BoletosConPrecio(calculadoraDescuento);

        double precioConDescuento = boletosConDescuento.obtenerPrecio(boletoNormal.getPrecio());

        // Mostrar precio de boletos
        System.out.println("Precio de boleto normal: $" + boletoNormal.getPrecio());
        System.out.println("Precio de boleto VIP: $" + boletoVIP.getPrecio());

        // Mostrar actos próximos
        System.out.println("Actos próximos:");
        List<Acto> actosDisponibles = adminActos.obtenerActosDisponibles();
        for (Acto acto : actosDisponibles) {
            System.out.println("Nombre: " + acto.getNombre() + ", Duración: " + acto.getDuracion() + " horas");
        }

    }
}


