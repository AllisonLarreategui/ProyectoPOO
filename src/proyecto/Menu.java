
package proyecto;

import java.util.ArrayList;

public class Menu {
    
    public static ArrayList<Receta> generadorMenu(){
        ArrayList<Receta> Menu= new ArrayList<>();
        
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
            
            Menu.add(desayuno.get(iD));
            Menu.add(almuerzo.get(iA));
            Menu.add(cena.get(iC));
        }
        return Menu;
        
        
    }
    
    
}
