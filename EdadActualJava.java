import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class EdadActualJava {
    public static void main(String[] args) {
        //2.21
        //Definir variables
        double anioactual, anionacimiento, edadactual;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el valor de anioactual:");
        anioactual=lt.nextDouble();
        System.out.println("Ingrese el valor de anionacimiento:");
        anionacimiento=lt.nextDouble();
        //proceso
        edadactual=anioactual-anionacimiento;
        //Datos de salida 
        System.out.print("La edad actual es:"+edadactual);
    }
}