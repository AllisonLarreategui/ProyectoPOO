/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Receta implements Serializable{
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

    public String getClasificacion() {
        return clasificacion;
    }
    
    
    
    
    /**
     * Este metodo nos  permite ingresar los productos, que seran necesarios para elaborar nuestras recetas
     * de manera paralela estos productos se agregan al archivo ingredientes.csv
     * 
     */
    public static void ingresarProductos(){
        
        System.out.println("A continuacion ingrese el nombre de los productos, si desea salir ingresar la palabra(Salir)");
        String variableReceta ="hola";
        
        while(!"Salir".equals(variableReceta)){
            
            
            variableReceta= Ingrediente.escrituraArchivos();
            productos.add(variableReceta);   
        }
        
    }
    
    /**
     * En la exposicion dije que no estaba vinculado y que no existia este metodo, la verdad si estaba
     * se envio en el repositorio y se lo habia probado, fue uno de los primero metodos hechos
     * y al parecer me puse nerviosa y lo olvide por que no lo añadi al menu de la clase main
     * este metodo compara la lista productos compuesta del nombre de cada ingrediente, 
     * con el arreglo de tipo ingrediente.
     * @return 
     */
    public  static void ingredientesNecesarios(){
        ArrayList<Ingrediente> ejemplo = Ingrediente.ingredientes;
        int contador=0;
        for(String i:productos){
            for(Ingrediente j:ejemplo){
                if(i.equals(j.nombre)){
                    contador+=1;                  
                }
            
            }   
        }
        int total = productos.size();
        
        if(contador == total){
            System.out.println("Si hay todos los ingredientes en el almancen");
            
        }else{
            System.out.println("Faltan ingredientes para elaborar la receta");
        }
    }
    
    
    /**
     * Este metodo nos permite crear objetos de la Clase receta 
     * para esto creimos que era mejor el ingreso solo del numero de la opcion
     * en vez de escribir desayuno, almuerzo o cena, para evitar errores.
     */
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

    /**
     * Sobreescritura del toString para poder ver el menu 
     * @return 
     */
    @Override
    public String toString() {
        return "Receta{" + "nombre=" + nombre + ", clasificacion=" + clasificacion + ", descripcion=" + descripcion + '}';
    }
    
    
}
