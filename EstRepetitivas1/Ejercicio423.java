import java.util.Scanner;
public class Ejercicio423 {
    static Scanner lt=new Scanner(System.in); 

    public static void N320al160() {

        for (int i = 320; i >=160; i--) {
            if (i%20==0) {
                System.out.println(i);
            }
        }
        
    }

    public static void main(String[] args) {
        N320al160();
    }
}
