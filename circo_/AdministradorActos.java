
package circo_;

import java.util.ArrayList;
import java.util.List;

class AdministradorActos {
    private List<Acto> actosDisponibles;

    public AdministradorActos() {
        actosDisponibles = new ArrayList<>();
    }

    public void agregarActo(Acto acto) {
        actosDisponibles.add(acto);
    }

    public void eliminarActo(Acto acto) {
        actosDisponibles.remove(acto);
    }

    public List<Acto> obtenerActosDisponibles() {
        return actosDisponibles;
    }

   
}

