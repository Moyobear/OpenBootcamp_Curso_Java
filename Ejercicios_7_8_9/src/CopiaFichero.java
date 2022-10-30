import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CopiaFichero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el fichero original");
        String fileIn = sc.nextLine();
        System.out.println("Introduce el fichero de destino: ");
        String fileOut = sc.nextLine();
        CopiaFichero(fileIn, fileOut);
        
    }
    
    private static void CopiaFichero(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();
            
            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}
