import javax.swing.JOptionPane;

public class SumaEnteros {

    public static void main(String[] args) {
        String primernumero;
        String segundonumero;

        int numero1;
        int numero2;
        int suma;

        primernumero = JOptionPane.showInputDialog("Digite el primer número:");
        numero1 = Integer.parseInt(primernumero);

        if (numero1 < 0) {
            JOptionPane.showMessageDialog(null, "⚠️ No se permiten números negativos", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        segundonumero = JOptionPane.showInputDialog("Digite el segundo número:");
        numero2 = Integer.parseInt(segundonumero);

        if (numero2 < 0) {
            JOptionPane.showMessageDialog(null, "⚠️ No se permiten números negativos", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        suma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "La suma es: " + suma, "Resultado", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
