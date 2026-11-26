import java.util.Scanner;

public class Botiga {
    public static void main(String[] args) {
        int taula = 100;
        int cadira = 100;
        int armari = 100;
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Stock: ");
            System.out.printf("%30s %10d %s%n", "Codi (1): Taula.  Stock actual: ", taula, " taules.");
            System.out.printf("%30s %10d %s%n", "Codi (2): Cadira. Stock actual: ", cadira, " cadires.");
            System.out.printf("%30s %10d %s%n", "Codi (3): Armari. Stock actual: ", armari, " armaris.");

            System.out.println();
            System.out.print("Introduisxca codi:         ");
            int codi = sc.nextInt();
            sc.nextLine();

            switch (codi) {
                case 0:

                    break;

                case 1:
                    if (taula < 1) {
                        System.out.println("Estoc insuficient.");
                        break;
                    }
                    System.out.print("Introduixca cantitat:    ");
                    int unitatsTaula = sc.nextInt();
                    taula -= unitatsTaula;
                    break;

                case 2:

                    if (cadira < 1) {
                        System.out.println("Estoc insuficient.");
                        break;
                    }
                    System.out.print("Introduixca cantitat:    ");
                    int unitatsCadira = sc.nextInt();
                    taula -= unitatsCadira;
                    break;

                case 3:
                    if (armari < 1) {
                        System.out.println("Estoc insuficient.");
                        break;
                    }                    
                    System.out.print("Introduixca cantitat:    ");
                    int unitatsArmari = sc.nextInt();
                    taula -= unitatsArmari;
                    break;

                default:
                    break;
            }
sc.close();

        } 
       
    }

}
