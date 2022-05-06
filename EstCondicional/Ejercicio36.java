package EstCondicional;

import java.util.Scanner;

/**
 * Ejercicio37
 */
public class Ejercicio36 {
    static Scanner lt=new Scanner(System.in);
    
    public static void main(String[] args) {
        //Declarar Variables
        double costo, precio;
        System.out.println("Ingrese el precio");
        precio=lt.nextDouble();
        //Proceso
        if (precio>=200) {
            costo=precio*0.20;
            
        } else if(precio>100 && precio<200){
            costo=precio*0.15;
            
        }else{
            costo=precio*0.10;
        }
        //Datos de salida
        System.out.println("El costo con descuento es"+costo);
    }
}
