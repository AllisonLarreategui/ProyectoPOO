
package proyecto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Nutrifit {
    static ArrayList<Cliente> suscripciones = new ArrayList<>();
    static ArrayList<String> suscripcionesActivas =new ArrayList<>(); 
    static ArrayList<Receta> recetario= new ArrayList<>();
    public static Scanner entrada= new Scanner(System.in);
    
    
    public static void RegistroClientes(){
        System.out.println("A continuacion se procedara a registrar a los clientes.");
        System.out.println("1.-Clientes Fresh");
        System.out.println("2.-Clientes Vip");
        System.out.print("Opcion: ");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        
        if(opcion== 1){
            System.out.print("Ingrese el numero de cedula:");
            String cedula = entrada.nextLine();
            System.out.print("Nombre:");
            String nombre = entrada.nextLine();
            System.out.print("Apellido:");
            String apellido = entrada.nextLine();
            System.out.print("Telefono:");
            String telefono = entrada.nextLine();
            System.out.print("Correo:");
            String correo = entrada.nextLine();
            System.out.print("Direccion:");
            String direccion = entrada.nextLine();
            System.out.print("Fecha de suscripcion (dia numero):");
            String dia= entrada.nextLine();
            System.out.print("Fecha de suscripcion (mes Ejemplo: diciembre():");
            String mes= entrada.nextLine();
            Fresh x= new Fresh(cedula, nombre, apellido, telefono, correo, direccion);
            
            suscripciones.add(x);
            String  cliente= (String)apellido;
            suscripcionesActivas.add(apellido+","+dia +","+mes);
            System.out.println("Cliente ingresado de manera exitosa.");
        
        }else if(opcion ==2){
            System.out.print("Ingrese el numero de cedula:");
            String cedula = entrada.nextLine();
            System.out.print("Nombre:");
            String nombre = entrada.nextLine();
            System.out.print("Apellido:");
            String apellido = entrada.nextLine();
            System.out.print("Telefono:");
            String telefono = entrada.nextLine();
            System.out.print("Correo:");
            String correo = entrada.nextLine();
            System.out.print("Direccion:");
            String direccion = entrada.nextLine();
            System.out.print("Peso:");
            double peso = entrada.nextDouble();
            System.out.print("Estatura en cm:");
            int estatura = entrada.nextInt();
            System.out.print("Horas de Ejercicio a la semana:");
            int horasEjercicio = entrada.nextInt();
            System.out.print("Profesion a la que se dedica:");
            String profesion = entrada.nextLine();
            entrada.nextLine();
            System.out.print("Fecha de suscripcion mensual(dia numero):");
            String dia= entrada.nextLine();
            System.out.println("Fecha de suscripcion mensual(mes Ejemplo: diciembre):");
            String mes= entrada.nextLine();
            Vip y= new Vip(cedula, nombre, apellido, telefono, correo, direccion, peso, estatura, horasEjercicio, profesion);
            
            suscripciones.add(y);
            
            String  cliente= (String)apellido;
            suscripcionesActivas.add(apellido+","+dia+","+mes);
            System.out.println("Cliente ingresado de manera exitosa.");
        }
        
    }
    //*
    
    public static void consultarSuscripciones(int dia, String mes){
        
        
        System.out.println("1.-Suscripciones Fresh");
        System.out.println("2.-Suscripciones Vip");
        System.out.print("Ingrese la opcion que desee: ");
        int consulta = entrada.nextInt();
        
        if(consulta == 1){
            for(String i:suscripcionesActivas){
                String[] datos = i.split(",");
                String apellido = datos[0];
                String dias = datos[1];
                String mess=datos[2];
                int diaInicio= Integer.parseInt(dias);
                //int mesInicio= Integer.parseInt(mess);
                int diaFin= diaInicio +31;
                int diferencia=0;
                if(diaFin >30){
                    diferencia=diaFin -30;
                    diaFin=diferencia;
                    
                }              
                
                for(Cliente j:suscripciones){
                    String n=j.apellido;
                    if(apellido.equals(n)){
                   
                        if(j instanceof Fresh){
                            if(diaFin>= dia && (mes.equals(mess))){
                                System.out.println("Cliente "+n+" tiene una suscripcion activa");
                            }else{
                                System.out.println("Cliente "+n+" no tiene una suscripcion activa");
                            }
                        }  
                    }
                }
            }
        
        }else if(consulta == 2){
            for(String i:suscripcionesActivas){
                String[] datos = i.split(",");
                String apellido = datos[0];
                String dias = datos[1];
                String mess=datos[2];
                int diaInicio= Integer.parseInt(dias);
                //int mesInicio= Integer.parseInt(mess);
                int diaFin= diaInicio +31;
                int diferencia=0;
                if(diaFin >30){
                    diferencia=diaFin -30;
                    diaFin=diferencia;
                }              
                
                for(Cliente j:suscripciones){
                    String n=j.apellido;
                    
                    if(apellido.equals(n)){
                   
                        if(j instanceof Vip){
                            if(diaFin>= dia && (mes.equals(mess))){
                                System.out.println("Cliente "+n+" no tiene una suscripcion activa");
                            }else{
                                System.out.println("Cliente "+n+"  tiene una suscripcion activa");
                            }      
                        }  
                        
                    
                    }
                }
            }
        
        }
    
    }
    
    public static void serializar (){
        try (ObjectOutputStream os = new ObjectOutputStream (new FileOutputStream("src/recursos"))){
            os.writeObject(recetario);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Nutrifit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Nutrifit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void deserializar(){
        
        try  (ObjectInputStream is = new ObjectInputStream( new FileInputStream("src/recursos/recetario.dat"))){
            
            recetario = (ArrayList<Receta>)is.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Nutrifit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Nutrifit.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
}
