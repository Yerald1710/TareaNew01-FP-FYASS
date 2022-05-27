import java.util.Scanner;
public class EjerciciosVarios2 {

    

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Ingrese el tamaño del cuadrado");
    int n = teclado.nextInt();

    if (n >= 0 && n<=50) {
        //Linea Superior
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
        System.out.println();

        //Centro de la forma
        for (int i = 0; i < n-2; i++) {
            System.out.println("*");
            for (int j = 0; j < n-2; j++) {
                System.out.println("");
            }
            System.out.println("*");
        }

        //Linea Superior
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        } 
    } else {
            System.out.println("Error");
        }
    }
    }

