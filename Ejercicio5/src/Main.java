public class Main {
    
    static CocheCRUDImpl cocheCRUDImpl;
    public static void main(String[] args) {
    
        cocheCRUDImpl.save(new Coche());
        cocheCRUDImpl.findAll();
        cocheCRUDImpl.delete(new Coche());
    }
}