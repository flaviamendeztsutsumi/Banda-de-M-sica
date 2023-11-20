package dominio;

public class MusicoSocio extends Musico {
    private int numeroSocio;

    public MusicoSocio(String nombre, String instrumento, int numeroSocio) {
        super(nombre, instrumento);
        this.numeroSocio = numeroSocio;
    }

    public String toString() {
        return getNombre() + ", " + getInstrumento() + ", número de socio: " + numeroSocio;
    }
}
