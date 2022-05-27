import java.util.Scanner;
public class Ejercicio411 {

    static Scanner lt=new Scanner(System.in);
    
    public static void totalCajaRegistradora() {

        //Variables

        String continuar="S";
        String TipoMB="";
        int valorB=0, cantidadB=0;
        double valorM=0, cantidadM=0;
        double total;

        //Entrada - Proceso - Fin
        while (continuar.equals("S")) {

            System.out.println("Ingrese MONEDA o BILLETE:\nM=moneda\nB=billete");
            TipoMB=lt.next().toUpperCase();

            if (TipoMB.equals("B")) {
                System.out.println("Ingrese la CANTIDAD de billetes");
                cantidadB=lt.nextInt();
                if (valorB==0) {
                    System.out.println("Ingrese el VALOR del billete");
                valorB=lt.nextInt();
                }
                
            } else if (TipoMB.equals("M")) {
                System.out.println("Ingrese la CANTIDAD de monedas");
                cantidadM=lt.nextInt();

                System.out.println("Ingrese el VALOR de la moneda");
                valorM=lt.nextInt();

            } else { System.out.println("INGRESE SI ES MONEDA O BILLETE");}

            System.out.println("HAY MAS EN LA CAJA REGISTRADORA?: S=SI, N=No");
            continuar=String.valueOf(lt.next().toUpperCase().charAt(0));
            
        }

        System.out.println("El valor total de BILLETES ES:"+(cantidadB*valorB));
        System.out.println("El valor total de MONEDAS ES:"+(cantidadM*valorM));
        total=(cantidadB*valorB)+(cantidadM*valorM);
        System.out.println("La suma total de BILLETES Y MONEDAS ES:"+total);
        
    }

    public static void main(String[] args) {
        totalCajaRegistradora();
    }
}
