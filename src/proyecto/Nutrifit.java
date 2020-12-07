
package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Nutrifit {
    static ArrayList<Cliente> suscripciones = new ArrayList<>();
    static ArrayList<Receta> recetario= new ArrayList<>();
    public static Scanner entrada= new Scanner(System.in);
    
    
    public static void RegistroClientes(){
        System.out.println("A continuacion se procedara a registrar a los clientes, ingrese el numero de la opcion");
        System.out.println("1.-Clientes Fresh");
        System.out.println("2.-Clientes Vip");
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
            Fresh x= new Fresh(cedula, nombre, apellido, telefono, correo, direccion);
            
            suscripciones.add(x);
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
            
            Vip y= new Vip(cedula, nombre, apellido, telefono, correo, direccion, peso, estatura, horasEjercicio, profesion);
            
            suscripciones.add(y);
            System.out.println("Cliente ingresado de manera exitosa.");
        }
        
    }
    
    
}
