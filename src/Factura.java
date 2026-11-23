import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double IVA = 1.21;
        double iva = 0;
        double precioMasIVA =0; 
        double totalIva=0;
        double preu1 = 0.1;
        double preu2 = 0.08;
        double preu3 = 0.05;        
        double base = 0;
        double facturado = 0;
        double descompte= 0;
        double totalDescomptes=0;

        while (true) {
            System.out.print("Introduixca Nombre o termine amb (fi):        ");
            String nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("fi")) {
                break;
            }
            System.out.print("Introduixca les unitats mensuals o temine amb (fi):        ");
             int unitats = sc.nextInt();
             sc.nextLine();

            ///CALCULO COSTE BRUTO

            
            if(unitats >=0 || unitats<101){
                base = unitats * preu1;  
                facturado += base;
                precioMasIVA= base + iva;
                iva = base * IVA;
             
            }else if(unitats > 100 && unitats <501){
                base = 100* preu1 + (unitats-100) *preu2;
                facturado += base;
                precioMasIVA = base + iva;
                iva = base * IVA;
            }else{
                base = 100 * preu1 + 400 * preu2 + (unitats - 500) * preu3;
                precioMasIVA = base + iva;
                facturado += base;
                iva = base * IVA;
            }
            
            totalIva +=iva;


            if(unitats>1000){
                descompte = precioMasIVA*0.05;
                precioMasIVA = precioMasIVA - descompte ;//DESCUENTO 5%
                System.out.println("Total amb IVA(amb descompte 5%) :            " + (precioMasIVA));
                totalDescomptes += descompte;
            }
            System.out.println("Total amb IVA:            " + (precioMasIVA));
        }
        System.out.println("Total de descuentos:       " + totalDescomptes);
        System.out.println("Total bruto:               " + facturado);
        System.out.println("Total IVA:                 " + totalIva);


        sc.close();
    }

}
