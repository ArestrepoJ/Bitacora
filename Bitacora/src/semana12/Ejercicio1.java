package semana12;
import java.util.Arrays;
public class Ejercicio1 {
    public static void main(String[] args) {
        char[][] sopa = {
                {'h', 'o', 'l', 'a', 'x'},
                {'a', 'p', 'a', 'p', 'a'},
                {'e', 'a', 'f', 'i', 't'},
                {'l', 'e', 't', 'r', 'a'},
                {'x', 'y', 'z', 'w', 'v'}
        };
        String[] palabras = {"hola", "papa", "eafit", "ejemplo"};
        buscarPalabras(sopa, palabras);
    }
    public static void buscarPalabras(char[][] sopa, String[] palabras) {
        int n = sopa.length;
        int m = sopa[0].length;
        int pasos = 0;
        for (String palabra : palabras) {
            boolean encontrada = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (buscarPalabra(sopa, palabra, i, j)) {
                        System.out.println("Palabra: " + palabra + " encontrada en: (" + i + ", " + j + ")");
                        encontrada = true;
                    }
                    pasos++;
                }
            }
            if (!encontrada) {
                System.out.println("Palabra: " + palabra + " no encontrada.");
            }
        }
        System.out.println("Número total de pasos: " + pasos);
    }
    public static boolean buscarPalabra(char[][] sopa, String palabra, int x, int y) {
        int n = sopa.length;
        int m = sopa[0].length;
        int longitud = palabra.length();
        int[][] direcciones = {
                {0, 1},
                {0, -1},
                {1, 0},
                {-1, 0},
                {1, 1},
                {-1, -1},
                {1, -1},
                {-1, 1}
        };
        for (int[] dir : direcciones) {
            int dx = dir[0];
            int dy = dir[1];
            if (validarPosicion(sopa, palabra, x, y, dx, dy)) {
                return true;
            }
        }
        return false;
    }
    public static boolean validarPosicion(char[][] sopa, String palabra, int x, int y, int dx, int dy) {
        int n = sopa.length;
        int m = sopa[0].length;
        int longitud = palabra.length();
        int nuevoX = x;
        int nuevoY = y;
        for (int k = 0; k < longitud; k++) {
            nuevoX = x + dx * k;
            nuevoY = y + dy * k;
            if (nuevoX < 0 || nuevoX >= n || nuevoY < 0 || nuevoY >= m) {
                return false;
            }
            if (sopa[nuevoX][nuevoY] != palabra.charAt(k)) {
                return false;
            }
        }
        return true;
    }
}