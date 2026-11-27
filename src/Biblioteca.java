import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate avui = LocalDate.now();

        final double RECARREC = 0.5;
        long retraso = 0;
        double recarrec = 0;
        double totalRecarrec = 0;
        int llibreRetrasat = 0;
        int totalPrestats = 0;

        // ENTRADAS USUARIO
        while (true) {

            System.out.println();
            System.out.print("Introduixca el codi del llibre o (fi) per acabar:   ");
            String codi = sc.nextLine();

            if (codi.equalsIgnoreCase("fi")) {
                break;
            }
            // RECOGEMOS DATOS
            System.out.print("Introduixca el titol del llibre: ");
            String titol = sc.nextLine();
            System.out.print("Dia de devolucio prevista:       ");
            int dia = sc.nextInt();
            System.out.print("Mes:                             ");
            int mes = sc.nextInt();
            System.out.print("Año:                             ");
            int any = sc.nextInt();
            sc.nextLine();

            // RESUMEN Libro

            System.out.printf("%-33s%s%n", "Codigo: ", codi);
            System.out.printf("%-33s%s%n", "Titulo: ", titol);
            System.out.printf("%-33s%s%n", "Fecha de entrega: ", dia + "/" + mes + "/" + any);
            System.out.printf("%-33s%s%n", "Data actual: ", avui);

            // CALCULAMOS RETRASOS
            // Añadimos los datos de fecha
            LocalDate devolucioPrevista = LocalDate.of(any, mes, dia);

            if (avui.isAfter(devolucioPrevista)) {
                retraso = ChronoUnit.DAYS.between(devolucioPrevista, avui);
                recarrec = retraso * RECARREC;

                // Sumamos cantidad de libros y deuda para resumen posterior.
                llibreRetrasat += 1;
                totalRecarrec += recarrec;

                System.out.println();
                System.out.printf("%35d%s%n", retraso, " dies de retraso.");
                System.out.printf("%37.2f%s%n", recarrec, "€ de recarrec.");
            } else {
                System.out.print("No esta atrasat.");
            }
            totalPrestats += 1;

        }

        System.out.println();
        System.out.printf("%-32s %d%n", "Total llibres prestats: ", totalPrestats);
        System.out.printf("%-32s %d%n", "Total llibres atrasats: ", llibreRetrasat);
        System.out.printf("%-32s %.2f%n", "Total recarrecs: ", totalRecarrec);
        sc.close();
    }

}
