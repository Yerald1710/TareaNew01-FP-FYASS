import java.util.Scanner;
public class Ejercicio416 {

    static Scanner lt=new Scanner(System.in);

public static void TablaMultiplicar() {

    int factor_a = 5;
    for (int factor_b = 1; factor_b <= 10; factor_b++) {
        System.out.println("TABLA DE MULTIPLICAR DE"+factor_a+"--->"+factor_a+" x "+factor_b+" = "+factor_a*factor_b);
        
    }
}

    public static void main(String[] args) {
        TablaMultiplicar();
       
    }
}