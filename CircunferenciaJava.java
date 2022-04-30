import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class CircunferenciaJava {
    public static void main(String[] args) {
        //2.19
        //Definir variables
        double c, pi=3.14, r;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("r:");
        r=lt.nextDouble();
        //proceso
        c=2*pi*r;
        //Datos de salida 
        System.out.print("La circunferencia es:"+c);
    }
}
