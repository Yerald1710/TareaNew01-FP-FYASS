import java.util.Scanner;
public class Ejercicio426 {
    static Scanner lt=new Scanner(System.in);

public static void TablaMultiplicar() {
    System.out.println("Introduzca el NUMERO");
    int n=lt.nextInt();

    for (int i = n + 1; i <= n+ 5; i++) {
        System.out.println(i + " El resultado de las OPERACIONAES son:" + " Cuadrado = " + i*i + " ----- " + " Cubo = " + i*i*i );

    }
}
    public static void main(String[] args) {
        TablaMultiplicar();
    }
}
