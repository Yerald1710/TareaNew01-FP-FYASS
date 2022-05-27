import java.util.Scanner;
public class Ejercicio424 {
    static Scanner lt=new Scanner(System.in);

    public static void cajafuerte() {
      //Variables
      int intentos = 4, Clave;
      boolean acertado = false;
      //Entrada-Proceso-Fin
      do {
        System.out.print("Introduzca la clave de la caja fuerte: ");
        Clave = Integer.parseInt(System.console().readLine());
        
        if (Clave == 202212461) {
          acertado = true;
        } else {
          System.out.println("Lo siento, esa no es la combinación");
        }
        
        intentos--;
    
      } while((intentos > 0) && (!acertado));
      
      if (acertado) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      } else {
        System.out.println("Lo siento, ha agotado las 4 oportunidades");
      }
     
    }
    
    public static void main(String[] args) {
        cajafuerte();
    }
}
