/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;
import java.util.ArrayList;
import java.util.Scanner;

public class Fresh extends Cliente{
    public static Scanner sc = new Scanner(System.in);
    static ArrayList<Receta> Buzon1= new ArrayList<>();
    
    public Fresh(String cedula, String nombre, String apellido, String telefono, String correo, String direccion ) {
       super(cedula, nombre, apellido, telefono, correo, direccion);
    }
 
    public static int opcionEntrega(){
        System.out.print("Desea entrega a domicilio(Si/No):");
        String entrega= sc.nextLine();
        
        if (entrega.equals("Si")){
            return 30;
        }
        else
            return 0;
    }
    
    /**
     *
     */
    @Override
    
    
    public void valorSuscripcion(){
      
      double suscripcion = 70 + (double)opcionEntrega();
      System.out.println("Su suscripcion mensual es de :"+suscripcion);
        
    }

    public static void setBuzon1(ArrayList<Receta> Buzon1) {
        Fresh.Buzon1 = Buzon1;
    }
    
}
