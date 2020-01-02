/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


public class Curso {
    private String sigla;
    private String nombreCurso;
    private String tipo;//si es regular o coorricular 
    private Curso requisito;
    private String semestre;
    private String serie;
    private double creditos;
    private  int nota;
   

  

    // se usara en la malla curricular 
    public Curso(String sigla, String nombreCurso, String tipo, Curso requisito, String semestre, 
            String serie, double creditos) {
        
        this.sigla = sigla;
        this.nombreCurso = nombreCurso;
        this.tipo = tipo;
        this.semestre = semestre;
        this.serie = serie;
        this.creditos = creditos;
        this.requisito = requisito;
    }

    

    public String getSemestre() {
        return semestre;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setRequisito(Curso requisito) {
        this.requisito = requisito;
    }

    
    

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Curso getRequisito() {
        return requisito;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    
    public double getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getNota() {
        return nota;
    }
   
}
