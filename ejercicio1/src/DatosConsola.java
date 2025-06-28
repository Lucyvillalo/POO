import java.util.Scanner;

public class DatosConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese sus nombres: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese sus apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpia el salto de línea

        System.out.print("Ingrese su carrera: ");
        String carrera = scanner.nextLine();

        System.out.println("\n--- Información Ingresada ---");
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
    }
}
