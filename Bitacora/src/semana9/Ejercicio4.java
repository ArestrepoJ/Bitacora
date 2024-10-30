package semana9;
public class Ejercicio4 {
    public static void main(String[] args) {
        String str1 = "Esta es una prueba de string, que verifica donde esta un string";
        String str2 = "esta";
        String str3 = "string";
        String str1Lower = str1.toLowerCase();
        System.out.println("Posiciones de \"" + str2 + "\":");
        findPositions(str1Lower, str2.toLowerCase());
        System.out.println("Posiciones de \"" + str3 + "\":");
        findPositions(str1Lower, str3.toLowerCase());
    }
    private static void findPositions(String str, String substring) {
        int index = str.indexOf(substring);
        while (index >= 0) {
            System.out.println("Encontrado en la posición: " + index);
            index = str.indexOf(substring, index + 1);
        }
    }
}
