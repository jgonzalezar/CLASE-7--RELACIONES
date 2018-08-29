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
public class Empleado {
    private String nombre;
    private String apelligo;
    private String foto;
    private char genero;
    public Fecha fNacimiento;
    private Fecha fIngreso;

    public Empleado(String nombre, String apelligo) {
        this.nombre = nombre;
        this.apelligo = apelligo;
    }

    public Empleado(String nombre, String apelligo, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apelligo = apelligo;
        this.fNacimiento = fNacimiento;
    }
    

    public Empleado(String nombre, String apelligo, String foto, char genero, Fecha fNacimiento, Fecha fIngreso) {
        this.nombre = nombre;
        this.apelligo = apelligo;
        this.foto = foto;
        this.genero = genero;
        this.fNacimiento = fNacimiento;
        this.fIngreso = fIngreso;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelligo() {
        return apelligo;
    }

    public void setApelligo(String apelligo) {
        this.apelligo = apelligo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public Fecha getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(Fecha fIngreso) {
        this.fIngreso = fIngreso;
    }
    
}


