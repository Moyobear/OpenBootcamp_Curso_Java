import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;



public class Main1 {
    
    public static String reverse(String texto) {
        String nuevaCadena = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            nuevaCadena = nuevaCadena + texto.charAt(i);
        }
        return nuevaCadena;
    }
    
    
    
    public static void main(String[] args) {
        
        //Dar vuelta al String
        System.out.println("Dar vuelta al String:");
        String cadena = "Esto es una cadena de prueba";
        String ejemplo = reverse(cadena);
    
        System.out.println(ejemplo);
        System.out.println("");
        
        //Array unidimensional
        System.out.println("Array unidimensional:");
        String [] nombres ={"Jonas", "Noel", "Castiel", "Sam", "Dean"};
    
        for(String nombre : nombres) {
            System.out.println(nombre);
        }
        System.out.println("");
    
        //Array bidimensional
        System.out.println("Array bidimensional:");
        int[][] bidimensional = new int[2][4];
        bidimensional[0][0] = 1;
        bidimensional[0][1] = 5;
        bidimensional[0][2] = 8;
        bidimensional[0][3] = 3;
    
        bidimensional[1][0] = 1;
        bidimensional[1][1] = 7;
        bidimensional[1][2] = 8;
        bidimensional[1][3] = 6;
        
        for (int i = 0; i < bidimensional.length; i++) {
            System.out.println("Fila: " + i);
            for (int j = 0; j < bidimensional[i].length; j++) {
                System.out.println("Fila: " + i + " Columna: " + j + " Valor: " + bidimensional[i][j]);
            }
        }
        System.out.println("");
        
        //Vector
        System.out.println("Vector:");
        Vector <String> vector = new Vector<>();
        vector.add("Orion");
        vector.add("Rigel");
        vector.add("Antares");
        vector.add("Betelgeuse");
        vector.add("Polar");
        
        vector.remove(1);
        vector.remove(2);
    
        System.out.println(vector);
        System.out.println("");
        
        /*El problema radica en el RESIZE que significa un enorme gasto computacional debido a las multiples copias
        que deberá realizar nuestro programa dentro de los arrays subyacentes para la migración de los datos a un array
        más grande*/
        
        //Arraylist => LinkedList
        System.out.println("Arraylist => LinkedList:");
        ArrayList <String> listArray = new ArrayList<>();
        listArray.add("Orion");
        listArray.add("Rigel");
        listArray.add("Antares");
        listArray.add("Betelgeuse");
    
        LinkedList<String> list = new LinkedList<>(listArray);
        
        for(String item : listArray) {
            System.out.println(item);
        }
        System.out.println("");
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println("");
    
        //Arraylist 2
        System.out.println("Arraylist 2:");
        ArrayList <Integer> numeros = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++) {
            numeros.add(i);
            for(int j = 0; j < numeros.size(); j++) {
                if(numeros.get(j) % 2 == 0) {
                    numeros.remove(j);
                }
            }
            
        }
        
        System.out.println(numeros);
        System.out.println("");
        
        //Divide por cero:
        System.out.println("Divide por cero:");
        
       
       
        
        
    
    
    
    
    
    
    
    
    }
    
   
}

