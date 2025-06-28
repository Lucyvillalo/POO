import java.util.Scanner;

public class LecturaParametros {
    public static void main(String[] args) {
        String parametro1, parametro2;

        if (args.length >= 2) {
            parametro1 = args[0];
            parametro2 = args[1];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" No se ingresaron parámetros desde consola.");
            System.out.print("Por favor, escriba el primer parámetro: ");
            parametro1 = scanner.nextLine();

            System.out.print("Escriba el segundo parámetro: ");
            parametro2 = scanner.nextLine();
        }

        System.out.println("Parámetro 1: " + parametro1);
        System.out.println("Parámetro 2: " + parametro2);
    }
}
