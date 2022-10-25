public class Main {
    
    static CocheCRUDImpl cocheCRUDImpl = new CocheCRUDImpl();
    public static void main(String[] args) {
    
        cocheCRUDImpl.save(new Coche());
        cocheCRUDImpl.findAll();
        cocheCRUDImpl.delete(new Coche());
    }
}