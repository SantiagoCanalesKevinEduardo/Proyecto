/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_matricula;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Alumno extends Persona{
    private String facultad;
    private String profesion;
    private String semestre;
    private String fechaNacimiento;
    private ArrayList<Cursos> asignatura ;


    
    public Alumno(String facultad, String profesion, String semestre, 
            String fechaNacimiento, String nombres, String apellidos, int edad, 
            String sexo, int DNI, int telefono, String direccion) {
        super(nombres, apellidos, edad, sexo, DNI, telefono, direccion);
        this.facultad = facultad;
        this.profesion = profesion;
        this.semestre = semestre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Alumno(String facultad, String profesion, String semestre) {
        this.facultad = facultad;
        this.profesion = profesion;
        this.semestre = semestre;
    }

    
    public Alumno(ArrayList<Cursos> asignatura) {
        this.asignatura = asignatura;
    }

   

    
    
  

    

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return super.toString()+"\nFecha de Nacimiento: "+fechaNacimiento; 
    }
    
    public String mostrarDatosGenerales(){
        return "\nFacultad: "+facultad+
                "\nProfesión: "+profesion+"\nSemestre: "+semestre;
    }
    
}
