package semana8;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Ingrese el tamaño de la matriz (n): ");
        int n = scanner.nextInt();
        int[][] matriz1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz1[i][j] = random.nextInt(100);
            }
        }
        int[][] matriz2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }
        System.out.println("Diagonal de la matriz transpuesta (matriz2):");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz2[i][i] + " ");
        }
    }
}