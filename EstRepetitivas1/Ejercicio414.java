import java.util.Scanner;
public class E414 {
    static Scanner lt=new Scanner(System.in);

    public static void e414() {

        //Variables

        String sueldo="";
        String continuar="S";
        double sueldo1=0, sueldo2=0, sueldo3=0;
        double descuento1=0, descuento2=0, descuento3=0;
       
        
        //Entrada - Proceso

        while (continuar.equals("S")){
            System.out.println("Ingrese la Cantidad de SUELDO:\n1=Si ganan entre 0 a S/150\n2=Si ganan entre S/150 a S/300\n3=Si ganan entre S/300 a S/450 ");
            sueldo=lt.next();

            if (sueldo.equals("1")) {
                System.out.println("Ingrese la cantidad de Sueldo entre 0 a S/150 ");
                sueldo1=lt.nextDouble();

                descuento1=(sueldo1*5)/100;
              
    
            } else if (sueldo.equals("2")) {
                System.out.println("Ingrese la cantidad de Sueldo entre S/150 a S/300 ");
                sueldo2=lt.nextDouble();

                descuento2=(sueldo2*7)/100;
                

            } else if (sueldo.equals("3")) {
                System.out.println("Ingrese la cantidad de Sueldo entre S/300 a S/450 ");
                sueldo3=lt.nextDouble();

                descuento3=(sueldo3*9)/100;
                
            } else { System.out.println("El monto del sueldo es incorrecto");}

            System.out.println("Hay Sueldos de Trabajadores?: S=SI, N=No");
            continuar=String.valueOf(lt.next().toUpperCase().charAt(0));
    }

    System.out.println("El sueldo semanal del trabajador que gana entre 0 a S/150 con descuento es:"+sueldo1);
    System.out.println("Se le descuenta:"+descuento1);
    System.out.println("Sueldo con descuento es:"+(sueldo1-descuento1));
    System.out.println("------------------------------------------------------------------------------");
    System.out.println("El sueldo semanal del trabajador que gana entre S/150 a S/300 con descuento es:"+sueldo2);
    System.out.println("Se le descuenta:"+descuento2);
    System.out.println("Sueldo con descuento es:"+(sueldo2-descuento2));
    System.out.println("------------------------------------------------------------------------------");
    System.out.println("El sueldo semanal del trabajador que gana entre S/300a S/450 con descuento es:"+sueldo3);
    System.out.println("Se le descuenta:"+descuento3);
    System.out.println("Sueldo con descuento es:"+(sueldo3-descuento3));
}

    public static void main(String[] args) {
        e414();
    }
}
