package semana10;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = leerValores();
        int suma = calcularSuma(valores);
        double promedio = (valores.size() > 0) ? (double) suma / valores.size() : 0;
        System.out.println("Número de valores leídos: " + valores.size());
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        int menores = calcularNroMenores(valores, promedio);
        int mayores = calcularNroMayores(valores, promedio);
        System.out.println("Número de elementos menores al promedio: " + menores);
        System.out.println("Número de elementos mayores o iguales al promedio: " + mayores);
        mostrarMenores(valores, promedio);
        mostrarMayores(valores, promedio);
    }
    public static ArrayList<Integer> leerValores() {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Introduce números enteros (0 o negativo para terminar):");
        while (true) {
            numero = scanner.nextInt();
            if (numero <= 0) {
                break;
            }
            lista.add(numero);
        }
        return lista;
    }
    public static int calcularSuma(ArrayList<Integer> lista) {
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);
        }
        return suma;
    }
    public static int calcularNroMenores(ArrayList<Integer> lista, double promedio) {
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < promedio) {
                contador++;
            }
        }
        return contador;
    }
    public static int calcularNroMayores(ArrayList<Integer> lista, double promedio) {
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) >= promedio) {
                contador++;
            }
        }
        return contador;
    }
    public static void mostrarMenores(ArrayList<Integer> lista, double promedio) {
        System.out.println("Valores menores al promedio:");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < promedio) {
                System.out.println(lista.get(i));
            }
        }
    }
    public static void mostrarMayores(ArrayList<Integer> lista, double promedio) {
        System.out.println("Valores mayores o iguales al promedio:");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) >= promedio) {
                System.out.println(lista.get(i));
            }
        }
    }
}