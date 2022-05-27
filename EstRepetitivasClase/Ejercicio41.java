import java.util.Scanner;
public class Ejercicio41 {

    static Scanner lt=new Scanner(System.in);
    public static void suma10Cantidades() {
        //Variables
        int contador=1; 
        double numeroX;
        double sumaNum=0;
        while (contador<=10) {
            System.out.print("Ingrese el valor de "+contador+"; ");
            numeroX=lt.nextDouble();
            sumaNum=sumaNum+numeroX;
            contador++;
            System.out.println("");
        }

        //Salida
        System.out.println("La suma de los "+(contador-1)+"valores Introducidos es: "+sumaNum);
    }   


    public static void main(String[] args) {
        suma10Cantidades();
    }
}
