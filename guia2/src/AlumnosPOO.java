import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AlumnosPOO {
    public static void main(String[] args) {
        HashMap<String, String> estudiantes = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        System.out.println("=== Sistema de Gestión de Alumnos POO ===");

        while (opcion != 4) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ingreso de estudiante");
            System.out.println("2. Ver estudiantes");
            System.out.println("3. Buscar estudiante por carnet");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpia el buffer
            } else {
                System.out.println("La entrada no fue válida. Ingrese un número.");
                scanner.nextLine();
                continue;
            }

            if (opcion == 1) {
                System.out.print("Ingrese carnet del estudiante: ");
                String carnet = scanner.nextLine();
                System.out.print("Ingrese nombre del estudiante: ");
                String nombre = scanner.nextLine();
                estudiantes.put(carnet, nombre);
                System.out.println("Estudiante agregado correctamente.");
            }

            if (opcion == 2) {
                System.out.println("\nLista de estudiantes:");
                Set<Map.Entry<String, String>> conjunto = estudiantes.entrySet();
                Iterator<Map.Entry<String, String>> iterador = conjunto.iterator();
                if (!iterador.hasNext()) {
                    System.out.println("No hay estudiantes registrados.");
                }
                while (iterador.hasNext()) {
                    Map.Entry<String, String> entry = iterador.next();
                    System.out.println("Carnet: " + entry.getKey() + " - Nombre: " + entry.getValue());
                }
            }

            if (opcion == 3) {
                System.out.print("Ingrese el carnet a buscar: ");
                String buscar = scanner.nextLine();
                if (estudiantes.containsKey(buscar)) {
                    String nombre = estudiantes.get(buscar);
                    System.out.println("Estudiante encontrado: " + nombre);
                } else {
                    System.out.println("No existe ese carnet en la lista.");
                }
            }

            if (opcion == 4) {
                System.out.println("Programa finalizado.");
            }

            if (opcion < 1 || opcion > 4) {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}

