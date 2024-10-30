package semana7;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int x = scanner.nextInt();
        int[] arr_int = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Ingrese el número entero " + (i + 1) + ": ");
            int num = scanner.nextInt();
            arr_int[i] = num * 2;
        }
        System.out.println("Los valores del arreglo multiplicados por tres son:");
        for (int valor : arr_int) {
            System.out.println(valor * 3);
        }
    }
}
