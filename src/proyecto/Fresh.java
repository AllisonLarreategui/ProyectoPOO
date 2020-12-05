/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;
import java.util.Scanner;
public abstract class Fresh extends Cliente{
    public static Scanner sc = new Scanner(System.in);
    public Fresh(String cedula, String nombre, String apellido, String telefono, String correo, String direccion, float precioMensual) {
       super(cedula, nombre, apellido, telefono, correo, direccion, precioMensual);
    }
 
    public int opcionEntrega(){
        System.out.print("Accede al envio de su comida?:");
        String entrega= sc.nextLine();
        sc.nextLine();
        if (entrega.equals("Si")){
            return 30;
        }
        else
            return 0;
    }
    public void valorSuscripcion(){
        System.out.print("Su valor total de Suscripción es: " + (70 + opcionEntrega()));  
    }
}
