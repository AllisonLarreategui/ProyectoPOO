
package proyecto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Nutrifit {
    static ArrayList<Cliente> suscripciones = new ArrayList<>();
    static ArrayList<String> suscripcionesActivas =new ArrayList<>(); 
    static ArrayList<Receta> recetario= new ArrayList<>();
    public static Scanner entrada= new Scanner(System.in);
    
    
    /**
     * El metodo RegistroCliente() es utilizado para crear objetos de la clase cliente
     * y objetos de la clase Vip, para esto despliega un pequeño menu donde el ususario ingresa las opciones
     * ya que vip y fresh tiene informacion diferente
     * los objetos creados tanto vip como fresh se agregan a la lista suscripciones<>()
     * 
     * Se hace una pregunta adicional  que pide la fecha de suscripcion
     * una vez que se crean los objetos, obtenemos el apellido y la fecha de suscricipcion y estos 
     * se agregan a la lista suscripcionesActivas<>()
     * 
     * es decir agregamos los clientes a suscripciones
     * y agregamos solo el apellido y la fecha a suscripciones activas     * 
     */
    
    
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
<<<<<<< HEAD
            suscripcionesActivas.add(apellido+","+dia +","+mes);
            System.out.println("Cliente ingresado de manera exitosa.");
=======
            suscripcionesActivas.add(apellido+","+dia);
            System.out.println("Cliente ingresado de manera exitosa. \n");
>>>>>>> 6e6acf68c59c5c1caa1e978c88d268b8935b9ac9
        
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
<<<<<<< HEAD
            suscripcionesActivas.add(apellido+","+dia+","+mes);
            System.out.println("Cliente ingresado de manera exitosa.");
=======
            suscripcionesActivas.add(apellido+","+dia);
            System.out.println("Cliente ingresado de manera exitosa.\n");
>>>>>>> 6e6acf68c59c5c1caa1e978c88d268b8935b9ac9
        }
        
    }
    //*
    
<<<<<<< HEAD
    public static void consultarSuscripciones(int dia, String mes){
=======
    /*
    Para el metodo consultar Suscripciones tenemos la opcion de consultar todas las suscripciones por tipo
    es decir Vip y fresh, se despliega un pequeño menu, y se usa if para saber que opcion coge el usuario
    dentro del id primero recorremos la lista de suscripciones Activas
    y usamos el split por que el formato es un String "Apellido,fecha", convertimos el string de fecha a entero
    creamos la variale diaFin que sera la fecha en que termina la suscripcion, si  dia fin es mayor a 30
    hacemos una resta para contar como el siguiente mes
    
    luego recorremos la lista suscripciones que es de tipo cliente, y usamos Instance of para separar si es
    un objeto de tipo cliente o vip, para finalizar usamos la variable dia fin  para comparar con la variable 
    dia inicio para saber si la suscripcion esta activa o vencida.
    
    Al usar el metodo el menu se imprime dos veces
    
    */
    
    public static void consultarSuscripciones(int fecha){
>>>>>>> 6e6acf68c59c5c1caa1e978c88d268b8935b9ac9
        
         int consulta;
        System.out.println("1.-Suscripciones Fresh");
        System.out.println("2.-Suscripciones Vip");
        System.out.print("Ingrese la opcion que desee: ");
        consulta = entrada.nextInt();
        
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
                   
<<<<<<< HEAD
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
        
=======
                        if(consulta == 1){
                            
                            if(j instanceof Fresh){
                                if(diaFin<= fecha){
                                    System.out.println("Cliente "+n+" no tiene una suscripcion activa\n");
                                    System.out.println("_______________________________________________");
                                }else{
                                    System.out.println("Cliente "+n+"  tiene una suscripcion activa\n");
                                    System.out.println("_______________________________________________");
                                }
                            } 
                            
                        }else if(consulta == 2){
                            if(j instanceof Vip){
                                if(diaFin<= fecha){
                                    System.out.println("Cliente "+n+" no tiene una suscripcion activa\n");
                                    System.out.println("_______________________________________________");
                                }else{
                                    System.out.println("Cliente "+n+"  tiene una suscripcion activa\n");
                                    System.out.println("_______________________________________________");
                                }      
                            }                     
                        }
                    }
                }
>>>>>>> 6e6acf68c59c5c1caa1e978c88d268b8935b9ac9
        }
    
    }
    
    /*
    Este metodo guarda las recetas ingresados por medio dela serializacion
    para usarla decidimos agregar una opcion mas al menu
    */
    
    
    public static void serializar (){
        try (ObjectOutputStream os = new ObjectOutputStream (new FileOutputStream("src/recursos"))){
            os.writeObject(recetario);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Nutrifit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Nutrifit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
}
