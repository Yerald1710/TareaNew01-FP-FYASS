import java.util.Scanner;
public class Ejercicio422 {
    static Scanner lt=new Scanner(System.in);

    public static void MultiplosDE5() {

        for (int i = 0; i <= 100; i++) {
            if (i%5==0) {
                System.out.println(i);
            }
        
        }
        
    }

    public static void main(String[] args) {
        MultiplosDE5();
    }
}
