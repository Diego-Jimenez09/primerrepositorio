import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        palabraRandom();
    }
    public static void palabraRandom(){
        Scanner es = new Scanner (System.in);
        Random ra = new Random();
        String eleccion = es.nextLine();
        int numeroAleatorio = ra.nextInt(10);
        System.out.println(numeroAleatorio);
        int resultado;
        resultado = numeroAleatorio;

        switch (resultado) {
            case 0:
                System.out.println("Computador");
                break;
            case 1:
                System.out.println("Sout");
                break;
            case 2:
                System.out.println("Tijeras");
                break;
            case 3:
                System.out.println("Palabra");
                break;
            case 4:
                System.out.println("Segundo");
            case 5:
                System.out.println("");
            case 6:
                String clase;
            case 7:
                String game;
            case 8:
        }
    }
}
