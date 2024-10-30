package semana7;
class Ejercicio2 {
    public static void main(String[] args) {
        int n = 10;
        int[] arreglo1 = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo1[i] = i + 1;
        }
        int[] arreglo2 = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo2[i] = arreglo1[n - 1 - i];
        }
        System.out.println("Arreglo 1:");
        for (int num : arreglo1) {
            System.out.print(num + " ");
        }
        System.out.println("\nArreglo 2 (invertido):");
        for (int num : arreglo2) {
            System.out.print(num + " ");
        }
    }
}

