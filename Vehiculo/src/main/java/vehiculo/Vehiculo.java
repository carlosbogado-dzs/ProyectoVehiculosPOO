package vehiculo;
/**
*Clase abstracta que define la identidad del vehiculo.
*Contiene atributo id y un método abstracto patronMovimiento()
*/
public abstract class Vehiculo {
    private String id;
    public Vehiculo(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    //El método abstacto obliga a las subclases a definir su movimiento//
    public abstract void patronMovimiento();
}

