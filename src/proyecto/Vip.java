/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Diana Chica Z
 */
public class Vip extends Cliente{
    private  double peso;
    private  double estatura;
    private int horasEjerSema;
    private  String profesion;
        
    public Vip(String cedula, String nombre, String apellido, String telefono, String correo, String direccion, float precioMensual,double peso, double estatura, int horasEjerSema,String profesion){
        super(cedula,nombre, apellido, telefono, correo, direccion, precioMensual);
        this.peso = peso;
        this.estatura = estatura;
        this.horasEjerSema = horasEjerSema;
        this.profesion = profesion;
    }

    @Override
    public  double valorSuscripcion(){
        return 120;    
    }
    
    public static double calcularIMC(double estatura, double peso){
        double IMC = (estatura/(peso*peso));
        return IMC;
    }
    
}
