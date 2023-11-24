package dominio;

import java.util.ArrayList;
import java.util.List;

public class BandaMusica {
    private String nombre;
    private List<Actuacion> actuaciones;

    public BandaMusica(String nombre) {
        this.nombre = nombre;
        this.actuaciones = new ArrayList<>();
    }

    public void annadirActuacion(Actuacion actuacion) {
        actuaciones.add(actuacion);
    }

    public List<Actuacion> getActuaciones() {
        return actuaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BANDA DE MÚSICA VILLA +++" + nombre + "\n");
        for (Actuacion actuacion : actuaciones) {
            sb.append(actuacion).append("\n");
        }
        return sb.toString();
    }

    private StringBuilder sbappend(Actuacion actuacion) {
        return null;
    }

    public void agregarActuacion(Actuacion actuacion) {
    }
}
