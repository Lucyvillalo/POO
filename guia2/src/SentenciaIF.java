import javax.swing.*;

public class SentenciaIF {
    public static void main(String[] args) {
        String datos;
        double sueldo, afp = 0, isss, totalre, nsueldo, renta;

        datos = JOptionPane.showInputDialog("Ingrese el sueldo del empleado(a):");
        sueldo = Double.parseDouble(datos);

        if (sueldo > 300) {
            afp = sueldo * 0.0625;
        }

        JOptionPane.showMessageDialog(null, "A este empleado tiene un sueldo de $" + sueldo +
                "\nEl descuento del AFP es $" + afp);

        datos = (String) JOptionPane.showInputDialog(null,
                "Ingrese el Sexo:\nSi es Masculino (M)\nSi es Femenino (F)",
                "Sexo del Empleado",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"M", "F"},
                "F");

        if ("M".equals(datos)) {
            isss = sueldo * 0.03;
            renta = sueldo * 0.10;
            totalre = afp + isss + renta;
            nsueldo = sueldo - totalre;

            JOptionPane.showMessageDialog(null, "A este empleado se le detiene $" + isss +
                    " en concepto de ISSS\nAdemás se le retiene $" + renta + " en concepto de Renta\n" +
                    "Lo que hace un total de $" + totalre +
                    "\nY su nuevo sueldo es de $" + nsueldo);
        }
    }
}
