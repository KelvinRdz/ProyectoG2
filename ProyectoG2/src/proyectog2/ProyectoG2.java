/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectog2;

/**
 *
 * 
 */
public class ProyectoG2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Empleado kelvin = new Empleado(0, "Kelvin", "Rodriguez"); /*ingresar ussuarios*/
     Empleado david = new Empleado(1, "David", "Nunez");
     
     
     kelvin.mostrarInformacion();
     
     Empleado.listarEmpleados();
     
     
 
    }
    
}
