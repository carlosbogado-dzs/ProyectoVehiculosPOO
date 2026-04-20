package vehiculo;
public class Main {
    public static void main(String[] args) {
        CentroControl centro = new CentroControl();

        Vehiculo dron = new DronTransporte("DRN-001");
        Vehiculo camion = new CaminonAutonomo("CAM-101");

        centro.registrarUnidad(dron);
        centro.registrarUnidad(camion);

        centro.monitorearFlota();

        //uso de interfaz
        if (dron instanceof IConectable){
            ((IConectable) dron).sincronizarGPS();
        }
    }
}