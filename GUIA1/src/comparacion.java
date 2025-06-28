import javax.swing.JOptionPane;

public class comparacion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String primernumero = JOptionPane.showInputDialog("Escriba el primer entero:");
        String segundonumero = JOptionPane.showInputDialog("Escriba el segundo entero:");

        int numero1 = Integer.parseInt(primernumero);
        int numero2 = Integer.parseInt(segundonumero);

        String resultado = "";

        if (numero1 == numero2) {
            resultado += numero1 + " == " + numero2;
        }
        if (numero1 != numero2) {
            resultado += "\n" + numero1 + " != " + numero2;
        }
        if (numero1 < numero2) {
            resultado += "\n" + numero1 + " < " + numero2;
        }
        if (numero1 > numero2) {
            resultado += "\n" + numero1 + " > " + numero2;
        }
        if (numero1 <= numero2) {
            resultado += "\n" + numero1 + " <= " + numero2;
        }
        if (numero1 >= numero2) {
            resultado += "\n" + numero1 + " >= " + numero2;
        }

        JOptionPane.showMessageDialog(null, resultado, "Resultado de la comparación", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
