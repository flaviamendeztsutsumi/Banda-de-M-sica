package dominio;
import java.io.Serializable;

public abstract class Participante implements Serializable {
    protected String nombre;
    protected String instrumento;

    public Participante(String nombre, String instrumento) {
        this.nombre = nombre;
        this.instrumento = instrumento; 
    }



    public String getNombre() {
        return nombre;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public abstract String toString();
}
