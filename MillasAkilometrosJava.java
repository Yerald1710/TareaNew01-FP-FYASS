import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class MillasAkilometrosJava {
    public static void main(String[] args) {
        //2.21
        //Definir variables
        double milla=1609, millas, kilometros;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese la cantidad en millas:");
        millas=lt.nextDouble();
        //proceso
        kilometros=millas*milla;
        //Datos de salida 
        System.out.print("La cantidad en kilometros es:"+kilometros);
    }
}