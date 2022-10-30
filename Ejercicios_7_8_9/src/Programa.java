import java.util.*;

public class Programa {
    /*InputStream, PrintStream, excepciones, un HashMap y un ArrayList*/
    public static void main(String[] args) {
        
        try {
            HashMap<Integer, String> listaProductos = new HashMap<>();
            Scanner sc = new Scanner(System.in);
            int opcion = 0;
            int codigo;
            //String producto;
            
            do {
                System.out.println("Introduce el numero de la opción que quieras:");
                System.out.println("1.- Introducir producto");
                System.out.println("2.- Modificar producto");
                System.out.println("3.- Mostrar todos los productos");
                System.out.println("4.- Eliminar producto");
                System.out.println("5.- Salir");
                
                try {
                    opcion = sc.nextInt();
                } catch (InputMismatchException e) {
                    //System.out.println("Números inválidos " + e.getMessage());
                }
                
        
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el código del producto:");
                        codigo = sc.nextInt();
                        System.out.println("Introduce el nombre del producto:");
                        String temp = sc.nextLine();
                        guardarProducto(codigo, temp, listaProductos);
                        break;
                    case 2:
                        System.out.println("Introduce el código del producto al que quieres cambiar el nombre:");
                        codigo = sc.nextInt();
                        modificaProducto(codigo, listaProductos);
                        break;
                    case 3:
                        mostrarProductos(listaProductos);
                        break;
                    case 4:
                        System.out.println("Introduce el código del producto que quieres eliminar:");
                        codigo = sc.nextInt();
                        eliminaProducto(codigo, listaProductos);
                        break;
                    case 5:
                        System.out.println("Programa Finalizado");
                        break;
                    default:
                        System.out.println("Debes introducir una opción válida: del 1 al 5.");
                        break;
                }
        
        
            } while (sc.hasNext());
        } catch (Exception e) {
            System.out.println("Exception es: " + e.getClass());
        }
    
    
    }
    
    
    
    public static void guardarProducto(Integer codigo, String producto, HashMap<Integer,String> listaProductos){
        if (listaProductos.containsKey(codigo)) {
            System.out.println("No se puede introducir el producto. El código esta repetido!");
        } else {
            listaProductos.put(codigo, producto);
        }
    }
    
    public static void modificaProducto(Integer codigo, HashMap<Integer,String> listaProductos){
        if (listaProductos.containsKey(codigo)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el nombre del producto:");
            String temp = sc.nextLine();
            listaProductos.put(codigo, temp);
        } else {
            System.out.println("No hay ningún producto con ese código!");
        }
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
    
    public static void eliminaProducto(Integer codigo, HashMap<Integer,String> listaProductos) {
        if (listaProductos.containsKey(codigo)) {
            listaProductos.remove(codigo);
        } else {
            System.out.println("No hay ningún producto con ese código!");
        }
    }
   
    
}

