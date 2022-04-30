import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class MRUJava {
    public static void main(String[] args) {
        //2.8
        //Definir variables
        double tiempo, d, v;
        //Datos de entrada 
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese la distancia:");
        d=lt.nextDouble();
        System.out.println("Ingrese la velocidad");
        v=lt.nextDouble();
        //Proceso
        tiempo=d/v;
        //Datos de salida
        System.out.println("El tiempo es:"+tiempo);
    }
}