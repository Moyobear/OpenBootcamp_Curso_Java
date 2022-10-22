public class EjercicioTema2 {
    
    public static void main(String[] args) {
    double precio = 25.99;
    
    double precioFinal = precioConIva(precio);
    
        System.out.println(precioFinal);
    
    }
    
    static double precioConIva(double precio) {
        return precio + (precio * 0.12);
    }
}
