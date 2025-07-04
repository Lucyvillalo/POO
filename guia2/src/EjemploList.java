import java.util.*;

public class EjemploList {
    public static void main(String[] args) {
        ArrayList<String> listaPersona = new ArrayList<>();

        // Agregando elementos
        listaPersona.add("Marie Curie");
        listaPersona.add("Benjamin Franklin");
        listaPersona.add("Marco Antonio");
        listaPersona.add(1, "Juan Murillo");

        // Mostrar contenido de ArrayList
        System.out.println("USO DE ARRAYLIST");
        System.out.println("Contenido de listaPersona: " + listaPersona + "\n");

        // Obteniendo posición de un elemento
        int pos = listaPersona.indexOf("Benjamin Franklin");
        System.out.println("El índice de Benjamin Franklin es: " + pos);

        // Verificando si lista está vacía
        boolean check = listaPersona.isEmpty();
        System.out.println("¿Está vacía la lista?: " + check);

        // Obteniendo tamaño de lista
        int size = listaPersona.size();
        System.out.println("Tamaño de listaPersona: " + size);

        // Verificando si un elemento está incluido en la lista
        boolean elemento = listaPersona.contains("Marco Antonio");
        System.out.println("¿Contiene 'Marco Antonio'?: " + elemento);

        // Obteniendo elemento de una posición específica
        String item = listaPersona.get(0);
        System.out.println("Elemento en índice 0: " + item);

        // Recuperando elementos con for clásico
        System.out.println("\nRecuperando elementos con FOR:");
        for (int i = 0; i < listaPersona.size(); i++) {
            System.out.println("Índice: " + i + " - Elemento: " + listaPersona.get(i));
        }

        // Recuperando elementos con foreach
        System.out.println("\nRecuperando elementos con FOREACH:");
        for (String persona : listaPersona) {
            System.out.println("Elemento: " + persona);
        }

        // Recuperando elementos con Iterator
        System.out.println("\nRecuperando elementos con ITERATOR:");
        for (Iterator<String> it = listaPersona.iterator(); it.hasNext(); ) {
            System.out.println("Elemento: " + it.next());
        }

        // Reemplazando un elemento
        listaPersona.set(1, "Nikola Tesla");
        System.out.println("\nDespués de reemplazo: " + listaPersona);

        // Eliminando elemento en posición 0
        listaPersona.remove(0);
        System.out.println("\nDespués de eliminar índice 0: " + listaPersona);

        // Convirtiendo a Array
        String[] simpleArray = listaPersona.toArray(new String[listaPersona.size()]);
        System.out.println("\nArray resultante: " + Arrays.toString(simpleArray));
    }
}
