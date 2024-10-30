package semana9;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String string1 = scanner.nextLine();
        String resultado = procesarString(string1);
        System.out.println("La nueva palabra o frase es: " + resultado);
    }
    public static String procesarString(String str) {
        int longitud = str.length();
        if (longitud % 2 == 0) {
            return "" + str.charAt(0) + str.charAt(longitud - 1);
        } else {
            int mitad = longitud / 2;
            return "" + str.charAt(0) + str.charAt(mitad) + str.charAt(longitud - 1);
        }
    }
}