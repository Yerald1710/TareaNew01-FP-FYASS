package EstCondicional;

import java.util.Scanner;

/**
 * Ejercicio3.19
 */
public class Ejercicio319 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar Variables
        int edad;
        String genero;
        String corresponde; 
        //Datos de Entrada
        System.out.print("Ingrese la edad:");
        edad=lt.nextInt();
        System.out.println("Ingrese el genero (F=femenino y M=masculino)");
        genero=lt.next();
        //Proceso
        if (genero=="M") {
            System.out.println("Eres un hombre");
        } else if(genero=="F"){
            System.out.println("Eres una mujer");
        }
        if (edad>70) {
            corresponde="Le corresponde la vacuna tipo C";
        } else if(edad>16 && edad<70){
            corresponde="Le corresponde la vacuna tipo B"; 
        } else if(edad>16 && edad<70){
            corresponde="Le corresponde la vacuna tipo C";
        } else {
            corresponde="Le corresponde la vacuna tipo A";
        }    
        //Datos de Salida 
        System.out.println(corresponde);
    }
}
    