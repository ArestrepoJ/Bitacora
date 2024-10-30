package semana10;
import java.util.ArrayList;
import java.util.Iterator;
public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> compañeros = new ArrayList<>();
        compañeros.add("Juan");
        compañeros.add("María");
        compañeros.add("Carlos");
        compañeros.add("Ana");
        compañeros.add("Andrés");
        Iterator<String> iterator = compañeros.iterator();
        System.out.println("Nombres de los compañeros de clase:");
        while (iterator.hasNext()) {
            String nombre = iterator.next();
            System.out.println(nombre);
        }
    }
}

