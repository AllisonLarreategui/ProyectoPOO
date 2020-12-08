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
 * @author allison
 */
public class ProyectoPOO {

    public static Scanner sc = new Scanner(System.in);
       
    public static void menu(){
      String opcion="";  
     
      while(!opcion.equals("8")){
          
      System.out.println("***********NutriFit***********\n");
      
      System.out.println("1.-Subida de Productos");
      System.out.println("2.-Registro de Recetas");
      System.out.println("3.-Registro de clientes");
      System.out.println("4.-Creacion automatica del menu semanal");  
      System.out.println("5.-Envió de Menú Semanal a Clientes por correo electrónico");
      System.out.println("6.-Consultar Suscripciones");
      System.out.println("7.-Guardar");
      System.out.println("8.-Salir");
      System.out.print("Opcion:");
      opcion = sc.nextLine();
      switch(opcion){
        case "1":
            Receta.ingresarProductos();
            
          break;
        case "2":
            Receta.registroRecetas();
            Receta.ingredientesNecesarios();
            
          break;

        case "3":
            Nutrifit.RegistroClientes();
          break;
        case "4":
            ArrayList m=Menu.generadorMenu();
            System.out.println(m);
            
          break;
        case "5":
            int d = Menu.calculoSemana();
            System.out.println("El menu se generara hasta el dia viernes " + d );
            ArrayList x=Menu.generadorMenu();
            Menu.enviarCorreos(x);
            
            //Imprimo para ver que si se guardo en la lista de emails de Fresh
            System.out.println(Fresh.Buzon1);
          break;

        case "6":
            
            //se imprime dos veces el menu al consultar debido al nextInt
            
            System.out.print("Ingrese la fecha del dia de hoy: ");
            int j;
            j = sc.nextInt();
            Nutrifit.consultarSuscripciones(j);
          break;
        case "7":
          Nutrifit.serializar();
          break;
          
        }
      }
    }
    
    
    public static void main(String[] args) {
    
    //OBJETOS DE PRUEBA PARA EL PROGRAMA
    
    Receta receta1 = new Receta("Bolon de Verde","Desayuno", "Bolon de Verde molido,con huevo frito");
    Receta receta2 = new Receta("Batido de Frutilla", "Desayuno", "Batido de Frutilla con leche y azucar");
    Receta receta3 = new Receta("Batido de Mora","Desayuno","Batido de Mora con leche y azucar");
    Receta receta4 = new Receta("Batido verde","Desayuno","Batido de apio, limon, pepino y agua");
    Receta receta5 = new Receta("Batido de guineo","Desayuno","Batido de leche con guineo maduro");
    Receta receta6= new Receta("Huevos duros", "Desayuno", "Huevos duros, sal, comino");
    
    Receta receta7= new Receta("Sopa de verduras","Almuerzo","Sopa de verduras, lleva papa, leche, queso, zanahoria, aba, brocolio y sal");
    Receta receta8= new Receta("Pollo a la plancha","Almuerzo","Pollo abierto, sal, aceite, pimienta negra");
    Receta receta9= new Receta("Sopa de fideos","Almuerzo","Papa,fideo,sal,achote");
    Receta receta10 = new Receta("Sopa de lentejas","Almuerzo","Papa, lentejas, queso, sal");
    Receta receta11 = new Receta("Sopa","Almuerzo","sdfiow");
    Receta receta12 = new Receta("Carne apanada","Almuerzo","slfijrf");
    
    Receta receta13= new Receta("1","Cena","wefewf");
    Receta receta14= new Receta("2","Cena","iufbreof");
    Receta receta15= new Receta("3","Cena","iufbreof");
    Receta receta16= new Receta("4","Cena","iufbreof");
    Receta receta17= new Receta("5","Cena","iufbreof");
    Receta receta18= new Receta("6","Cena","iufbreof");
   
    Nutrifit.recetario.add(receta1);
    Nutrifit.recetario.add(receta2);
    Nutrifit.recetario.add(receta3);
    Nutrifit.recetario.add(receta4);
    Nutrifit.recetario.add(receta5);
    Nutrifit.recetario.add(receta6);
    Nutrifit.recetario.add(receta7);
    Nutrifit.recetario.add(receta8);
    Nutrifit.recetario.add(receta9);
    Nutrifit.recetario.add(receta10);
    Nutrifit.recetario.add(receta11);
    Nutrifit.recetario.add(receta12);
    Nutrifit.recetario.add(receta13);
    Nutrifit.recetario.add(receta14);
    Nutrifit.recetario.add(receta15);
    Nutrifit.recetario.add(receta16);
    Nutrifit.recetario.add(receta17);
    Nutrifit.recetario.add(receta18);
    
    
      menu();

    }
    


     


}

