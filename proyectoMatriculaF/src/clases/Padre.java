/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lenovo
 */
public class Padre extends Persona{
    
    private String ocupacion;
    private String centroTrabajo;
  

    public Padre(String ocupacion, String centroTrabajo, String nombres,
            String apellidos, int edad, String sexo, int DNI, int telefono, String direccion) {
        super(nombres, apellidos, edad, sexo, DNI, telefono, direccion);
        this.ocupacion = ocupacion;
        this.centroTrabajo = centroTrabajo;
   
    }
    
    

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getCentroTrabajo() {
        return centroTrabajo;
    }

    public void setCentroTrabajo(String centroTrabajo) {
        this.centroTrabajo = centroTrabajo;
    }

   

    @Override
    public String toString() {
        return super.toString()+"\nOcupación: "+ocupacion+"\nCentro de trabajo: "+
                centroTrabajo; 
    }

    
    
    
    
}
