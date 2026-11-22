import java.util.Scanner;

public class Valoracio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer valoracio[] = new Integer[10];
        int totalPositivos = 0;
        int totalNegativos = 0;
        int totalNeutros = 0;

        /// INICIAMOS LA RECOGIDA DE DATOS
        for (int i = 0; i < valoracio.length; i++) {
            do {
                System.out.print("Introduixca valoraçio:  ");
                valoracio[i] = sc.nextInt();
                sc.nextLine();
                if ((valoracio[i] < -5) || (valoracio[i] > 5)) {
                    System.out.println("Valoracio fora de rango");
                }
            } while (valoracio[i] < -5 || valoracio[i] > 5);

            //// CLASIFICAMOS LOS DATOS
            if (valoracio[i] > 0) {
                totalPositivos += 1;
            } else if (valoracio[i] == 0) {
                totalNeutros += 1;
            } else {
                totalNegativos += 1;
            }
        }
        System.out.println();
        for (int i = 0; i < valoracio.length; i++) {
            if (valoracio[i] == -5) {
                System.out.println("Revisió urgent necessària en valoracio " + (i + 1));
                System.out.println();
            }
        }
        if (totalPositivos == valoracio.length) {
            System.out.println("EXCEL·LENT!");
            System.out.println();
        } else if (totalNegativos > 0) {
            System.out.println("Hi ha hagut valoracions negatives.");
            System.out.println();
        }
        System.out.printf("%-19s %5d%n", "Total Positivos:", totalPositivos);
        System.out.printf("%-19s %5d%n", "Total Neutros:", totalNeutros);
        System.out.printf("%-19s %5d%n", "Total Negativos:", totalNegativos);

        sc.close();
    }
}
