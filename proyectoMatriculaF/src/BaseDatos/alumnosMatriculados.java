package BaseDatos;
import clases.Alumno;
import java.util.ArrayList;

public class alumnosMatriculados {
    public  static ArrayList<Alumno> listaAlumnosMatriculados = new ArrayList<>() ;
    public  boolean  existencia ;
    private final  mallaCurricular mallaCurricular  ;
    
    public alumnosMatriculados() { 
        //crear alumno
        mallaCurricular = new mallaCurricular();
        Alumno a1 = new Alumno("Facultad de geología, minas y civil","Ingeniería de Sistemas","100","impar","enero 30, 2000", 
                mallaCurricular._mallaSistemas,
                "contraseña1","Jhosep" , "Arango Medina", 15, "M", 123, 98898887,"Jr. Euler 225");
//        modificacion de las notas de los cursos del alumno1
        a1.getMallaCurricular().get(0).setNota(12);
        a1.getMallaCurricular().get(1).setNota(12);
        a1.getMallaCurricular().get(2).setNota(12);
        a1.getMallaCurricular().get(3).setNota(12);
        

        Alumno a2 = new Alumno("Facultad de geología, minas y civil","Ingeniería de Sistemas","100","impar","febrero 30, 2000", mallaCurricular._mallaSistemas,
                "contraseña2","karla" , "Candia Medina", 15, "F", 1234, 98898887,"Jr. Tres mascaras 223");
        //modificacion de las notas de los cursos del alumno2
        a2 = new Alumno();
        Alumno a3 = new Alumno("Facultad de geología, minas y civil","Ingeniería de Sistemas","200","par","enero 10, 2000", mallaCurricular._mallaSistemas,
                "contraseña3","Felipe" , "Mons Camino", 15, "M", 12345, 98898887,"Jr. Ferreira 4");
        
        listaAlumnosMatriculados.add(a1);
        listaAlumnosMatriculados.add(a2);
        listaAlumnosMatriculados.add(a3);
        
    }
    
    public  boolean existeUsuario(int nroDni){
        //con este metodo se verfica que haya un solo usuario a travez del nroDni
        existencia =true;
        for (Alumno listaAlumnosMatriculado : listaAlumnosMatriculados) {
            if (listaAlumnosMatriculado.getDNI() != nroDni) {
                existencia = true;
            } else if (listaAlumnosMatriculado.getDNI() == nroDni) {
                existencia =false;
                break;
            } else {
                existencia = true;
            }   
        }
       return existencia;
        }
    }
    
    
    
    
    

