
package proyectomelanie;


import java.util.ArrayList;


public class baseDatos {
    
    private ArrayList<Facultad> facultades=new ArrayList<>();
    
   //porque un constructor baseDatos()?
   public baseDatos()
   {

    // secuencia: crear, nombrar, array, agregar, enviar-set, 
    
    Profesion Sistemas= new Profesion();//creacion de objeto profesion
    Sistemas.setNombre("Ingeniería de Sistemas");//nombre de la profesion
    
    Semestre PrimeroSistemas=new Semestre();//creacion de objeto semestre
    PrimeroSistemas.setCiclo("100-1");//nombre del semestre
    //falta semestre cursos
    ArrayList<Semestre> SemestresSistemas=new ArrayList();//array de semestre
    SemestresSistemas.add(PrimeroSistemas);//añade objeto semestre al array de semestres
    Sistemas.setSemestres(SemestresSistemas);//envia el array de semestres al objeto profesion
    
    
    
    Facultad Ingeniería=new Facultad();//creacion de objeto facultad
    Ingeniería.setNombre("Facultad de Ingeniería de Minas, Geología y Civil");//nombre de la facultad    
    ArrayList<Profesion> ProfesionesIngenieria=new ArrayList();//array de profesiones
    ProfesionesIngenieria.add(Sistemas);//añade el objeto profesion al array de profesiones
    Ingeniería.setProfesiones(ProfesionesIngenieria);//envia el array de profesion al objeto facultad
    
    
    facultades.add(Ingeniería);
    
    //********************************************************************SALUD
    
        // secuencia: crear, nombrar, array, agregar, enviar-set, 

    Curso Biología=new Curso();//Creación del curso

    Semestre PrimeroMed=new Semestre();//crea semestre
    PrimeroMed.setCiclo("100-1");//nombre del semestre
    
    Profesion Medicina= new Profesion();//crea profesion
    Medicina.setNombre("Medicina");//nombra
    ArrayList<Semestre> SemestresMed=new ArrayList();//array
    SemestresMed.add(PrimeroMed);//añade objeto semestre al array de semestres
    Medicina.setSemestres(SemestresMed);//envia array al objeto profesion
    
    
    
    
    Facultad Salud=new Facultad();//crea facultad
    Salud.setNombre("Facultad de Ciencias de la Salud");//nombra
    ArrayList<Profesion> ProfesionesSalud=new ArrayList();//array
    ProfesionesSalud.add(Medicina);//añade objeto  profesion al array de profesiones
    Salud.setProfesiones(ProfesionesSalud);//envia  el array al objeto facultad
    
    
    
    facultades.add(Salud);
    
    
   }
   
    public ArrayList<Facultad> getFacultades() {
        return facultades;
    }

    public void setFacultades(ArrayList<Facultad> facultades) {
        this.facultades = facultades;
    }
   
}


