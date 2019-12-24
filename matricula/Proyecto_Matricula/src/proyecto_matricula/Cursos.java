/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_matricula;

import java.util.ArrayList;


/**

 *
 * @author Lenovo
 */
public class Cursos {

    private String sigla;
    private String nombreCurso;
    private String requisito;
    private int creditos;
    private int nota;
    private boolean estado;

    public Cursos(String sigla, String nombreCurso, String requisito, int creditos, int nota) {
        this.sigla = sigla;
        this.nombreCurso = nombreCurso;
        this.requisito = requisito;
        this.creditos = creditos;
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

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

  
    
    
    
}
