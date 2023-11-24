package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actuacion {
    private LocalDate fecha;
    private List<Participante> participantes;

    public Actuacion(LocalDate fecha) {
        this.fecha = fecha;
        this.participantes = new ArrayList<>();
    }

    public void agregarParticipante(Participante participante) {
        participantes.add(participante);
    }

   
    public String toString() {
        String resultado = "Fecha de la actuación: " + fecha + "\n" ;
        for (Participante participante : participantes) {
                resultado += participante.toString() + "\n";
        }
        return resultado;
    }

    }

