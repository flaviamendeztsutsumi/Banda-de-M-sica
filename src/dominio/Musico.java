package dominio;

import java.math.BigDecimal;

public abstract class Musico extends Participante {
    private String instrumento;

    public Musico(String nombre, String instrumento) {
        super(nombre, instrumento);  
        this.instrumento = instrumento;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public abstract String toString();
}
