
package proyecto;

import java.util.ArrayList;

public abstract class Cliente {
    
    //clase padre Cliente objetos protected
    protected  String cedula;
     protected String nombre;
     protected String apellido;
     protected String telefono;
     protected String correo;
     protected String direccion;
     protected ArrayList<Receta> Buzon= new ArrayList<>();
     

    public Cliente(String cedula, String nombre, String apellido, String telefono, String correo, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
       
    }
    
    public abstract void valorSuscripcion();
    
  
}
