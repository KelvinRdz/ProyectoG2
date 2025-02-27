/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectog2;

import java.util.ArrayList;
import java.util.List;

/*atributos*/
public class Empleado {
    private static int contadorID = 0; /*contador no repite id */
    private int id;
    private String nombre;
    private String apellidos;
    private static String empresa="nombreempresa";
    /*almacenamiento de empleados*/
    private static final List<Empleado> empleados = new ArrayList<>();
    /*constructor para crear empleados */

    public Empleado(int id, String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = ++contadorID;
        boolean add = empleados.add(this);
    }

    
    public static int getContadorID() {
        return contadorID;
    }

    public static void setContadorID(int contadorID) {
        Empleado.contadorID = contadorID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

 

    public static String getEmpresa() {
        return empresa;
    }

    public static void setEmpresa(String empresa) {
        Empleado.empresa = empresa;
    }
    
   /**
     *mostrar informacion del empleado
     */
    public void mostrarInformacion() {
        System.out.println("ID: " + id + ", Nombre: " + nombre +" "+ apellidos);
    }
    
    public static void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados en la lista.");
        } else {
            System.out.println("Listado de empleados:");
            for (Empleado empleado : empleados) {
                empleado.mostrarInformacion();
        
            }
        }
    }
}