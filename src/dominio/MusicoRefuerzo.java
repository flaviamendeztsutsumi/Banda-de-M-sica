package dominio;

import java.math.BigDecimal;

public class MusicoRefuerzo extends Participante {
    private BigDecimal cantidad;

    public MusicoRefuerzo(String nombre, String instrumento, double cantidad) {
        super(nombre, instrumento);
        this.cantidad = BigDecimal.valueOf(cantidad);
    }

    public String toString() {
        return getNombre() + ", " + getInstrumento() + ", " + cantidad ;
    }
}
