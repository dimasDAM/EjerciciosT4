import java.util.Scanner;

public class Despeses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        String[] despeses = { "Llum", "Aigua", "Menjar", "Altres" };
        Double[] cantitat = new Double[4];
        Double[] percentatge = new Double[4];

        /// RECOGEMOS DATOS
        for (int i = 0; i < despeses.length; i++) {
            System.out.printf("%-35s", "Introduixca despeses de " + despeses[i] + ":");
            cantitat[i] = sc.nextDouble();
            total += cantitat[i];
        }

        System.out.printf("%-20s %5.2f%n", "Total del mes: ", total);

        /// PORCENTAJES
        for (int i = 0; i < cantitat.length; i++) {
            percentatge[i] = (cantitat[i] * 100) / total;
        }
        /// RESUM

        for (int i = 0; i < cantitat.length; i++) {
            if (i != 3 || cantitat[3] > 0) {
                System.out.printf("Has gastat en %1s un total de %1.2f que es un %1.2f%% del presupuesto total%n",
                        despeses[i], cantitat[i], percentatge[i]);
            }

        }
        sc.close();
    }

}
