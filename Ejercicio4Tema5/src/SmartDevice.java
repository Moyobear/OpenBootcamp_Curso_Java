public class SmartDevice {
    String modelo;
    double pantalla;
    double bateria;
    
    public SmartDevice(){
    
    }
    
    public SmartDevice(String modelo, double pantalla, double bateria){
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.bateria = bateria;
    }
    
    @Override
    public String toString() {
        return "SmartDevice{" +
                "modelo='" + modelo + '\'' +
                ", pantalla=" + pantalla +
                ", bateria=" + bateria +
                '}';
    }
}
