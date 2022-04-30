import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class VolumenParalelipedoJava {
    public static void main(String[] args) {
        //2.22
        //Definir variables
        double a, b, c, v;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el valor del lado a:");
        a=lt.nextDouble();
        System.out.println("Ingrese el valor del lado b:");
        b=lt.nextDouble();
        System.out.println("Ingrese el valor del lado c:");
        c=lt.nextDouble();
        //proceso
        v=a*b*c;
        //Datos de salida 
        System.out.print("El Volumen es:"+v);
    }
}