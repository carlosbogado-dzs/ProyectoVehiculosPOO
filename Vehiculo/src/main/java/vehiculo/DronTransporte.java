package vehiculo;
/**
*Clase concreta que representa un dron de transporte.
*Extiende Vehiculo e implementa IConectable.
*/
public class DronTransporte extends Vehiculo implements IConectable{
    public DronTransporte(String id){
        super(id);
    }
    @Override
    public void patronMovimiento(){
        System.out.println("El dron vuela en trayectorias aéreas.");
    }
    @Override
    public void sincronizarGPS(){
        System.out.println("Dron sincronizando con satélite...");
    }
}
