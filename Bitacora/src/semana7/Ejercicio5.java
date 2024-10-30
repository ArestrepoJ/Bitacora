package semana7;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        int[] arreglo1 = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo1[i] = i + 1;
        }
        System.out.println("Arreglo original:");
        mostrarArreglo(arreglo1);
        for (int i = 0; i < n / 2; i++) {
            int temp = arreglo1[i];
            arreglo1[i] = arreglo1[n - 1 - i];
            arreglo1[n - 1 - i] = temp;
        }
        System.out.println("Arreglo invertido:");
        mostrarArreglo(arreglo1);

        scanner.close();
    }
    public static void mostrarArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}