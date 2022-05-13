package ExamenParcial;

import java.util.Scanner;

/**
 * Ejercicio04FYASS
 */

public class Ejercicio05FYASS {
    static Scanner lt=new Scanner(System.in);
    public static void ejercicio04FYASS() {
        //Declarar Variables
        int edad;
        String genero;
        String corresponde; 
        //Datos de Entrada
        System.out.print("Ingrese la edad:");
        edad=lt.nextInt();
        System.out.println("Ingrese el genero (F=femenino y M=masculino)");
        genero=lt.next();
        //Proceso
        if (genero=="M") {
            System.out.println("Eres un hombre");
        } else if(genero=="F"){
            System.out.println("Eres una mujer");
        }
        if (edad>69) {
            corresponde="Le corresponde la vacuna tipo C";
        } else if(edad>16 && edad<69){
            corresponde="Le corresponde la vacuna tipo B"; 
        } else if(edad>16 && edad<70){
            corresponde="Le corresponde la vacuna tipo A";
        } else {
            corresponde="Le corresponde la vacuna tipo A";
        }    
        //Datos de Salida 
        System.out.println(corresponde);
  }
    public static void ejercicio03FYASS() {
         //Definir Variables
         double n1, n2, R, P;
         System.out.println("Ingrese el primer valor");
         n1=lt.nextDouble();
         System.out.println("Ingrese el segundo valor");
         n2=lt.nextDouble();
         System.out.println("Ingrese el signo");
         char operador=lt.next().charAt(0);
         P=Math.pow(n1, n1);
         R=Math.sqrt(n1);

 
         //Proceso 
 
         switch (operador) {
             case '+': System.out.println(n1+n2);  break;
             case '-': System.out.println(n1-n2);  break;
             case '*': System.out.println(n1*n2);  break;
             case '/': System.out.println(n1/n2);  break;
             case '^': System.out.println(+P);;break;
             case 'R': System.out.println(+R);;break;
             case '%': System.out.println(n1%2);  break;
            default: break;
         }
    }    
    public static void ejercicio02FYASS() {
        //Declarar Variables
        double IGV, precio, descuento, importetotal;
        System.out.println("ingrese el monto base:");
        precio = lt.nextDouble();
        IGV = precio*0.18 ;
        
        if (precio>=2000){
            IGV = precio*0.18;
            descuento = precio*0.10;
            importetotal = precio - descuento + IGV;    
        }else if (precio>=1000){
            IGV=precio*0.18;
                descuento = precio*0.05;
                importetotal = precio - descuento + IGV;
        }else if (precio>500){
            IGV=precio*0.18;
                descuento = precio*0.02;
                importetotal = precio - descuento + IGV;
        }else{
            descuento = 0;
            importetotal = 0;
        }
        System.out.println("El descuento que correspondiente es:"+descuento);
        System.out.println("El IGV de monto base es:"+IGV);
        System.out.println("El importe total es de :"+importetotal); 
    }
    public static void ejercicio01FYASS() {
    //Declarar Variables
    String nivel;
    double notaEC, notaEP, notaTP; 
    System.out.println("Ingrese las notas en la escala vigesimal de 0 a 20 ");
    System.out.println("Ingrese la nota del Examen de Conocimiento");
    notaEC=lt.nextDouble();
    System.out.println("Ingrese la nota de la Entrevista Personal");
    notaEP=lt.nextDouble();
    System.out.println("Ingrese la nota del Test Psicologico");
    notaTP=lt.nextDouble();

    //Proceso

    double puntajeEC = (notaEC * 0.40);
    double puntajeEP = (notaEP * 0.35);
    double puntajeTP = (notaTP * 0.25);
    double promedio = (puntajeEC + puntajeEP + puntajeTP);

    if (promedio>=17 && promedio<=20) {
        nivel="Su nivel es 4";
    } else if(promedio<17 && promedio>=14){
        nivel="Su nivel es 3";
    } else if(promedio<14 && promedio>=11){
        nivel="Su nivel es 2";
    } else if(promedio<11){
        nivel="Su nivel es 1 y No puede obtener vacante";
    } else {
        nivel="Notas no validas coloque las notas en la escala vigesimal";
    }
    // Datos de Salida
    System.out.println(nivel);
    
}    
    

    public static void main(String[] args) {
        System.out.println("Ingrese la pregunta");
            int pregunta = lt.nextInt();
            switch (pregunta) {
              case 1:
                ejercicio01FYASS(); break;
              case 2:
              ejercicio02FYASS(); break;
              case 3:
              ejercicio03FYASS(); break;  
              case 4:
              ejercicio04FYASS(); break;          
            }      
    }
          
}

