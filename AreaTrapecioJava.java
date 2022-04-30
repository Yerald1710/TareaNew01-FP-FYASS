import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class AreaTrapecioJava {
    public static void main(String[] args) {
        //2.20
        //Definir variables
        double h, b1, b2, a;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el lado b1:");
        b1=lt.nextDouble();
        System.out.println("Ingrese el lado b2:");
        b2=lt.nextDouble();
        System.out.println("Ingrese la altura h");
        h=lt.nextDouble();
        //proceso
        a=b1*b2*h/2; 
        //Datos de salida 
        System.out.print("El area es:"+a);
    }
}