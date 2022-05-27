import java.util.Scanner;
public class Ejercicio413 {
    static Scanner lt=new Scanner(System.in);

    public static void NCalificaciones() {
        //Variable
        int Reprobado=0, Aprobado=0;
        String Nota="";
        String continuar="S";
        //Entrada - Proceso
        while (continuar.equals("S")) {
            System.out.println("Ingresar Estudiantes Aprobados y Reprobados:\nR=Reprobado\nA=Aprobado");
            Nota=lt.next().toUpperCase();
            if (Nota.charAt(0)=='R') {
                Reprobado++;
                
            } else if(Nota.charAt(0)=='A'){
                Aprobado++;
                
            } else{
                System.err.println("Ingrese la LETRA CORRECTA (A=Aprobado,R=Reprobado)");
            }
            System.out.println("Tiene mas Calificaciones?:\nS=Si\tN=No");
            continuar=lt.next().toUpperCase().equals("S")?"S":"N";
        }

        //Fin
        System.out.println("La cantidad de REPROBADOS es:" +Reprobado);
        System.out.println("La cantidad de APROBADOS es:" +Aprobado);
    }
    public static void main(String[] args) {
        NCalificaciones();
    }
}
