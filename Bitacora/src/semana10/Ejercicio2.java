package semana10;
import java.util.ArrayList;
public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> compañeros = new ArrayList<>();
        compañeros.add("Juan");
        compañeros.add("María");
        compañeros.add("Pedro");
        compañeros.add("Ana");
        compañeros.add("Andrés");
        System.out.println("Nombres de los compañeros de clase:");
        for (String compañero : compañeros) {
            System.out.println(compañero);
        }
    }
}
