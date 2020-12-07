
package proyecto;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu {
    static ArrayList<Receta> menu= new ArrayList<>();
    
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
        
        
        for(int i=0;i<5;i++){
            int iD= (int) (Math.random()*desayuno.size());
            int iA = (int) (Math.random()*almuerzo.size());
            int iC = (int) (Math.random()*cena.size());
            
            menu.add(desayuno.get(iD));
            menu.add(almuerzo.get(iA));
            menu.add(cena.get(iC));
        }
        return menu;
        
        
    }
    
    public static void enviarCorreos(ArrayList<Receta> m){
        for(Receta i:m){
            Fresh.Buzon1.add(i);
            Vip.Buzon2.add(i);
        }
    }
    
}
