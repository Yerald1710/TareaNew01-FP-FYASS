import java.util.Scanner;
public class Ejercicio43 {
    static Scanner lt=new Scanner(System.in);
    public static void NCantidades() {
        //Variables
        //Definir Variables
        int NumMayorcero=0, NumIgualCero=0, NumMenorCero=0;
        double numN=0;
        String continuar="S";

        //Datos de entrada y proceso


        while (continuar.equals("S")) {
            System.out.println("Ingrese un numero:");
            numN=lt.nextDouble();
            if (numN<0) {
                NumMenorCero++;
            }else if(numN>0){
                NumMayorcero++;
            }else{
                NumIgualCero++;
            }
            System.out.println("Desea ingresar mas numeros?:\nS=Si\tN=No");
            continuar=lt.next().toUpperCase().equals("S")?"S":"N";
        
        }

        //Datos de salida
        System.out.println("Cantidad de numeros Mayores de cero: "+NumMayorcero);
        System.out.println("Cantidad de numeros iguales a cero: "+NumIgualCero);
        System.out.println("Cantidad de numeros Menores a cero: "+NumMenorCero);
       
        
    }
    public static void main(String[] args) {
        NCantidades(); 
    }
}
