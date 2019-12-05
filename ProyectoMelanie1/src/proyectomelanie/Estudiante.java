
package proyectomelanie;

public class Estudiante extends Persona{
    
    private String código;
    private String fechaNacimiento;
    private String dirección;
    private String contraseña;
    private String facultad;
    private String profesión;
    private String semestre;
    private Persona padre=new Persona();

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getProfesión() {
        return profesión;
    }

    public void setProfesión(String profesión) {
        this.profesión = profesión;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    public String getCódigo() {
        return código;
    }

    public void setCodigo(String codigo) {
        this.código = codigo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaDeNacimiento) {
        this.fechaNacimiento = fechaDeNacimiento;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String direccion) {
        this.dirección = direccion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    
}
