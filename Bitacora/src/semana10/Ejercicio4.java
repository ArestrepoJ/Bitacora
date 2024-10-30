package semana10;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        ArrayList<Integer> arregloDinamico = crearArreglo(n);
        int[] arregloEstatico = convertirArrDinamico(arregloDinamico);
        imprimirArrEst(arregloEstatico);
    }
    public static ArrayList<Integer> crearArreglo(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr.add(rand.nextInt(100));
        }
        return arr;
    }
    public static int[] convertirArrDinamico(ArrayList<Integer> arr) {
        int[] nuevoArreglo = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            nuevoArreglo[i] = arr.get(i);
        }
        return nuevoArreglo;
    }
    public static void imprimirArrEst(int[] arr) {
        System.out.print("Arreglo Estático: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
