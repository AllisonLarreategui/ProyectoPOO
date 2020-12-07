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
    public static Scanner entrada= new Scanner(System.in);
    
    private String nombre;
    private String clasificacion;
    public ArrayList<String> productos = new ArrayList<>();

    public Receta(String nombre, String clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }
    
    //Metodo validado
    public void ingresarProductos(){
        System.out.println("Ingrese el nombre de los productos a continuacion, si desea salir ingresar la palabra(Salir)");
        String variableReceta ="hola";
        
        while(!"Salir".equals(variableReceta)){
            System.out.println("Ingrese un ingrediente");
            variableReceta= entrada.nextLine();
            productos.add(variableReceta);
        }
        
    }
    
    //Metodo Validado
    public boolean ingredientesNecesarios(){
        ArrayList hola;
        hola = Ingrediente.leerData("src/proyecto/Ingredientes.csv");
        int contador=0;
        for(String i:productos){
            for(Object j:hola){
                Ingrediente l = (Ingrediente) j;
                if(i.equals(l.nombre)){
                    contador+=1;
                    System.out.println("Si hay todos los ingredientes en el almancen");
                    
                }
            
            }   
        }
        int total = productos.size();
        contador+=1;
        if(contador == total){
            return true;
        }else{
        return false;
        }
    }
    
    
}
