public class CocheCRUDImpl implements  CocheCRUD{
    
    @Override
    public void save(Coche coche) {
        System.out.println("Este es el método save()");
    }
    
    @Override
    public void delete(Coche coche) {
        System.out.println("delete()");
    }
    
    @Override
    public void findAll() {
        System.out.println("Este es el método findAll()");
    }
}
