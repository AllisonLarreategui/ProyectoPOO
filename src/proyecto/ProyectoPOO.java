/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author allison
 */
public class ProyectoPOO {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
      //Objetos necesarios para el programa
      
      
      Fresh cliente2 = new Fresh("sgf", "asfdsf", "asdvfd", "sadfdsf", "sdvfsf","asdfdsf");
      
   
     
      
      menu();

    }
    public static void menu(){
      String opcion="";  
      while(!opcion.equals("7")){
          
      System.out.println("***********NutriFit***********\n");
      System.out.println("1.-Subida de Productos");
      System.out.println("2.-Registro de Recetas");
      System.out.println("3.-Registro de clientes");
      System.out.println("4.-Creacion automatica del menu semanal");  
      System.out.println("5.-Envió de Menú Semanal a Clientes por correo electrónico");
      System.out.println("6.-Consultar Suscripciones");
      System.out.println("7.-Salir");
      
      System.out.print("Opcion:");
      opcion = sc.nextLine();
      switch(opcion){
        case "1":
            Ingrediente.escrituraArchivos();
          break;
        case "2":
            Receta.registroRecetas();
          break;
        case "3":
            Nutrifit.RegistroClientes();
          
          break;
        case "4":
          
          break;
        case "5":
          
          break;
        case "6":
          
          break;
      }
      }
    }

    


     

//System.out.println(Ingrediente.leerData("src/proyecto/Ingredientes.csv"));
}

