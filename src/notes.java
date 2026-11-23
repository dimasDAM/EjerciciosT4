import java.util.Scanner;

public class notes {
    public static void main(Scanner[] args) {
        Scanner sc = new Scanner(System.in);
        // CONSTANTES
        final double EXAMEN = 0.5;
        final double PRACTICA = 0.3;
        final double TREBALL = 0.2;
        int aprovat = 0;
        int suspens = 0;
        int excellent = 0;

        while (true) {
            System.out.println();
            double notaPonderada;
            System.out.print("Introduixca el nom de l'alumne: o (fi) per a continuar: ");
            String alumne = sc.nextLine();
            if (alumne.equalsIgnoreCase("fi")) {
                break;
            }
            System.out.println();
            System.out.print("Introudixca la nota del examen:          ");
            int examen = sc.nextInt();
            System.out.print("Introudixca la nota de la practica:      ");
            int practica = sc.nextInt();
            System.out.print("Introudixca la nota del treball:         ");
            int treball = sc.nextInt();
            sc.nextLine();

            // Calcule la nota ponderada
            notaPonderada = (examen * EXAMEN) + (practica * PRACTICA) + (treball * TREBALL);
            System.out.print("Nota ponderada:                          " + notaPonderada);

            if (examen < 4 || practica < 4 || treball < 4) {
                System.out.println("Suspens automátic");
                suspens++;

            } else if ((examen < 9 || practica < 9 || treball < 9)) {
                System.out.println("Aprovat");
                aprovat++;

            } else {
                System.out.println("Excel·lent");
                excellent++;

            }

            // RESUM
            System.out.println("Alumnes supesos:                 ");
            System.out.println("Alumne aprovats:                 ");
            System.out.println("Alumnes excel·lents:             ");

        }

    }

}
