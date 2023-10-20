import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Solicitar al usuario 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Encontrar los números primos y colocarlos al principio del array
        int[] primos = new int[10];
        int[] noPrimos = new int[10];
        int contadorPrimos = 0;
        int contadorNoPrimos = 0;

        for (int numero : numeros) {
            if (esPrimo(numero)) {
                primos[contadorPrimos] = numero;
                contadorPrimos++;
            } else {
                noPrimos[contadorNoPrimos] = numero;
                contadorNoPrimos++;
            }
        }

        // Mostrar el array con números primos al principio
        System.out.println("\nEl Array con números primos al inicio es:");
        for (int i = 0; i < contadorPrimos; i++) {
            System.out.println("posicón[" + i + "] = " + primos[i]);
        }

        // Mostrar el resto de los números
        for (int i = 0; i < contadorNoPrimos; i++) {
            System.out.println("posición[" + (contadorPrimos + i) + "] = " + noPrimos[i]);
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;

    }// main

}// class
