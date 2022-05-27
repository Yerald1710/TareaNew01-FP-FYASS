import java.util.Scanner;
public class Ejercicio420 {
    static Scanner lt=new Scanner(System.in);

    public static void NcantidadDineroMonedero() {

         //Variables

        String continuar="S";
        String TipoMB="";
        int cantidadM1=0, cantidadM2=0, cantidadM5=0;
        int valorM1=1, valorM2=2, valorM5=5;
        int cantidadB1=0, cantidadB2=0;
        int valorB1=10, valorB2=20;
        int total=0;

         //Entrada y Proceso
        while (continuar.equals("S")) {

            System.out.println("Ingrese el tipo de Moneda o Billete:\nM1=Moneda de: S/1\nM2=Moneda de: S/2\nM5=Moneda de: S/5\nB1=Billete S/10\nB2=Billete S/20");   
            TipoMB=lt.next().toUpperCase();

            if (TipoMB.equals("M1")) {
                System.out.println("Ingrese la cantidad de monedas de S/1");
                cantidadM1=lt.nextInt();

            } else if (TipoMB.equals("M2")) {
                System.out.println("Ingrese la cantidad de monedas de S/2");
                cantidadM2=lt.nextInt();

            } else if (TipoMB.equals("M5")) {
                System.out.println("Ingrese la cantidad de monedas de S/5");
                cantidadM5=lt.nextInt();

            } else if (TipoMB.equals("B1")) {
                System.out.println("Ingrese la cantidad de Billetes de S/10");
                cantidadB1=lt.nextInt();
            } else if (TipoMB.equals("B2")) {
                System.out.println("Ingrese la cantidad de Billetes de S/20");
                cantidadB2=lt.nextInt();
            } else { System.out.println("El tipo de MONEDA O BILLETE en la billetera NO ESTA");}

            System.out.println("Hay Mas MONEDAS O BILLETES?: S=SI, N=No");
            continuar=String.valueOf(lt.next().toUpperCase().charAt(0));

        }

        System.out.println("La cantidad de dinero que hay en MONEDAS DE S/1 es:"+(cantidadM1*valorM1));
        System.out.println("---------------------------------------");
        System.out.println("La cantidad de dinero que hay en MONEDAS DE S/2 es:"+(cantidadM2*valorM2));
        System.out.println("---------------------------------------");
        System.out.println("La cantidad de dinero que hay en MONEDAS DE S/5 es:"+(cantidadM5*valorM5));
        System.out.println("***************************************");
        System.out.println("La cantidad de dinero que hay en BILLETES DE S/10 es:"+(cantidadB1*valorB1));
        System.out.println("---------------------------------------");
        System.out.println("La cantidad de dinero que hay en BILLETES DE S/20 es:"+(cantidadB2*valorB2));

        total=(cantidadM1*valorM1)+(cantidadM2*valorM2)+(cantidadM5*valorM5)+(cantidadB1*valorB1)+(cantidadB2*valorB2);
        System.out.println("La cantidad Total de dinero es:" +total);
    }
    
    public static void main(String[] args) {
        NcantidadDineroMonedero();
    }
}
