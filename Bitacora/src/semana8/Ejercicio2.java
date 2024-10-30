package semana8;
public class Ejercicio2 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matriz = crearMatriz(n);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] crearMatriz(int n) {
        int[][] matriz = new int[n][n];
        int contador = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }
        return matriz;
    }
}
