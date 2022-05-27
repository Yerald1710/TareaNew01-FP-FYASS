import java.util.Scanner;
/**
 * Ejercicio418
 */
public class Ejercicio418 {

    static Scanner lt=new Scanner(System.in);

    public static void ImpuestoVehiculos418() {

     //Variables

        int cantVC1=0, cantVC2=0, cantVC3=0;
        String claveV, hayMas="S";
        double precioVC1=0, precioVC2=0, precioVC3=0,
         impVC1=0, impVC2=0, impVC3=0, totalImpV=0;

     //Entrada - Proceso - Fin
        
        while (hayMas.equals("S")) {

            System.out.println("Ingrese la clave del Vehiculo (VC1,VC2,VC3):");
            claveV=lt.next().toUpperCase();

            if (claveV.equals("VC1")) {
                System.out.println("Ingrese la CANTIDAD DE VEHICULOS con clave "+claveV+":");//Podemos ponerlo afuera
                cantVC1=cantVC1+lt.nextInt();
                if(precioVC1==0){
                System.out.println("Ingrese el PRECIO DEL VEHICULO con clave"+claveV+":");
                precioVC1=lt.nextDouble();
                } 
                impVC1=precioVC1*0.10;

            } else if (claveV.equals("VC2")) {
                System.out.println("Ingrese la CANTIDAD DE VEHICULOS con clave "+claveV+":");
                cantVC2=cantVC2+lt.nextInt();
                if(precioVC2==0){
                System.out.println("Ingrese el PRECIO DEL VEHICULO con clave"+claveV+":");
                precioVC2=lt.nextDouble();
                } 
                impVC2=precioVC2*0.07;

            } else if (claveV.equals("VC3")) {
                System.out.println("Ingrese la CANTIDAD DE VEHICULOS con clave "+claveV+":");
                cantVC3=cantVC3+lt.nextInt();
                if(precioVC3==0){
                System.out.println("Ingrese el PRECIO DEL VEHICULO con clave"+claveV+":");
                precioVC3=lt.nextDouble();
                }
                impVC3=precioVC3*0.05;

            } else { System.out.println("La clave del vehiculo es incorrecto");}


            System.out.println("Hay Mas Vehiculos?: S=SI, N=No");
            hayMas=String.valueOf(lt.next().toUpperCase().charAt(0));
        }
        
        System.out.println("Impuesto de Vehiculo VC1 es:"+impVC1);
        System.out.println("Impuesto de Vehiculo VC2 es:"+impVC2);
        System.out.println("Impuesto de Vehiculo VC3 es:"+impVC3);

        System.out.println("Impuesto TOTAL de Vehiculo VC1 es:"+(impVC1*cantVC1));
        System.out.println("Impuesto TOTAL de Vehiculo VC2 es:"+(impVC2*cantVC2));
        System.out.println("Impuesto TOTAL de Vehiculo VC3 es:"+(impVC3*cantVC3));

        totalImpV=(impVC1*cantVC1)+(impVC2*cantVC2)+(impVC3*cantVC3);
        System.out.println("Total impuesto a pagar es:"+(cantVC1+cantVC2+cantVC3)+"es:"+totalImpV);

    }

    public static void main(String[] args) {
        ImpuestoVehiculos418();
    }
}