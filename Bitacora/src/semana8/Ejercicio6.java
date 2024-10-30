package semana8;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio6 {
    private int[][] matriz;
    private int n;
    public Ejercicio6(int n) {
        this.n = n;
        this.matriz = new int[n][n];
    }
    public void llenarConUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los números para llenar la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    public void llenarConAleatorios() {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
    }
    public void imprimirMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public int sumaFila(int j) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[j][i];
        }
        return suma;
    }
    public int sumaColumna(int i) {
        int suma = 0;
        for (int j = 0; j < n; j++) {
            suma += matriz[j][i];
        }
        return suma;
    }
    public void imprimirDiagonalPrincipal() {
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println();
    }
    public int sumaDiagonalPrincipal() {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }
    public int sumaTotal() {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
    public double promedio() {
        return (double) sumaTotal() / (n * n);
    }
    public void maximoValor() {
        int max = matriz[0][0];
        int posX = 0, posY = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    posX = i;
                    posY = j;
                }
            }
        }
        System.out.println("Valor máximo: " + max + " en la posición [" + posX + "][" + posY + "]");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la Matriz (n): ");
        int n = scanner.nextInt();
        Ejercicio6 ejercicio6 = new Ejercicio6(n);
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Llenar Matriz con números del usuario");
            System.out.println("2. Llenar Matriz con números aleatorios");
            System.out.println("3. Imprimir Matriz");
            System.out.println("4. Sumar una fila");
            System.out.println("5. Sumar una columna");
            System.out.println("6. Imprimir diagonal principal");
            System.out.println("7. Sumar diagonal principal");
            System.out.println("8. Sumar todos los valores de la Matriz");
            System.out.println("9. Valor promedio de la Matriz");
            System.out.println("10. Encontrar valor máximo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    ejercicio6.llenarConUsuario();
                    break;
                case 2:
                    ejercicio6.llenarConAleatorios();
                    break;
                case 3:
                    ejercicio6.imprimirMatriz();
                    break;
                case 4:
                    System.out.print("Ingrese el índice de la fila a sumar: ");
                    int fila = scanner.nextInt();
                    System.out.println("Suma de la fila: " + ejercicio6.sumaFila(fila));
                    break;
                case 5:
                    System.out.print("Ingrese el índice de la columna a sumar: ");
                    int columna = scanner.nextInt();
                    System.out.println("Suma de la columna: " + ejercicio6.sumaColumna(columna));
                    break;
                case 6:
                    System.out.print("Diagonal principal: ");
                    ejercicio6.imprimirDiagonalPrincipal();
                    break;
                case 7:
                    System.out.println("Suma de la diagonal principal: " + ejercicio6.sumaDiagonalPrincipal());
                    break;
                case 8:
                    System.out.println("Suma total de la Matriz: " + ejercicio6.sumaTotal());
                    break;
                case 9:
                    System.out.println("Valor promedio de la Matriz: " + ejercicio6.promedio());
                    break;
                case 10:
                    ejercicio6.maximoValor();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }
}
