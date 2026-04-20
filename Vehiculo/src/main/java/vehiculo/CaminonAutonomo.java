package vehiculo;

public class CaminonAutonomo extends Vehiculo{
    public CaminonAutonomo(String id){
        super(id);
    }
    @Override
    public void patronMovimiento(){
        System.out.println("El camión circula por carreteras.");
    }
}
