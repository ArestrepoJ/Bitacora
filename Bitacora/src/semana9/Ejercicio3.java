package semana9;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la primer entrada (entrada1): ");
        String string1 = scanner.nextLine();
        System.out.print("Introduce la segunda entrada (entrada2): ");
        String string2 = scanner.nextLine();
        if (string1.length() > string2.length()) {
            if (string1.contains(string2)) {
                System.out.println("La entrada2 es un substring de Entrada1.");
            } else {
                System.out.println("la entrada2 NO es un substring de Entrada1.");
            }
        } else {
            System.out.println("El tamaño de la entrada1 debe ser mayor que el de la entrada2.");
        }
    }
}
