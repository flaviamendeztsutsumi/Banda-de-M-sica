package dominio;

public abstract class Participante {
    protected String nombre;
    protected String instrumento;

    public Participante(String nombre, String instrumento) {
        this.nombre = nombre;
        this.instrumento = instrumento;
    }


    public Participante(String nombre2) {
    }

    public String getNombre() {
        return nombre;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public abstract String toString();
}
