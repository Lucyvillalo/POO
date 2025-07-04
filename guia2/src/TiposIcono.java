import javax.swing.JOptionPane;

public class TiposIcono {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Información", "Mensaje de Información", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Advertencia", "Mensaje de Advertencia", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Error", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Sin Icono", "Mensaje de Texto Plano", JOptionPane.PLAIN_MESSAGE);
    }
}
