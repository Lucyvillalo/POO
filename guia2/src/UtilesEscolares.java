import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UtilesEscolares {
    public static void main(String[] args) {
        // Declarando HashMap
        HashMap<Integer, String> hmap = new HashMap<>();

        // Agregando elementos
        hmap.put(12, "Crayolas");
        hmap.put(2, "Lápices");
        hmap.put(7, "Borradores");
        hmap.put(49, "Colores");
        hmap.put(3, "Bolígrafos");

        // Mostrando contenido usando Iterator
        System.out.println("Contenido de HashMap:");
        Set<Map.Entry<Integer, String>> set = hmap.entrySet();
        Iterator<Map.Entry<Integer, String>> iterador = set.iterator();

        while (iterador.hasNext()) {
            Map.Entry<Integer, String> mentry = iterador.next();
            System.out.println("Clave: " + mentry.getKey() + " - Valor: " + mentry.getValue());
        }

        // Obtener valor en base a clave
        String valorClave2 = hmap.get(2);
        System.out.println("\nValor asociado a clave 2: " + valorClave2);

        // Remover elemento en base a clave
        hmap.remove(3);
        System.out.println("\nHashMap después de eliminar elemento con clave 3:");

        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " - Valor: " + entry.getValue());
        }
    }
}
