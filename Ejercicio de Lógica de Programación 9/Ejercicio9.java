import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        // Crear un diccionario Español-Inglés
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("manzana", "apple");
        // Agrega más palabras y traducciones aquí...

        // Solicitar una palabra en español al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra en español: ");
        String palabraEspanol = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para facilitar la búsqueda

        // Buscar la traducción en el diccionario
        if (diccionario.containsKey(palabraEspanol)) {
            String palabraIngles = diccionario.get(palabraEspanol);
            System.out.println("La traducción al inglés es: " + palabraIngles);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }

    }// main

}// class
