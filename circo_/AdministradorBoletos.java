
package circo_;

import java.util.List;

class AdministradorBoletos {
    public void agregarBoleto(Boleto boleto, Localidad localidad) {
     
        List<Boleto> boletosDisponibles = localidad.getBoletosDisponibles();
        
        boletosDisponibles.add(boleto);
    }
    
    public void eliminarBoleto(Boleto boleto, Localidad localidad) {

        List<Boleto> boletosDisponibles = localidad.getBoletosDisponibles();
        

        boletosDisponibles.remove(boleto);
    }

}