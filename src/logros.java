public class logros {
    // Método para verificar y mostrar los logros
    public void mostrarLogros(int puntos) {
        System.out.println("\n--- Logros Desbloqueados ---");
        if (puntos >= 10) {
            System.out.println("Logro 'Aprendiz': ¡Has obtenido al menos 10 puntos!");
        }
        if (puntos >= 20) {
            System.out.println("Logro 'Un paso a la vez': ¡Has obtenido al menos 20 puntos!");
        }
        if (puntos >= 30) {
            System.out.println("Logro 'Empieza la genialidad': ¡Has obtenido al menos 30 puntos!");
        }
        if (puntos == 40) {
            System.out.println("Logro 'TERMINA LA GENIALIDAD': ¡Has obtenido todos los puntos posibles!");
        }
    }
}
