import javax.swing.JOptionPane;

public class notasalumno {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Ingrese la nota del alumno:");
        double nota = Double.parseDouble(entrada);

        if (nota >= 7.0) {
            JOptionPane.showMessageDialog(null, " El alumno ha aprobado la materia.");
        } else if (nota >= 6.50 && nota <= 6.99) {
            JOptionPane.showMessageDialog(null, " El alumno puede realizar un examen de suficiencia para aprobar.");
        } else {
            JOptionPane.showMessageDialog(null, " El alumno ha reprobado la materia.");
        }
    }
}
