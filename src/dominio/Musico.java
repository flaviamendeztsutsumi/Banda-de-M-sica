package dominio;

import java.math.BigDecimal;

public abstract class  Musico extends  Participante {
   

    public Musico(String nombre, String instrumento) {
        super(nombre, instrumento);  
    }
    
    public abstract String toString();
}
