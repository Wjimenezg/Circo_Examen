/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circo_;

import java.util.List;

class AdministradorBoletos {
    public void agregarBoleto(Boleto boleto, Localidad localidad) {
        // Obtener la lista de boletos disponibles en la localidad
        List<Boleto> boletosDisponibles = localidad.getBoletosDisponibles();
        
        // Agregar el boleto a la lista
        boletosDisponibles.add(boleto);
    }
    
    public void eliminarBoleto(Boleto boleto, Localidad localidad) {
        // Obtener la lista de boletos disponibles en la localidad
        List<Boleto> boletosDisponibles = localidad.getBoletosDisponibles();
        
        // Eliminar el boleto de la lista
        boletosDisponibles.remove(boleto);
    }
    
    // Otros métodos relacionados con boletos
}