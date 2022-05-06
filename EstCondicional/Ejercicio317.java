package EstCondicional;

import java.util.Scanner;

/**
 * Ejercicio3.17
 */
public class Ejercicio317 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar Variables
        double dinero; 
        String puede;
        //Datos de Entrada
        System.out.print("Dinero que recibira en diciembre:");
        dinero=lt.nextDouble();
        //Proceso
        if (dinero>50000) {
            puede="Comprar el paquete A";
        } else if(dinero<50000 && dinero>=20000){
            puede="Comprar el paquete B";   
        } else if(dinero<20000 && dinero>=10000){
            puede="Comprar el paquete C";
        } else {
            puede=" Puede conformarse con el paquete D";
        }
        //Datos de Salida 
        System.out.println(puede);
    }
}