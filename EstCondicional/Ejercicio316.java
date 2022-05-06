package EstCondicional;

import java.util.Scanner;

/**
 * Ejercicio3.16
 */
public class Ejercicio316 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar Variables
        int puntos; 
        double bono=0, salariomin;
        //Datos de Entrada
        System.out.print("Ingrese los puntos obtenidos por el docente:");
        puntos=lt.nextInt();
        System.out.println("Ingrese el salario minimo");
        salariomin=lt.nextDouble();
        //Proceso
        if (puntos>=0 && puntos<=100) {
            bono=salariomin;
        } else if (puntos>=101 && puntos<=150) {
            bono=2*salariomin;
        } else if (puntos>151) {
            bono=3*salariomin;
        }
        //Datos de Salida 
        System.out.println("El bono que recibira es:"+bono);
     
    }
    
}