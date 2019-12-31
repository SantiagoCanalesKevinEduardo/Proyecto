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
    private Curso requisito;//curso "A" que se necesita aprobar para llevar el curso "B" 
    private String semestre;//lo sacamos
    private String serie;//no sirve
    private double creditos;
    private int nota;
    private int indice;
    private boolean estado;
    // se usara en la malla curricular 
    public Curso(String sigla, String nombreCurso, String tipo, Curso requisito, String semestre, 
            String serie, int creditos) {
        this.sigla = sigla;
        this.nombreCurso = nombreCurso;
        this.tipo = tipo;
        this.requisito = requisito;
        this.semestre = semestre;
        this.serie = serie;
        this.creditos = creditos;
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

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
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

    public void setRequisito(Curso requisito) {
        this.requisito = requisito;
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

    public void setNota(int nota)
    {
        if (nota>=0 && nota <=20){
            this.nota = nota;
        }else{
            this.nota=0;
        }
        
    }
    public boolean isEstado() {
        if (getNota() >=10.5 ){
            this.estado =true;
            return this.estado;
        }else{
            this.estado=false;
            return this.estado;
        }
        
    }

  
    
    
    
}
