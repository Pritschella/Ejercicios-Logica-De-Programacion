import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar el día de la semana
        System.out.print("Ingrese un día de la semana (Lunes - Viernes): ");
        String diaSemana = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para facilitar la comparación

        // Solicitar la hora
        System.out.print("Ingrese la hora (0-23): ");
        int hora = scanner.nextInt();

        // Solicitar los minutos
        System.out.print("Ingrese los minutos (0-59): ");
        int minutos = scanner.nextInt();

        // Calcular los minutos faltantes para el fin de semana
        int minutosFaltantes = calcularMinutosFaltantes(diaSemana, hora, minutos);

        // Mostrar el resultado
        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");
    }

    public static int calcularMinutosFaltantes(String diaSemana, int hora, int minutos) {
        int minutosDiaActual = hora * 60 + minutos;
        int minutosViernesInicioFinDeSemana = 15 * 60;

        int minutosFaltantes = 0;

        switch (diaSemana) {
            case "lunes":
                minutosFaltantes = (4 * 24 * 60) - minutosDiaActual + minutosViernesInicioFinDeSemana;
                break;
            case "martes":
                minutosFaltantes = (3 * 24 * 60) - minutosDiaActual + minutosViernesInicioFinDeSemana;
                break;
            case "miércoles":
                minutosFaltantes = (2 * 24 * 60) - minutosDiaActual + minutosViernesInicioFinDeSemana;
                break;
            case "jueves":
                minutosFaltantes = (1 * 24 * 60) - minutosDiaActual + minutosViernesInicioFinDeSemana;
                break;
            case "viernes":
                if (hora < 15) {
                    minutosFaltantes = minutosViernesInicioFinDeSemana - minutosDiaActual;
                } else {
                    minutosFaltantes = (3 * 24 * 60) - minutosDiaActual; // Fin de semana siguiente
                }
                break;
            default:
                minutosFaltantes = 0; // Para cualquier otro día, ya es fin de semana
                break;
        }

        return minutosFaltantes;

    }// main

}// class