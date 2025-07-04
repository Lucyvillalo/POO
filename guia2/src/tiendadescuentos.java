import javax.swing.JOptionPane;

public class tiendadescuentos {

        public static void main(String[] args) {
            String color = JOptionPane.showInputDialog("Ingrese el color de la bolita de descuento:");
            double montoCompra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la compra:"));
            double descuento = 0;

            if (color.equalsIgnoreCase("rojo")) {
                descuento = montoCompra * 0.10;
                JOptionPane.showMessageDialog(null, "Se aplicará el 10%: $" + descuento + "\nTotal a pagar: $" + (montoCompra - descuento));
            } else if (color.equalsIgnoreCase("verde")) {
                descuento = montoCompra * 0.05;
                JOptionPane.showMessageDialog(null, "Se aplicará el 5%: $" + descuento + "\nTotal a pagar: $" + (montoCompra - descuento));
            } else if (color.equalsIgnoreCase("blanco")) {
                JOptionPane.showMessageDialog(null, "No tiene acceso a un descuento.\nTotal a pagar: $" + montoCompra);
            } else {
                JOptionPane.showMessageDialog(null, "Color inválido. Por favor ingrese rojo, verde o blanco.");
            }
        }
    }
