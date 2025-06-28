import javax.swing.JOptionPane;

public class DatosEstudiante {
    public static void main(String[] args) {
        String nombres = JOptionPane.showInputDialog("Ingrese sus nombres:");
        String apellidos = JOptionPane.showInputDialog("Ingrese sus apellidos:");
        String edadTexto = JOptionPane.showInputDialog("Ingrese su edad:");
        String carrera = JOptionPane.showInputDialog("Ingrese su carrera:");

        // Convertir edad a entero (opcional si deseas validarlo después)
        int edad = Integer.parseInt(edadTexto);

        // Crear mensaje con saltos de línea
        String mensaje = "Nombres: " + nombres +
                "\nApellidos: " + apellidos +
                "\nEdad: " + edad +
                "\nCarrera: " + carrera;

        // Mostrar todo en un solo cuadro de diálogo
        JOptionPane.showMessageDialog(null, mensaje, "Datos Ingresados", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
