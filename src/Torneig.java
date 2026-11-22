import java.util.Scanner;

public class Torneig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jugador[] = new String[4];
        Integer puntuacion[] = new Integer[4];
        double total = 0;

        for (int i = 0; i < 4; i++) { // Iteramos sobre el Array
                                      // introduciendo datos en cada posicion.
            System.out.printf("Intoduzca nombre jugador nº " + (i + 1) + ": ");
            jugador[i] = sc.nextLine();
            System.out.print("Intoduzca puntuacion jugador nº " + (i + 1) + ": ");
            puntuacion[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < 4; i++) {
            total += puntuacion[i];

            System.out.printf("Jugador: %5s | Puntuacion: %3d", jugador[i], puntuacion[i]);

            if (puntuacion[i] >= 0 && puntuacion[i] < 5) {
                System.out.println(" Necesitas mejorar!");
            } else {
                System.out.println();
            }
        }
        // Formateo la salida:
        // · %8 Espacios reservados a la derecha
        // · .2f Dos decimales f(se espera un float)
        // · %n Salto de linea al terminar
        System.out.printf("Media de puntuacion: %8.2f%n", (total / 4));
        sc.close();
    }
}