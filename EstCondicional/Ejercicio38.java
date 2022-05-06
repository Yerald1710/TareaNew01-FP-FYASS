package EstCondicional;

import java.util.Scanner;

/**
 * Ejercicio3.18
 */
public class Ejercicio38 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar Variables
        int antiguedad;
        double sueldo, bonoxantiguedad=0, bonoxsueldo, bonoMayor;
        //Datos de Entrada
        System.out.print("Ingrese la antiguedad:");
        antiguedad=lt.nextInt();
        System.out.print("Ingrese el sueldo:");
        sueldo=lt.nextInt();
        //Proceso
        if (antiguedad>2 && antiguedad<5) {
            bonoxantiguedad=sueldo*0.20;   
        } else if(antiguedad>=5){
            bonoxantiguedad=sueldo*0.30;
        }
        if (sueldo<1000 && sueldo<=3500) {
            bonoxsueldo=sueldo*0.15;
        } else {
            bonoxsueldo=sueldo*0.10;
        }
        if (bonoxantiguedad>bonoxsueldo) {
            bonoMayor=bonoxantiguedad;
            
        } else {
            bonoMayor=bonoxsueldo;
            
        }
        //Datos de Salida 
        System.out.println("El bono correspondiente es:"+bonoMayor);
    }
    
}