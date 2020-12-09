/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Diana Chica Z
 */
public class Ingrediente {
    String nombre;
    int calorias;
    int hidratos;
    int proteinas;
    int grasas;
    int fibras;
    
    public Ingrediente(String nombre, int calorias, int hidratos, int proteinas, int grasas, int fibras) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.hidratos = hidratos;
        this.proteinas = proteinas;
        this.grasas = grasas;
        this.fibras = fibras;}
    @Override
    public String toString(){
        return (nombre+"=["+calorias+ ","+hidratos +","+proteinas+","+grasas+","+fibras+"]");
       
    }
    static ArrayList<Ingrediente> ingredientes= new ArrayList<>();
        
    /**
     * 
     * @param direccionArchivo
     * 
     * el metodo leer data nos pide la direccion de archivo, lee linea por linea
     * usamos un split para separar a partir de las comaen una lista
     * y cada puesto de la lista se le asigna una variable.
     * Si bien este metodo nos pide la direccion del archivo
     * no lo llamamos en el main, lo usamos directamente en la clase menu para
     * el metodo ingresar producto. 
     * @return 
     */
    public static ArrayList<Ingrediente> leerData(String direccionArchivo){
        
        try (BufferedReader r= new BufferedReader(new FileReader(direccionArchivo))){
            String linea=null;
            r.readLine();
            while((linea=r.readLine())!=null){
                linea= r.readLine();
                String[] ing= linea.split(",");
                String n=(ing[0]);
                int c= Integer.parseInt(ing[1]);
                int h= Integer.parseInt(ing[2]);     
                int p= Integer.parseInt(ing[3]);
                int g= Integer.parseInt(ing[4]);
                int f= Integer.parseInt(ing[5]);
                //se agregan a la lista ingredientes de tipo ingrediente
               ingredientes.add(new Ingrediente(n,c,h,p,g,f)); 
            }
            r.close();
        }
        // las excepciones necesarias para que no se caiga al leer
        catch (FileNotFoundException ex){
            System.out.println("Error en la lectura");
        }
        catch(IOException ex2){
           System.out.println("Ocurrio algo por ahi");
        }
        return ingredientes;
   }
    
    
   /**
    * Este metodo nos premite agregar productos al archivo ingredientes.csv, primero pedios la entreda de datos
    luego lo agregamos al arryalist  ingrediente
    e ingresamos los parametros al archivo, con el mismo formato para que no cause error la proxima vez que
    necesitemos leer el archivo
    */
    public static String escrituraArchivos(){
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Nombre:");
        String producto = entrada.nextLine();   
        System.out.print("Ingrese el numero de calorias:");
        int calorias = entrada.nextInt();
        System.out.print("Ingrese el numero de hidratos:");
        int hidratos = entrada.nextInt();
        System.out.print("Ingrese el numero de proteinas:");
        int proteinas = entrada.nextInt();
        System.out.print("Ingrese el numero de grasas:");
        int grasas = entrada.nextInt();
        System.out.print("Ingrese el numero de fibras:");
        int fibras = entrada.nextInt();
                
        entrada.nextLine();
        
        //agrego al arraylist
        ingredientes.add(new Ingrediente(producto, calorias, hidratos, proteinas, grasas, fibras));
        
        // agregamos al documento, para eso usamos bufferWriter
        //obligatoriamente con try catch
        try{
            try (BufferedWriter w = new BufferedWriter(new FileWriter("src/proyecto/Ingredientes.csv", true))) {
                w.write(producto + "," +calorias+","+hidratos+","+proteinas+","+grasas+","+fibras+",");
            }
        }
        catch(IOException e){
            System.err.println("Escritura de archivos, error :" + e);
        }
    return  producto;     
    }
}
