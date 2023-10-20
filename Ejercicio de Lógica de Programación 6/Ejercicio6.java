import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner frase = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String palabra = frase.nextLine();
        String invertida = invertirTexto(palabra);
        System.out.println("Texto invertido: " + invertida);
        frase.close();
    }

    public static String invertirTexto(String var0) {
        StringBuilder var1 = new StringBuilder(var0);
        return var1.reverse().toString();

    }// main

}// class
