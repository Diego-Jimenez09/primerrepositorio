import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        inizializar();
    }
    public static String palabraRandom(){
        Scanner es = new Scanner (System.in);
        Random ra = new Random();
        String eleccion = es.nextLine();
        int numeroAleatorio = ra.nextInt(10)-1;
        System.out.println(numeroAleatorio);
        int resultado;
        resultado = numeroAleatorio;
        return eleccion;
    }
    public static int crearAleatorio(){
        Random ra = new Random();
        return ra.nextInt(10);
    }
    public static String seleccionarPalabra(int aleatorio){
        String[] palabras={"palabra","segunda","tercera","cuarta","quinta","sexta","caramelo","decimal","nueve","juan"};
        System.out.println(palabras[aleatorio]);
        return palabras[aleatorio];
    }
    public static void inizializar(){
        int aleatorio= crearAleatorio();
        seleccionarPalabra(aleatorio);
    }
}
