/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author User
 */
public class IngredienteReceta {
    public Ingrediente ingrediente;
    public int cantidad;  
    public Receta receta;

    public IngredienteReceta(Ingrediente ingrediente, int cantidad, Receta receta) {
        this.ingrediente = ingrediente;
        this.cantidad = cantidad;
        this.receta = receta;
    }
    
    
    public boolean ingredientesNecesarios(Receta receta){
        for(IngredienteReceta i:Receta.productos){
            int contador=0;
            if(ingrediente.equals(i){
                contador +=1;
            }   
        }
        
        return false;
    }
}
