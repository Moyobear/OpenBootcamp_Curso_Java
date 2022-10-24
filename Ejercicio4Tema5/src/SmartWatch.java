public class SmartWatch extends SmartDevice{
    int autonomiaDias;
    String estructura;
    boolean resisteAgua;
    
    public SmartWatch(){
    
    }
    
    public SmartWatch(String modelo, double pantalla, double bateria, int autonomiaDias, String estructura,
                      boolean resisteAgua) {
        super(modelo, pantalla, bateria);
        this.autonomiaDias = autonomiaDias;
        this.estructura = estructura;
        this.resisteAgua = resisteAgua;
    }
    
    @Override
    public String toString() {
        return "SmartWatch{" +
                "autonomiaDias=" + autonomiaDias +
                ", estructura='" + estructura + '\'' +
                ", resisteAgua=" + resisteAgua +
                ", modelo='" + modelo + '\'' +
                ", pantalla=" + pantalla +
                ", bateria=" + bateria +
                '}';
    }
}
