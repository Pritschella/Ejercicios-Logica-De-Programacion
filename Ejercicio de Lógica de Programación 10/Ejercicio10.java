import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        // Crear un diccionario Español-Inglés
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("manzana", "apple");
        // Agrega más palabras y traducciones aquí...

        // Seleccionar 5 palabras al azar del diccionario
        String[] palabrasEspanol = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasSeleccionadas = new String[5];
        for (int i = 0; i < 5; i++) {
            int indiceAleatorio = random.nextInt(palabrasEspanol.length);
            palabrasSeleccionadas[i] = palabrasEspanol[indiceAleatorio];
        }

        // Pedir al usuario las traducciones al inglés
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        for (String palabraEspanol : palabrasSeleccionadas) {
            System.out.print("Traduzca '" + palabraEspanol + "' al inglés: ");
            String respuestaUsuario = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para facilitar la
                                                                        // comparación

            if (diccionario.containsKey(palabraEspanol)) {
                String traduccionCorrecta = diccionario.get(palabraEspanol);
                if (respuestaUsuario.equals(traduccionCorrecta)) {
                    System.out.println("¡Correcto!");
                    respuestasCorrectas++;
                } else {
                    System.out.println("Incorrecto. La respuesta correcta es: " + traduccionCorrecta);
                    respuestasIncorrectas++;
                }
            }
        }

        // Mostrar el resultado
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

    }// main

}// clas