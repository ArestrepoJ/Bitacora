package semana9;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabara o frase: ");
        String texto = scanner.nextLine();
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contador++;
            }
        }
        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en el string.");
    }
}
