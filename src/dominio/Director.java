package dominio;

public class Director extends Participante {
    public Director(String nombre) {
        super(nombre, "Sin instrumento"); 
    }

    public String toString() {
        return getNombre() + ", director";
    }
}

