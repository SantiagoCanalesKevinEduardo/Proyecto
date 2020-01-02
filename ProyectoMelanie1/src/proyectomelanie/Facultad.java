
package proyectomelanie;

import java.util.ArrayList;

public class Facultad {
    
    private String nombre;
    private ArrayList<Profesion> profesiones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Profesion> getProfesiones() {
        return profesiones;
    }

    public void setProfesiones(ArrayList<Profesion> profesiones) {
        this.profesiones = profesiones;
    }
    
    
}
