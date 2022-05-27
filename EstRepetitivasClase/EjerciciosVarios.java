
import java.math.BigInteger;
import java.util.Scanner;
public class EjerciciosVarios {

    static Scanner lt=new Scanner(System.in);

public static void factorialXnum() {

    int n; 
    long result=1;
    System.out.println("Ingrese un numero");
    n=lt.nextInt();

    if(n>1){
    for (int i = 1; i <=n; i++){
        result=result*i;
        
     }

   }
   System.out.println("El factorial de "+n+" es:"+result);
}

public static long factorialNum(int n) {
    long result=1;
    if(n>1){
    for (int i = 1; i <=n; i++){
        result=result*i;
     }
   }
   //System.out.println("El factorial de "+n+" es:"+result);
   return result;
}

public static BigInteger factorialNumBig(int n) {
    BigInteger result=new BigInteger("1");
    if(n>1){
    for (int i = 1; i <=n; i++){
        result=result.multiply(new BigInteger(String.valueOf(i)));
     }
   }
   //System.out.println("El factorial de "+n+" es:"+result);
   return result;
}

public static void funcionExponencial(int x) {
    double result=0;
    for (int index = 0; index < x; index++) {
        result=result+(Math.pow(x, index)/factorialNum(index));
        
    }
    System.out.println("Funcion Exponencia es:"+result);
    
}

    public static void main(String[] args) {

        /*factorialXnum();
        long resultado=factorialNum(5);
        System.out.println("Resultado:"+resultado);*/

        /*System.out.println("Ingrese un numero");
        int numero=lt.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println("Factorial de "+i+"! =" + factorialNumBig(i));*/ 

            
            funcionExponencial(5); //<--- AQUI PODEMOS CAMBIAR EL NUMERO
        
            

            //System.out.println("Factorial de "+i+"! =" +  factorialXnum(i));         
            //System.out.println("Factorial de "+i+"! =" +  factorialNum(i)); 
        }
        
    }

