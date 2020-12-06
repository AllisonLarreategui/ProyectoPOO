/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Receta {
    Scanner entrada= new Scanner(System.in);
    
    private String nombre;
    private String clasificacion;
    public static ArrayList<String> productos = new ArrayList<>();

    public Receta(String nombre, String clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }
    
    public void ingresarProductos(){
        System.out.println("Ingrese el nombre de los productos a continuacion, si desea salir ingresar la palabra(Salir)");
        String bucle ="Salir";
        
        while(bucle != "Salis"){
            System.out.println("Ingrese un ingrediente");
            String ing= entrada.nextLine();
            productos.add(ing);
            
        }
        
    
    
    }
    
    
}
