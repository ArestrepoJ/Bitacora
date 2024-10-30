package semana9;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un String: ");
        String original = scanner.nextLine();
        StringBuilder invertido = new StringBuilder(original.length());
        for (int i = original.length() - 1; i >= 0; i--) {
            invertido.append(original.charAt(i));
        }
        System.out.println("String invertido: " + invertido.toString());
    }
}
