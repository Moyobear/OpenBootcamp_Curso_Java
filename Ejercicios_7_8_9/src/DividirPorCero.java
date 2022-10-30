import java.util.Scanner;

public class DividirPorCero {
    private static int dividePorCero(int a, int b) throws ArithmeticException {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 números para dividirlos: ");
        int num1 = scanner.nextInt();
        System.out.println("Primer número es: " +num1);
        int num2 = scanner.nextInt();
        System.out.println("Segundo número es: " + num2);
        
        try{
            int resultado = dividePorCero(num1, num2);
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse " + e.getMessage());
        } finally {
            System.out.println("Demo de código");
        }
    
        
        
        
    }
}
