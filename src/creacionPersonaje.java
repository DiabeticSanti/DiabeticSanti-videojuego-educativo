import java.util.Scanner;

public class creacionPersonaje {
    // Atributos del personaje
    private String aspectoFisico;
    private String colorCabello;
    private boolean tieneBarba;
    private int edad;

    // Constructor
    public creacionPersonaje(String aspectoFisico, String colorCabello, boolean tieneBarba, int edad) {
        this.aspectoFisico = aspectoFisico;
        this.colorCabello = colorCabello;
        this.tieneBarba = tieneBarba;
        this.edad = edad;
    }

    // Métodos getter y setter para cada atributo
    public String getAspectoFisico() {
        return aspectoFisico;
    }

    public void setAspectoFisico(String aspectoFisico) {
        this.aspectoFisico = aspectoFisico;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public boolean isTieneBarba() {
        return tieneBarba;
    }

    public void setTieneBarba(boolean tieneBarba) {
        this.tieneBarba = tieneBarba;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para mostrar la información del personaje
    public void mostrarInformacion() {
        System.out.println("\nInformación del personaje:");
        System.out.println("Aspecto Físico: " + aspectoFisico);
        System.out.println("Color de Cabello: " + colorCabello);
        System.out.println("Tiene Barba: " + (tieneBarba ? "Sí" : "No"));
        System.out.println("Edad: " + edad + " años");
        System.out.println("Tu personaje se llamará Milo para poder seguir con la trama :D");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("¡Crea tu personaje!");

        System.out.print("Ingresa el aspecto físico (ej: Alto, Delgado, Musculoso): ");
        String aspectoFisico = scanner.nextLine();

        System.out.print("Ingresa el color de cabello (ej: Negro, Rubio, Castaño): ");
        String colorCabello = scanner.nextLine();

        System.out.print("¿Tiene barba? (true/false): ");
        boolean tieneBarba = scanner.nextBoolean();

        System.out.print("Ingresa la edad: ");
        int edad = scanner.nextInt();

        // Crear el personaje con los datos ingresados
        creacionPersonaje personaje = new creacionPersonaje(aspectoFisico, colorCabello, tieneBarba, edad);

        // Mostrar la información del personaje
        personaje.mostrarInformacion();

        // Cerrar el scanner
        scanner.close();
    }
}