import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class AreaTrianguloJava {
    public static void main(String[] args) {
        //2.1
        //Definir variables
        double b, h, a;
        //Datos de entrada 
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el valor de b:");
        b=lt.nextDouble();
        System.out.print("Ingrese el valor de h");
        h=lt.nextDouble();
        //Proceso
        a=b*h/2;
        //Datos de salida
        System.out.println("El area es:"+a);
    }
}