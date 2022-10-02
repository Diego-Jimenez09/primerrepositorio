import java.util.Random;
import java.util.Scanner;
/**Ultima version*/

public class Ahorcado {
    public static void main(String[] args) {
        ejecutarPrincipal();
    }
    public static char[] separa(String palAzar){
        char[] letras;
        letras = new char[palAzar.length()];
        for(int i = 0; i < palAzar.length(); i++){
            letras[i] = palAzar.charAt(i);
        }
        return letras;
    }
    private static void imprimeOculta(char[] tusRespuestas){

        for(int i = 0; i < tusRespuestas.length; i++){
            System.out.print(tusRespuestas[i]);
        }
    }
    public static void ejecutarPrincipal(){
        int intentosTotales = 10; // Constante con el limite de fallos
        int intentos = 0;
        int aciertos = 0;
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        char resp;
        Random rnd = new Random();
        String arrayPalabras[] = {"palabra","segunda","tercera","cuarta","quinta","sexta","caramelo","decimal","nueve","juan"};
        int alea = rnd.nextInt(10);
        char[] separada = separa(arrayPalabras[alea]);
        char[] copia = separa(arrayPalabras[alea]); // Algo auxiliar para mas tarde
        char[] tusRespuestas = new char[separada.length];

        // Rellena palabras con guiones
        for(int i = 0; i < tusRespuestas.length; i++){
            tusRespuestas[i] = '_';
        }
        System.out.println("Adivina la palabra!");
        while(intentos < intentosTotales && aciertos != tusRespuestas.length){
            imprimeOculta(tusRespuestas);
            System.out.println("\nIntroduce una letra: ");
            resp = teclado.next().toLowerCase().charAt(0);
            for(int i = 0; i < separada.length; i++){
                if(separada[i]==resp){
                    tusRespuestas[i] = separada[i];
                    separada[i] = ' ';
                    aciertos++;
                }
            }
            intentos++;
        }
        // Si se hacierta todas imprime mensaje
        if(aciertos == tusRespuestas.length){
            System.out.print("\nFalicidades!! has acertado la palabra: ");
            imprimeOculta(tusRespuestas);
        }
        // Si no otro
        else{
            System.out.print("\nHas fallado! la palabra era: ");
            for(int i = 0; i < copia.length; i++){
                System.out.print(copia[i] + " ");
            }
        }
    }
}
