import java.util.Scanner;
public class minijuego {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int puntos = 0; // Puntos acumulados por el jugador

            // Introducción
            System.out.println("¡Bienvenido a 'Aventura del Saber'!");
            System.out.println("En el mundo de Matelandia, el equilibrio numérico está en peligro.");
            System.out.println("Tú eres Milo, el joven explorador elegido para restaurar el orden.");
            System.out.println("Resuelve los desafíos matemáticos para avanzar y salvar Matelandia.\n");

            // Desafío 1: Suma
            System.out.println("--- Desafío 1: Suma ---");
            System.out.println("Milo encuentra un puente roto. Para repararlo, debe sumar dos números.");
            int num1 = 5;
            int num2 = 7;
            System.out.print("¿Cuánto es " + num1 + " + " + num2 + "? ");
            int respuesta1 = scanner.nextInt();

            if (respuesta1 == (num1 + num2)) {
                System.out.println("¡Correcto! El puente ha sido reparado.");
                puntos += 10;
            } else {
                System.out.println("Incorrecto. El puente sigue roto, pero Milo sigue intentándolo.");
            }

            // Desafío 2: Resta
            System.out.println("\n--- Desafío 2: Resta ---");
            System.out.println("Milo encuentra un cofre cerrado. Para abrirlo, debe resolver una resta.");
            int num3 = 15;
            int num4 = 8;
            System.out.print("¿Cuánto es " + num3 + " - " + num4 + "? ");
            int respuesta2 = scanner.nextInt();

            if (respuesta2 == (num3 - num4)) {
                System.out.println("¡Correcto! El cofre se abre y encuentras una pista.");
                puntos += 10;
            } else {
                System.out.println("Incorrecto. El cofre sigue cerrado, pero Milo no se rinde.");
            }

            // Desafío 3: Multiplicación
            System.out.println("\n--- Desafío 3: Multiplicación ---");
            System.out.println("Milo encuentra una puerta mágica. Para abrirla, debe resolver una multiplicación.");
            int num5 = 6;
            int num6 = 7;
            System.out.print("¿Cuánto es " + num5 + " * " + num6 + "? ");
            int respuesta3 = scanner.nextInt();

            if (respuesta3 == (num5 * num6)) {
                System.out.println("¡Correcto! La puerta se abre y Milo avanza.");
                puntos += 10;
            } else {
                System.out.println("Incorrecto. La puerta sigue cerrada, pero Milo sigue intentándolo.");
            }

            // Desafío 4: División
            System.out.println("\n--- Desafío 4: División ---");
            System.out.println("Milo encuentra un río. Para cruzarlo, debe resolver una división.");
            int num7 = 20;
            int num8 = 4;
            System.out.print("¿Cuánto es " + num7 + " / " + num8 + "? ");
            int respuesta4 = scanner.nextInt();

            if (respuesta4 == (num7 / num8)) {
                System.out.println("¡Correcto! Milo cruza el río y avanza.");
                puntos += 10;
            } else {
                System.out.println("Incorrecto. Milo no puede cruzar, pero sigue intentándolo.");
            }

            // Final del juego
            System.out.println("\n--- Fin de la Aventura ---");
            System.out.println("Milo ha completado los desafíos y ha restaurado el equilibrio en Matelandia.");
            System.out.println("Puntos totales: " + puntos + "/40");

            if (puntos == 40) {
                System.out.println("¡Felicidades! Has resuelto todos los desafíos correctamente.");
            } else {
                System.out.println("¡Buen intento! Sigue practicando para mejorar tus habilidades matemáticas.");
            }
            logros logros = new logros();
            logros.mostrarLogros(puntos);

            // Cerrar el scanner
            scanner.close();
        }
    }

