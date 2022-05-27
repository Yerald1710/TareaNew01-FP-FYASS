import java.util.Scanner;

public class ClaseGeneral {

    static Scanner leerT=new Scanner(System.in);
    //!
    static Aritmetica obj=new Aritmetica();
    //2
    static Persona objP=new Persona();
    //3
    static Persona objLT=new LeerTeclado();
    
    public static void main(String[] args) {
        /*System.out.println("Ingrese Primer Valor");
        int aX=leerT.nextInt();
        System.out.println("Ingrese el Segundo Valor");
        int bX=leerT.nextInt();
        int result=obj.sumar(aX, bX);
        System.out.println("La suma es:"+result);*/ //<---- ponesmos /* para que no se ejecute esta parte

        /*System.out.println("Ingrese su nombre:");
        objP.nombre=leerT.next();
        System.out.println("Ingrese su DNI");
        objP.dni=leerT.next();
        System.out.println("Ingrese un alimento:");
        objP.comer(leerT.next());*/

        int resulA=objLT.print("Ingrese un valor", 0);
        int resulB=objLT.print("Ingrese un valor", 0);
        System.out.println(obj.sumar(resulA, resulB));;



    }

}
