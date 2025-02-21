// Definición de la clase
public class prueba {

    // Atributos (variables de instancia)
    private String nombre;
    private int edad;

    // Constructor
    public prueba(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método de ejemplo
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}