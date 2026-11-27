import java.util.Scanner;

public class Botiga {
    public static void main(String[] args) {
        int taula = 100;
        int cadira = 100;
        int armari = 100;
        int preuTaula = 120;
        int preuCadira = 20;
        int preuArmari = 200;
        int total = 0;
        int codi;
        int productesAgotats = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Stock: ");
        System.out.printf("%30s %10d %s%n", "Codi (1): Taula.  Stock actual: ", taula, " taules.");
        System.out.printf("%30s %10d %s%n", "Codi (2): Cadira. Stock actual: ", cadira, " cadires.");
        System.out.printf("%30s %10d %s%n", "Codi (3): Armari. Stock actual: ", armari, " armaris.");

        do {

            System.out.println();
            System.out.print("Introduisxca codi (0 per sortir):         ");
            codi = sc.nextInt();
            sc.nextLine();

            switch (codi) {
                case 0:

                    break;

                case 1:
                    if (taula == 0) {
                        System.out.println();
                        System.out.println("STOCK ESGOTAT.");
                        System.out.println();
                        break;
                    }
                    System.out.print("Introduixca cantitat:    ");
                    int unitatsTaula = sc.nextInt();
                    if (unitatsTaula > taula) {
                        System.out.println();
                        System.out.println("STOCK INSUFICIENT.Tan sols pot demanar " + taula + " unitats");
                        System.out.println();
                        break;
                    }
                    total += unitatsTaula * preuTaula;
                    taula -= unitatsTaula;

                    break;

                case 2:

                    if (cadira == 0) {
                        System.out.println();
                        System.out.println("STOCK ESGOTAT.");
                        System.out.println();
                        break;
                    }
                    System.out.print("Introduixca cantitat:    ");
                    int unitatsCadira = sc.nextInt();

                    if (unitatsCadira > cadira) {
                        System.out.println();
                        System.out.println("STOCK INSUFICIENT. Tan sols pot demanar " + cadira + " unitats");
                        System.out.println();
                        break;
                    }
                    total += unitatsCadira * preuCadira;
                    cadira -= unitatsCadira;
                    break;

                case 3:
                    if (armari == 0) {
                        System.out.println();
                        System.out.println("STOCK ESGOTAT.");
                        System.out.println();
                        break;
                    }
                    System.out.print("Introduixca cantitat:    ");
                    int unitatsArmari = sc.nextInt();
                    if (unitatsArmari > armari) {
                        System.out.println();
                        System.out.println("STOCK INSUFICIENT. Tan sols pot demanar " + armari + " unitats");
                        System.out.println();
                        break;
                    }
                    total += unitatsArmari * preuArmari;
                    armari -= unitatsArmari;
                    break;

                default:
                    System.out.println();
                    System.out.println("Codi incorrecte. Torneu a introduir codi.");
                    System.out.println();
                    break;
            }
        } while (codi != 0);

        if (taula == 0) {
            productesAgotats++;
        }
        if (cadira == 0) {
            productesAgotats++;
        }
        if (armari == 0) {
            productesAgotats++;
        }

        System.out.printf("%-32s %10d %n", "Valor total del pedido: ", total);
        System.out.println(productesAgotats + " productes agotats.");
        if (taula == 0) {
            System.out.println("Stock de taula esgotat.");
        }
        if (cadira == 0) {
            System.out.println("Stock de cadires esgotat.");
        }
        if (armari == 0) {
            System.out.println("Stock de armaris esgotat.");
        }
        sc.close();
    }
}