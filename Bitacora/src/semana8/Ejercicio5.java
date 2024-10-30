package semana8;
import java.util.Scanner;
public class Ejercicio5 {
    static String[][] matrizEstudiantes = new String[4][100];
    static int n = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Leer datos de un estudiante");
            System.out.println("2. Imprimir datos de un estudiante por ID");
            System.out.println("3. Imprimir número de estudiantes en un rango de edad");
            System.out.println("4. Imprimir todos los estudiantes");
            System.out.println("5. Imprimir estudiantes de un año determinado");
            System.out.println("6. Imprimir promedio de materias");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    leerEstudiante(scanner);
                    break;
                case 2:
                    buscarEstudiantePorId(scanner);
                    break;
                case 3:
                    contarEstudiantesPorRangoEdad(scanner);
                    break;
                case 4:
                    imprimirTodosLosEstudiantes();
                    break;
                case 5:
                    imprimirEstudiantesPorAnio(scanner);
                    break;
                case 6:
                    imprimirPromedioMaterias();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
    static void leerEstudiante(Scanner scanner) {
        if (n >= 100) {
            System.out.println("No se pueden agregar más estudiantes.");
            return;
        }
        System.out.print("Ingrese el índice del estudiante (0 a " + (n-1) + "): ");
        int i = scanner.nextInt();
        if (i < 0 || i >= n) {
            System.out.println("Índice inválido.");
            return;
        }
        System.out.print("Ingrese ID: ");
        matrizEstudiantes[0][i] = scanner.next();
        System.out.print("Ingrese Edad: ");
        matrizEstudiantes[1][i] = scanner.next();
        System.out.print("Ingrese Año de Nacimiento: ");
        matrizEstudiantes[2][i] = scanner.next();
        System.out.print("Ingrese Número de Materias: ");
        matrizEstudiantes[3][i] = scanner.next();
        System.out.println("Datos del estudiante guardados.");
    }
    static void buscarEstudiantePorId(Scanner scanner) {
        System.out.print("Ingrese el ID del estudiante: ");
        String idBuscado = scanner.next();
        for (int i = 0; i < n; i++) {
            if (matrizEstudiantes[0][i].equals(idBuscado)) {
                System.out.println("ID: " + matrizEstudiantes[0][i]);
                System.out.println("Edad: " + matrizEstudiantes[1][i]);
                System.out.println("Año de Nacimiento: " + matrizEstudiantes[2][i]);
                System.out.println("Número de Materias: " + matrizEstudiantes[3][i]);
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }
    static void contarEstudiantesPorRangoEdad(Scanner scanner) {
        System.out.print("Ingrese edad mínima: ");
        int edadMin = scanner.nextInt();
        System.out.print("Ingrese edad máxima: ");
        int edadMax = scanner.nextInt();
        int contador = 0;
        for (int i = 0; i < n; i++) {
            int edad = Integer.parseInt(matrizEstudiantes[1][i]);
            if (edad >= edadMin && edad <= edadMax) {
                contador++;
            }
        }
        System.out.println("Número de estudiantes en el rango de edad: " + contador);
    }
    static void imprimirTodosLosEstudiantes() {
        for (int i = 0; i < n; i++) {
            System.out.println("ID: " + matrizEstudiantes[0][i] +
                    ", Edad: " + matrizEstudiantes[1][i] +
                    ", Año de Nacimiento: " + matrizEstudiantes[2][i] +
                    ", Número de Materias: " + matrizEstudiantes[3][i]);
        }
    }
    static void imprimirEstudiantesPorAnio(Scanner scanner) {
        System.out.print("Ingrese el año: ");
        int anioBuscado = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int anioNacimiento = Integer.parseInt(matrizEstudiantes[2][i]);
            if (anioNacimiento == anioBuscado) {
                System.out.println("ID: " + matrizEstudiantes[0][i] +
                        ", Edad: " + matrizEstudiantes[1][i] +
                        ", Año de Nacimiento: " + matrizEstudiantes[2][i] +
                        ", Número de Materias: " + matrizEstudiantes[3][i]);
            }
        }
    }
    static void imprimirPromedioMaterias() {
        int sumaMaterias = 0;
        for (int i = 0; i < n; i++) {
            sumaMaterias += Integer.parseInt(matrizEstudiantes[3][i]);
        }
        double promedio = sumaMaterias / (double) n;
        System.out.println("Número promedio de materias: " + promedio);
    }
}