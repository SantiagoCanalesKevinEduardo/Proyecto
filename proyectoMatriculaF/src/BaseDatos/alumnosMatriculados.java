/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;
import clases.Alumno;
import java.util.ArrayList;



public class alumnosMatriculados {
    private mallaCurricular malla;
    private static ArrayList<Alumno> listaAlumnosMatriculados ;
    private static boolean  existencia ;
    public alumnosMatriculados() {

        
        
    }
    public   ArrayList<Alumno> listaDeMatriculados(){
        
        //crear alumno
        listaAlumnosMatriculados= new ArrayList<>();
        
        Alumno a1 = new Alumno("Facultad de geología, minas y civil","Ingeniería de Sistemas","100","impar","enero 30, 2000", 
                mallaCurricular.getMallaCurricular(),
                "selene1","Jhosep" , "Arango Medina", 15, "M", 123, 98898887,"Jr. Euler 225");
        a1.getMallaCurricular().get(0).setNota(12);
        a1.getMallaCurricular().get(1).setNota(12);
        a1.getMallaCurricular().get(2).setNota(12);
        a1.getMallaCurricular().get(3).setNota(12);
        

        Alumno a2 = new Alumno("Facultad de geología, minas y civil","Ingeniería de Sistemas","100","impar","febrero 30, 2000", mallaCurricular.getMallaCurricular(),
                "selene2","karla" , "Candia Medina", 15, "F", 1234, 98898887,"Jr. Tres mascaras 223");
        a2.getMallaCurricular().get(0).setNota(12);
        a2.getMallaCurricular().get(1).setNota(12);
        a2.getMallaCurricular().get(2).setNota(12);
        a2.getMallaCurricular().get(3).setNota(12);
        Alumno a3 = new Alumno("Facultad de geología, minas y civil","Ingeniería de Sistemas","200","par","enero 10, 2000", mallaCurricular.getMallaCurricular(),
                "selene3","Felipe" , "Mons Camino", 15, "M", 12345, 98898887,"Jr. Ferreira 4");
        
        listaAlumnosMatriculados.add(a1);
        listaAlumnosMatriculados.add(a2);
        listaAlumnosMatriculados.add(a3);
 
        return listaAlumnosMatriculados;
    }
    public  boolean existeUsuario(int nroDni){
        existencia =true;
        for (int i=0; i<listaDeMatriculados().size();i++){
            if (listaDeMatriculados().get(i).getDNI()!= nroDni){
                existencia = true;
               
                
            }else if (listaDeMatriculados().get(i).getDNI()== nroDni){
                existencia =false;
                break;
            }else{
                existencia = true;
                
            }   
        }
       return existencia;
        }
    }
    
    
    
    
    

