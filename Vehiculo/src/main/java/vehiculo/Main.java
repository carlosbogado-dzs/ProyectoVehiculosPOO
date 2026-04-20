package vehiculo;
/**
*Clase principal
*/
public class Main {
    public static void main(String[] args) {
        CentroControl centro = new CentroControl();

        Vehiculo dron = new DronTransporte("DRN-001");
        Vehiculo camion = new CaminonAutonomo("CAM-101");

        //Regista unidades en el centro de control
        centro.registrarUnidad(dron);
        centro.registrarUnidad(camion);
        
        //monitorea la flota
        centro.monitorearFlota();

        //uso de interfaz
        if (dron instanceof IConectable){
            ((IConectable) dron).sincronizarGPS();
        }
    }
}
