public class BucleConcatenar {
    public static void main(String[] args) {
        
        
        String[] diasSemana = {"Lunes,", "Martes,", "Miércoles,", "Jueves,", "Viernes,", "Sábado,", "Domingo."};
        String devolver = "Los días de la semana son: ";
        for (String dia : diasSemana) {
            devolver += dia + " ";
        }
        System.out.println(devolver);
    }
    
}