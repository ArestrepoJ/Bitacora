package semana7;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        int[] arr_int = new int[n];
        System.out.println("Ingrese " + n + " números enteros:");
        for (int i = 0; i < n; i++) {
            arr_int[i] = scanner.nextInt();
        }
        int[] arreglo2 = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo2[i] = arr_int[n - 1 - i];
        }
        System.out.println("Arreglo original:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr_int[i] + " ");
        }
        System.out.println("\nArreglo invertido:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo2[i] + " ");
        }
    }
}