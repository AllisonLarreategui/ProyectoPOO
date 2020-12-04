/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

public class Fresh extends Cliente{
    
    public Fresh(String cedula, String nombre, String apellido, String telefono, String correo, String direccion, float precioMensual) {
       super(cedula, nombre, apellido, telefono, correo, direccion, precioMensual);
    }

    @Override
    public double calcularSuscripcion(int dias){
        return 0;
    }
}
