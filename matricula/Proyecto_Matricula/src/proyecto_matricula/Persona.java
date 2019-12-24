/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_matricula;

/**
 *
 * @author Lenovo
 */
public class Persona {
    
    private String nombres;
    private String apellidos;
    private int edad;
    private String sexo;
    private int DNI;
    private int telefono;
    private String direccion;

    public Persona(){}
    
    public Persona(String nombres, String apellidos, int edad, String sexo, int DNI, int telefono, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = DNI;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    
    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "\nNombres: " + nombres + "\nApellidos: " + apellidos + "\nEdad: " + edad +
                "\nSexo: " + sexo + "\nDNI: " + DNI + "\nTeléfono: " + telefono + "\nDirección: " + direccion;
    }
    
    
    
}
