
package proyecto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Menu {
    static ArrayList<Receta> menu= new ArrayList<>();
    public static Scanner entrada= new Scanner(System.in);
    
    /**
     * 
     * @return 
     * para el metodo generador Menu, creamos tres arrayas para desayuno almuerzo y cena
     * nos parecia mejor hacer esto para cuando se retorne el menu
     *  ver el formato desayuno, almuerzo, cena
     * 
     * para ello recorremoe el array recetario usando el metodo equals determinamos
     * de que tipo es, y lo agregamos a la lista correspondiente.
     * Como Receta puede  tener muchos platos, usamos un for que corra 5 veces
     * para 5 dias, y random para generar indices aleatorios de cada
     * array, desayuno, almuerzo, cena
     * finalmente los agregamos en orden al array menu
     * 
     */
    
    public static ArrayList<Receta> generadorMenu(){
        
        ArrayList<Receta> desayuno= new ArrayList<>();
        ArrayList<Receta> almuerzo= new ArrayList<>();
        ArrayList<Receta> cena= new ArrayList<>();
        
    
        for(Receta i:Nutrifit.recetario){
            if(i.getClasificacion().equals("Desayuno")){
                desayuno.add(i);
            }else if(i.getClasificacion().equals("Almuerzo")){
                almuerzo.add(i);
            }else if(i.getClasificacion().equals("Cena")){
                cena.add(i);            
            }
        }
        
        
        for(int i=1;i<5;i++){
            int iD= (int) (Math.random()*desayuno.size());
            int iA = (int) (Math.random()*almuerzo.size());
            int iC = (int) (Math.random()*cena.size());
            
            menu.add(desayuno.get(iD));
            menu.add(almuerzo.get(iA));
            menu.add(cena.get(iC));
        }
        return menu;
        
        
    }
   
    
    /**
     * Para esto cometimos un error en el entendimiento del proyecto y manejamos la peticion de enviar correos
     * como si fuera una array donde se guardaria los menus para cada cliente
     * Esto es un error de nuestra parte
     * @param m 
     */
    public static void enviarCorreos(ArrayList<Receta> m){
        for(Receta i:m){
            Fresh.Buzon1.add(i);
            Vip.Buzon2.add(i);
        }
    }
    
    /**
     * 
     * @return 
     */
    public static int calculoSemana(){
        System.out.println("Considerando que al dia lunes como inicio de semana Ingrese la fecha de suscripcion para el menu");
        int x= entrada.nextInt();
        
        int ultimoDia= x+5;
        
        return ultimoDia;
  
    }
}
