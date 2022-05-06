package EstCondicional;

import java.util.Scanner;

/**
 * Ejercicio3.18
 */
public class Ejercicio318 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar Variables
        double bono, antiguedad, sueldo;
        System.out.println("Ingrese el sueldo");
        sueldo=lt.nextDouble();
        System.out.println("Ingrese la antiguedad");
        antiguedad=lt.nextInt();
        //Proceso
        if (antiguedad>4 || sueldo<2000) {
            bono=sueldo*0.25;    
        } else {
            bono=sueldo*0.20;
        }
        //Datos de Salida
        System.out.println("El bono que le corresponde es:"+bono);
            
    }
}
    