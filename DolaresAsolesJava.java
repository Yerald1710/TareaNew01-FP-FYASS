import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class DolaresAsolesJava {
    public static void main(String[] args) {
        //2.2
        //Definir variables
        double soles, dolar, precio;
        //Datos de entrada 
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dolar:");
        dolar=lt.nextDouble();
        System.out.println("Ingrese la cantidad de precio:");
        precio=lt.nextDouble();
        //Proceso
        soles=dolar*precio;
        //Datos de salida
        System.out.println("Cantidad de dolares a soles es:"+soles);
    }
}