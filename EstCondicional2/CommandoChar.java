package Preguntas;

import java.util.Scanner; 

public class Commandochar {
   
	static Scanner lt=new Scanner(System.in);

	public static void ejer41while() {
    

}

public static void commandochar() {
    System.out.println("Ingrese el operador:");
	char operador=lt.next().charAt(0);
    switch (operador) {
        case '+': System.out.println("debe sumar");break;
        case '-': System.out.println("debe restar");break;
    
        default: break;
     }
    
	}
	public static void main(String[] args) {
        commandochar();
    }

}