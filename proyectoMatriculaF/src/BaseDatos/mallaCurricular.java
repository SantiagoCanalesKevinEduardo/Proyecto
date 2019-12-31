  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import clases.Curso;
import java.util.ArrayList;

public class mallaCurricular {
    //constructor sin parametros
    
    public mallaCurricular() {
        
    }
    //malla curricular de ingenieria de sistemas
    private  static ArrayList<Curso> _mallaSistemas ;
    
    public static ArrayList<Curso> getMallaCurricular(){
        /////////////Cursos de serie 100 impar/////////////////
        _mallaSistemas = new ArrayList<>();
        //curso Matematica Basica
        Curso matematicaBasica = new Curso ("MA-141","Matemática Básica","R",null,"impar","100",3);
        
        _mallaSistemas.add(matematicaBasica);
        
        //Algoritmos 
        Curso algoritmos = new Curso ("IS-141","Algoritmos","R",null,"impar","100",4);
        
        _mallaSistemas.add(algoritmos);
        
        //curso Lenguaje 
        Curso comunicacionOralEscrita = new Curso ("LE-141","Comuninación oral y escrita","R",null,"impar","100",2);
        
        _mallaSistemas.add(comunicacionOralEscrita);
        
        //Curso calculo
        Curso caculoI = new Curso ("MA-143","Cálculo I","R",null,"impar","100",5);
        _mallaSistemas.add(caculoI);
        
        //curso computación básica
        Curso computacionBasica = new Curso ("CC-121","Computación Básica","Co",null,"impar","100",2);
        _mallaSistemas.add(computacionBasica);
        
        //curso Economía
        Curso economia = new Curso ("EC-141","Cálculo I","R",null,"impar","100",3);
        _mallaSistemas.add(economia);
        
        //curso metodologia del estudio universitario
        Curso metodo = new Curso ("MD-141","Método del estudio Universitario","R",null,"impar","100",3);
        _mallaSistemas.add(metodo);
        //Curso Folclore 
        Curso folklore = new Curso ("Ac-121","folklore","Co",null,"impar","100",3);
        
        _mallaSistemas.add(folklore);

        /////////////Cursos de serie 100 par/////////////////
        
        Curso matematicaDiscreta = new Curso ("MD-141","Matemática Discreta","R",matematicaBasica,"par","100",3);
        _mallaSistemas.add(matematicaDiscreta);
        

        
        return _mallaSistemas;
        
    }
    
 
}
