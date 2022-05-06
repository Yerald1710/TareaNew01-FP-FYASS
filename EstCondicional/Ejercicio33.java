package EstCondicional;

import java.util.Scanner;

/**
 * Ejercicio31
 */
public class Ejercicio33 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar Variables
        int costo; 
        String mensaje;
        //Datos de Entrada
        System.out.print("Ingrese el costo:");
        costo=lt.nextInt();
        //Proceso
        if (costo<=100) {
            mensaje="Puede comprar porque entra en el presupuesto "+costo;
        } else {
            mensaje="No puede comprar porque no entra en el presupuesto "+costo; 
        }
        //Datos de Salida 
        System.out.println(mensaje);
    }
    
}