import java.util.Scanner;

public class Botiga {
    public static void main(String[]args){
        int taula= 100;
        int cadira = 100; 
        int armari = 100;


        System.out.println("Stock: ");
        System.out.printf("%30s %10d %s%n","Codi (1): Taula.  Stock actual: " , taula , " taules.");

        System.out.printf("%30s %10d %s%n","Codi (2): Cadira. Stock actual: " , cadira , " cadires.");

        System.out.printf("%30s %10d %s%n","Codi (3): Armari. Stock actual: " ,armari , " armaris.");

        Scanner sc = new Scanner(System.in);













        sc.close();
    }

}
