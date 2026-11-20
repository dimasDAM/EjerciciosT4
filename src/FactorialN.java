import java.util.Scanner;

public class FactorialN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {//MIENTRAS QUE LA OTRA CONDICION NO SE CUMPLA PUEDES HACERLO
            System.out.print("Introduzca número: ");
            n = sc.nextInt();
            int factorial = 1;
            if( n > 0 ){

                for (int i = 1; i <= n; i++) {
                System.out.println(factorial + " x " + i);
                factorial *= i;
            }
            System.out.println("Factorial de " + n + " es " + factorial);
        }
        } while (n <= 0); ///OJO CON LOS SIMBOLOS!!
                        ////AQUI HAY QUE LEER AL REVES
                        /// MIENTRAS n SEA MENOR QUE 0 PUEDES HACERLO!!!
        sc.close();
    }
}
