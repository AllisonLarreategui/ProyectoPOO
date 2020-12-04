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
        

      menu();

    }
    public static void menu(){
      String opcion="";  
      while(!opcion.equals("7")){
          
      System.out.println("Banco 2020");
      System.out.println("1.-Subida de Productos");
      System.out.println("2.-Registro de Recetas");
      System.out.println("3.-Registro de clientes");
      System.out.println("4.-Creacion automatica del menu semanal");  
      System.out.println("5.-Envió de Menú Semanal a Clientes por correo electrónico");
      System.out.println("6.-Consultar Suscripciones");
      System.out.println("6.-Salir");
      
      System.out.print("Opcion:");
      opcion = sc.nextLine();
      switch(opcion){
        case "1":
          
          break;
        case "2":
          
          break;
        case "3":
          
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




        
    
}
