package semana8;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio3parte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Ingrese el número de filas (m): ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int n = scanner.nextInt();
        int[][] matriz = new int[m][n];
        int[] sumas = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(11);
            }
        }
        for (int i = 0; i < m; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += matriz[i][j];
            }
            sumas[i] = sumaFila;
        }
        System.out.println("Ejercicio6 generada:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" | Suma: " + sumas[i]);
        }
    }
}

