import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class LeerTeclado {
    
BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"


public int print(String mensaje,int valor) {
    System.out.println(mensaje+":");
    try {
        valor=Integer.parseInts(br.readLine())
    } catch (Exception e) {
        System.err.println("el valor que ingresó es incorrecto");
    }
    return valor;
}

public String print(String mensaje,String valor) {
    return 0;
}

public float print(String mensaje,float valor) {
    return 0;
}

public double print(String mensaje,double valor) {
    return 0;
}

public boolean print(String mensaje,boolean valor) {
    return true;
}



}
