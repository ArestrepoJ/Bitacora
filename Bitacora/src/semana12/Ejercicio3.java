package semana12;
import java.util.Scanner;

public class Ejercicio3 {
    static int num = 0;
    static int n = 1000;
    static int[] arreglo = new int[n];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int elemento;
        int result;
        do {
            opcion = leerMenu();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a adicionar: ");
                    elemento = scanner.nextInt();
                    result = adicionarElemento(arreglo, elemento);
                    System.out.println("Número de pasos para adicionar: " + result);
                    break;
                case 2:
                    System.out.print("Ingrese el elemento a borrar: ");
                    elemento = scanner.nextInt();
                    result = borrarElemento(arreglo, elemento);
                    System.out.println("Número de pasos para borrar: " + result);
                    break;
                case 3:
                    imprimirArreglo(arreglo, num);
                    break;
                case 4:
                    result = tamanoArreglo(arreglo);
                    System.out.println("Tamaño actual del arreglo: " + result);
                    break;
                case 5:
                    System.out.print("Ingrese el elemento a buscar: ");
                    elemento = scanner.nextInt();
                    int pos = buscarArreglo(arreglo, elemento);
                    System.out.println("La posición del elemento es: " + pos);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
    static int leerMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Adicionar elemento");
        System.out.println("2. Borrar elemento");
        System.out.println("3. Imprimir arreglo");
        System.out.println("4. Tamaño del arreglo");
        System.out.println("5. Buscar elemento");
        System.out.println("0. Salir");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    static int adicionarElemento(int[] arr, int elemento) {
        int pasos = 0;
        int i = num - 1;
        while (i >= 0 && arr[i] > elemento) {
            arr[i + 1] = arr[i];
            i--;
            pasos++;
        }
        arr[i + 1] = elemento;
        num++;
        pasos++;
        return pasos;
    }
    static int borrarElemento(int[] arr, int elemento) {
        int pasos = 0;
        int pos = buscarArreglo(arr, elemento);
        if (pos != -1) {
            for (int i = pos; i < num - 1; i++) {
                arr[i] = arr[i + 1];
                pasos++;
            }
            num--;
            pasos++;
            return pasos;
        }
        return pasos;
    }
    static void imprimirArreglo(int[] arr, int size) {
        System.out.print("Arreglo: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int tamanoArreglo(int[] arr) {
        return num;
    }
    static int buscarArreglo(int[] arr, int elemento) {
        for (int i = 0; i < num; i++) {
            if (arr[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
}