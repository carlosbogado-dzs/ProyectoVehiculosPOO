package vehiculo;
import java.util.ArrayList;
/**
*Clase que gestiona la flota de vehiculos.
*Demuestra composición, agregación y polimorfismo
*/
public class CentroControl {
    private ArrayList<Vehiculo> flota;

    public CentroControl(){
        flota = new ArrayList<>();
    }
    // Registra unidades externas por agregación
    public void registrarUnidad(Vehiculo v){
        flota.add(v);
    }
    //Cada vehículo ejecuta su propio movimiento por polimorfismo
    public void monitorearFlota(){
        for(Vehiculo v : flota){
            System.out.println("Vehiculo ID: " + v.getId() + " -> ");
            v.patronMovimiento();
        }
    }
}
