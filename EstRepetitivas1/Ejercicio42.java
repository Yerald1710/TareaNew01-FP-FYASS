import java.util.Scanner;
public class Ejercicio42 {
    static Scanner lt=new Scanner (System.in);

    public static void Hamburguesas() {
        //Variables
        double precioS=10, precioD=12, precioT=14;
        double Total=0, total2=0;
        int cantidadS=0, cantidadD=0, cantidadT=0;
        String TipoHamburguesa;
        String continuar="S";
        double impTC=0;
        //Entrada y Proceso
        while (continuar.equals("S")) {

            System.out.println("Ingrese el tipo de Hamburguesa:\nS=Sencilla\nD=Doble\nT=Triple");   
            TipoHamburguesa=lt.next().toUpperCase();

            if (TipoHamburguesa.equals("S")) {
                System.out.println("Ingrese la cantidad de hamburguesas de Tipo: "+TipoHamburguesa+":");
                cantidadS=cantidadS+lt.nextInt();
                
                

            } else if(TipoHamburguesa.equals("D")){
                System.out.println("Ingrese la cantidad de hamburguesas de Tipo: "+TipoHamburguesa+":");
                cantidadD=cantidadD+lt.nextInt();
               
                
                    
            } else if(TipoHamburguesa.equals("T")){
                System.out.println("Ingrese la cantidad de hamburguesas de Tipo: "+TipoHamburguesa+":");
                cantidadT=cantidadT+lt.nextInt();
               
                
            } else { System.out.println("El tipo de hamburguesa no existe");}

        
            System.out.println("Tiene mas hambuguesas que pedir?:\nS=Si\tN=No");
            continuar=String.valueOf(lt.next().toUpperCase().charAt(0));
        }
    
        System.out.println("El total del precio de HAMBURGUESAS SIMPLES es:" +(precioS*cantidadS));
        System.out.println("El total del precio de HAMBURGUESAS DOBLES es:" +(precioD*cantidadD));
        System.out.println("El total del precio de HAMBURGUESAS TRIPLES es:" +(precioT*cantidadT));

        Total=(precioS*cantidadS)+(precioD*cantidadD)+(precioT*cantidadT);
        System.out.println("El total a pagar es:" +Total);

        impTC=(Total*5)/100;
        total2=(precioS*cantidadS)+(precioD*cantidadD)+(precioT*cantidadT)+impTC;
        System.out.println("El total a pagar con TARJETA DE CREDITO ES:" +total2);

        

       

        
    }
    public static void main(String[] args) {
        Hamburguesas();
    }
}
