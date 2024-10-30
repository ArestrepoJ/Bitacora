package semana7;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número par para el tamaño del arreglo: ");
        int n = scanner.nextInt();
        while (n % 2 != 0) {
            System.out.print("El número debe ser par. Ingrese nuevamente: ");
            n = scanner.nextInt();
        }
        int[] arreglo1 = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo1[i] = i + 1;
        }
        float[] arreglo2 = new float[n / 2];
        for (int j = 0; j < n / 2; j++) {
            arreglo2[j] = (arreglo1[2 * j] + arreglo1[2 * j + 1]) / 2.0f;
        }
        System.out.println("Arreglo 1:");
        for (int valor : arreglo1) {
            System.out.print(valor + " ");
        }
        System.out.println();
        System.out.println("Arreglo 2 (promedios):");
        for (float valor : arreglo2) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}