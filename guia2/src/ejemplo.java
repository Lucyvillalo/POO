import java.util.ArrayList;
import java.util.List;

public class ejemplo1 {
    public static void main(String[] args) {
       List<String> nombre = new ArrayList<>();
       nombre.add("Juan");
       nombre.add("Maria");
       nombre.add("Pedro");

       for (String nombreactual : nombre) {
           System.out.println( "nombre:" + nombreactual);
        }
    }
}
