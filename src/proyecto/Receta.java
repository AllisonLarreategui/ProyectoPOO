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
    private String descripcion;
    public static ArrayList<String> productos = new ArrayList<>();

    public Receta(String nombre, String clasificacion, String descripcion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.descripcion = descripcion;
    }

    
    
    //Metodo validado
    public static void ingresarProductos(){
        System.out.println("Ingrese el nombre de los productos a continuacion, si desea salir ingresar la palabra(Salir)");
        String variableReceta ="hola";
        
        while(!"Salir".equals(variableReceta)){
            System.out.println("Ingrese un ingrediente");
            variableReceta= entrada.nextLine();
            productos.add(variableReceta);
        }
        
    }
    
    //Metodo Validado
    public  boolean ingredientesNecesarios(){
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
    
    
    //  Metodo Validado
    public static void registroRecetas(){
        String c;
        System.out.println("Ingrese el nombre de su receta:");
        String n = entrada.nextLine();
        System.out.println("Su plato se servira en:");
        System.out.println("1. Desayuno");
        System.out.println("2. Almuerzo");
        System.out.println("3. Cena");
        int cl= entrada.nextInt();
        entrada.nextLine();
        
        if(cl == 1){
            c="Desayuno";
        }else if(cl == 2){
            c="Almuerzo";
        }else{
            c="Cena";
        }
        
        System.out.println("Ingrese una breve descripcion:");
        String d = entrada.nextLine();
       
        ingresarProductos();
        
        Receta x= new Receta(n,c, d);
        Nutrifit.recetario.add(x);
      
    }
    
}
