public class Main {
    public static void main(String[] args) {
        SmartPhone poco = new SmartPhone("X3 NFC", 6.67, 6.000, 64.0, 210, 2, "Plastico", false);
        SmartWatch myBand = new SmartWatch("Mi Band 6", 2.5, 2.500, 10, "Goma y Cuero", true);
    
        System.out.println(poco);
        System.out.println("Modelo " + poco.modelo);
        System.out.println("Pantalla " + poco.pantalla);
        System.out.println("Bateria " + poco.bateria + " mAh");
        System.out.println(poco.pixelCam + " Pixeles");
        System.out.println(poco.peso + " Gramos");
        System.out.println(poco.autonomiaDias + " Dias");
        System.out.println(poco.estructura);
        System.out.println("Resiste el agua? " + poco.resisteAgua);
    
    
        System.out.println(myBand);
        System.out.println("fin de programa");
    }
}
