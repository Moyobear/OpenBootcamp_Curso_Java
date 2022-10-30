import java.util.ArrayList;
import java.util.HashMap;

public class Pruebas {
    
    public static void main(String[] args) {
        HashMap<Integer, String> listaProductos = new HashMap<>();
        listaProductos.put(1, "Pan");
        listaProductos.put(2, "Carne");
        listaProductos.put(3, "Queso");
        listaProductos.put(4, "Leche");
        listaProductos.put(5, "Huevos");
        
        String mostrar = mostrarProductos(listaProductos);
        System.out.println(mostrar);
        
        
        
    }
    
    
    
    public static String mostrarProductos(HashMap<Integer, String> listaProductos) {
        String value = "";
        ArrayList<String> productos = new ArrayList<>(listaProductos.values());
        System.out.println("Hay los siguientes productos:");
        for (String producto : productos) {
            value += producto + " ";
        }
        return value;
    }
}
