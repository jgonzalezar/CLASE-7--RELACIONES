/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg7.relaciones;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Fecha fNacimiento = new Fecha(10, 10, 1980);
        Fecha fIngreso = new Fecha(29, 8, 18);
        Empleado empleado = new Empleado("Juan", "Gonzalez",fNacimiento);
        empleado.setfIngreso(fIngreso);
        System.out.println(empleado.getNombre());
    }
}
