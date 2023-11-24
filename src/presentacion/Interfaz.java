package presentacion;

import dominio.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Interfaz {
    private BandaMusica bandaMusica;
    private Scanner scanner;

    public Interfaz() {
        bandaMusica = new BandaMusica("Banda de Música");
        scanner = new Scanner(System.in);
    }

    public void menuPrincipal() {
        System.out.println("========= Menú Banda de Música =========");
        System.out.println("|1. Agregar Director                    |");
        System.out.println("|2. Agregar Músico Socio                |");
        System.out.println("|3. Agregar Músico Refuerzo             |");
        System.out.println("|4. Mostrar Actuaciones                 |");
        System.out.println("|5. Salir                               |");
        System.out.print(" Elige una opción:");
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            menuPrincipal();
            String opcion = scanner.nextLine();

            if ("1".equals(opcion)) {
                agregarDirector();
                System.out.print("Datos del director: ");
            } else if ("2".equals(opcion)) {
                System.out.println("Datos del Músico socio");
                agregarMusicoSocio();
            } else if ("3".equals(opcion)) {
                System.out.println("Datos del Músico Refuerzo");
                agregarMusicoRefuerzo();
            } else if ("4".equals(opcion)) {
                mostrarActuaciones();
            } else if ("5".equals(opcion)) {
                continuar = false;
            } else {
                System.out.println("La opción que has elegido no existe.");
            }
        }
    }

    public void agregarDirector() {
        System.out.print("Nombre del director: ");
        String nombre = scanner.nextLine();
        Director director = new Director(nombre);
        Actuacion actuacion = obtenerActuacion();
        actuacion.agregarParticipante(director);
        System.out.println("Director añadido.");
    }

    public void agregarMusicoSocio() {
        System.out.print("Nombre del músico socio: ");
        String nombre = scanner.nextLine();

        System.out.print("Instrumento del músico socio: ");
        String instrumento = scanner.nextLine();

        System.out.print("Número de socio: ");
        int numeroSocio = Integer.parseInt(scanner.nextLine());

        MusicoSocio musicoSocio = new MusicoSocio(nombre, instrumento, numeroSocio);
        Actuacion actuacion = obtenerActuacion();
        actuacion.agregarParticipante(musicoSocio);

        System.out.println("Músico socio añadido.");
    }
    public void agregarMusicoRefuerzo() {

        System.out.print("Nombre del músico de refuerzo: ");
        String nombre = scanner.nextLine();

        System.out.print("Instrumento del músico de refuerzo: ");
        String instrumento = scanner.nextLine();

        System.out.print("Cantidad recibida por el músico de refuerzo: ");
        double cantidad = Double.parseDouble(scanner.nextLine());

        MusicoRefuerzo musicoRefuerzo = new MusicoRefuerzo(nombre, instrumento, cantidad);
        Actuacion actuacion = obtenerActuacion();

        actuacion.agregarParticipante(musicoRefuerzo);

        System.out.println("Músico de refuerzo añadido.");
    }



    public void mostrarActuaciones() {
        System.out.println("Banda compuesta por:");

        System.out.println(bandaMusica);
    }
    private Actuacion obtenerActuacion() {
        System.out.print("Fecha de la actuación (YYYY-MM-DD): ");
        LocalDate fecha = LocalDate.parse(scanner.nextLine());
        Actuacion actuacion = new Actuacion(fecha);
        bandaMusica.annadirActuacion(actuacion);
        return actuacion;
    }


}