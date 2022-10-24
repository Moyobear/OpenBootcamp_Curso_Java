public class SmartPhone extends SmartDevice{
    double pixelCam;
    double peso;
    int autonomiaDias;
    String estructura;
    boolean resisteAgua;
    
    public SmartPhone() {
    }
    
    public SmartPhone(String modelo, double pantalla, double bateria, double pixelCam, double peso, int autonomiaDias
            , String estructura, boolean resisteAgua) {
        super(modelo, pantalla, bateria);
        this.pixelCam = pixelCam;
        this.peso = peso;
        this.autonomiaDias = autonomiaDias;
        this.estructura = estructura;
        this.resisteAgua = resisteAgua;
    }
    
    @Override
    public String toString() {
        return "SmartPhone{" +
                "pixelCam=" + pixelCam +
                ", peso=" + peso +
                ", autonomiaDias=" + autonomiaDias +
                ", estructura='" + estructura + '\'' +
                ", resisteAgua=" + resisteAgua +
                ", modelo='" + modelo + '\'' +
                ", pantalla=" + pantalla +
                ", bateria=" + bateria +
                '}';
    }
}
