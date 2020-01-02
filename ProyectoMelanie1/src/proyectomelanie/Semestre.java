
package proyectomelanie;

import java.util.ArrayList;


public class Semestre {
    
    
    private String ciclo;
    private ArrayList< Curso >cursos;

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    
}
