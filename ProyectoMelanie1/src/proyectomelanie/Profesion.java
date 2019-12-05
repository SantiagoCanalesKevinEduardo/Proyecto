
package proyectomelanie;

import java.util.ArrayList;

public class Profesion {
    
    private String nombre;
    private ArrayList <Semestre> semestres;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Semestre> getSemestres() {
        return semestres;
    }

    public void setSemestres(ArrayList<Semestre> semestres) {
        this.semestres = semestres;
    }
    
    
}
