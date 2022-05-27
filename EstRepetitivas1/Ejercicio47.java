import java.util.Scanner;

//4.7

public class Ejercicio47 {
    static Scanner lt=new Scanner(System.in);
    public static void NArticulos() {
        //VARIABLES
        String continuar="S";
        String tipoArticulo="";

        double precioa1=0, precioa2=0, precioa3=0;
        
        double descuento1=0, descuento2=0, descuento3=0;
        double total=0;
        int cantidad1=0, cantidad2=0, cantidad3=0;
        double totalDes1, totalDes2, totalDes3;
        //PROCESO

        while (continuar.equals("S")) {

            System.out.println("Ingrese El ARTICULO:\n1=Articulo 1\n2=Articulo 2\n3=Articulo 3");
            tipoArticulo=lt.next();
            //1
            if (tipoArticulo.equals("1")) {
                System.out.println("Ingrese la cantidad del ARTICULOS: "+tipoArticulo+":");
                cantidad1=cantidad1+lt.nextInt();
                if (precioa1==0) {
                    System.out.println("Ingrese El PRECIO del articulo 1 PRECIO>=200");
                    precioa1=lt.nextDouble(); 
                }
                descuento1=(precioa1*15)/100;
                
                //2
            }else if(tipoArticulo.equals("2")){
                System.out.println("Ingrese la cantidad del ATICULOS: "+tipoArticulo+":");
                cantidad2=cantidad2+lt.nextInt();

                if (precioa2==0) {
                    System.out.println("Ingrese El PRECIO del articulo 2 PRECIO>100 Y PRECIO<200");
                    precioa2=lt.nextDouble();
                }
                    descuento2=(precioa2*12)/100;
                
                //3
            }else if (tipoArticulo.equals("3")){
                System.out.println("Ingrese la cantidad del ATICULOS: "+tipoArticulo+":");
                cantidad3=cantidad3+lt.nextInt();

                if (precioa3==0) {
                    System.out.println("Ingrese El PRECIO del articulo 3 PRECIO<100");
                precioa3=lt.nextDouble();
                }
                    descuento3=(precioa3*10)/100;
                    

            }else {System.out.println("ERROR¡¡");}

            System.out.println("Hay Mas ARTICULOS?: S=SI, N=No");
            continuar=String.valueOf(lt.next().toUpperCase().charAt(0));
            
        }

            System.out.println("El costo de los articulos 1 es:"+(precioa1*cantidad1));
            System.out.println("El descuento del articulo 1 es:"+descuento1);
            totalDes1=(precioa1*cantidad1-descuento1);
            System.out.println("TOTAL A PAGAR CON DESCUENTO ES:"+ totalDes1);
            System.out.println("---------------------------------------------------");
            System.out.println("El costo del articulos 2 es:"+(precioa2*cantidad2));
            System.out.println("El descuento del articulo 2 es:"+descuento2);
            totalDes2=(precioa2*cantidad2-descuento2);
            System.out.println("TOTAL A PAGAR CON DESCUENTO ES:"+ totalDes2);
            System.out.println("---------------------------------------------------");
            System.out.println("El costo del articulos 3 es:"+(precioa3*cantidad3));
            System.out.println("El descuento del articulo 3 es:"+descuento3);
            totalDes3=(precioa3*cantidad3-descuento3);
            System.out.println("TOTAL A PAGAR CON DESCUENTO ES:"+ totalDes3);
            System.out.println("---------------------------------------------------");
            total=(precioa1+cantidad1)+(precioa2+cantidad2)+(precioa3+cantidad3);
            System.out.println("El total a pagar es:"+total);


    }

    

    public static void main(String[] args) {
        
        NArticulos();
    }
}
