import java.util.Scanner;
public class Ejercicio412 {

    public static void NVentas() {
        //Variables
        double cantMenosDM=0, cantMasDM=0;
        String MontoT="";
        String continuar="S";
        double MontoV1=0, MontoV2=0;
        double total=0;
        String mensaje;
        //Entrada - Proceso
        while (continuar.equals("S")) {

            System.out.println("Ingrese CUANTO es el monto a registrar:\n1= Ventas menores a 10.000: \n2=Ventas mayores a 10.000 y Menores a 20.000");
            MontoT=lt.next();
            //1
            if (MontoT.equals("1")) {
                if (MontoV1<10000) {
                    System.out.println("Ingrese EL MONTO de la venta");
                    MontoV1=lt.nextDouble();
                } else {
                    mensaje=("ERROR: INGRESASTE EL MONTO CORRESPONDIDO?: " +MontoV1); 
                    System.out.println(mensaje);
                }
                    System.out.println("Ingrese la cantidad de ventas de dicho precio:");
                    cantMenosDM=cantMenosDM+lt.nextDouble();
            //2   
            } else if(MontoT.equals("2")){
                if (MontoV2>10000 && MontoV2<20000) {
                    System.out.println("Ingrese EL MONTO de la venta");
                    MontoV2=lt.nextDouble();
                } else {
                    mensaje="ERROR: INGRESASTE EL MONTO CORRESPONDIDO?: " +MontoV2;
                    System.out.println(mensaje); 
                }
                System.out.println("Ingrese la cantidad de ventas de dicho precio:");
                cantMasDM=cantMasDM+lt.nextDouble();
                    

            } 

            System.out.println("Desea ingresar mas montos?:\nS=Si\tN=No");
            continuar=lt.next().toUpperCase().equals("S")?"S":"N";
        }
        //Fin
        System.out.println("El total de ventas Menores a 10.000 es: "+(MontoV1*cantMenosDM));
        System.out.println("El total de ventas Mayores a 10.000 es: "+(MontoV2*cantMasDM));

        total=(MontoV1*cantMenosDM)+(MontoV2*cantMasDM);
        System.out.println("El total de todas las ventas es:"+total);

        
    }

    static Scanner lt=new Scanner(System.in);
 public static void main(String[] args) {
    NVentas();
 }   
}
