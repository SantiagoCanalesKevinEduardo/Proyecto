package clases;
import java.util.ArrayList;
public class Alumno extends Persona{
    private String facultad;
    private String profesion;
    private String semestre;
    private String serie;
    private String fechaNacimiento;
    private ArrayList<Curso> mallaCurricular;//importante 
    private ArrayList<Curso> asignaturasMatriculadas;
    private String password;

    public Alumno() {
    }
    //se va a usar la clase alumnosMatriculados
    public Alumno(String facultad, String profesion, String semestre, String serie,
            String fechaNacimiento, ArrayList<Curso> mallaCurricular, String password, 
            String nombres, String apellidos, int edad, String sexo, int DNI, int telefono, String direccion) {
        super(nombres, apellidos, edad, sexo, DNI, telefono, direccion);
        this.facultad = facultad;
        this.profesion = profesion;
        this.semestre = semestre;
        this.serie = serie;
        this.fechaNacimiento = fechaNacimiento;
        this.mallaCurricular = mallaCurricular;
        this.password = password;
    }
    
    //se va a usar en el formulario
    public Alumno(String fechaNacimiento, ArrayList<Curso> mallaCurricular, String password, 
            String nombres, String apellidos, int edad, String sexo, int DNI, int telefono, String direccion,String
                    serie,String semestre) {
        super(nombres, apellidos, edad, sexo, DNI, telefono, direccion);
        this.fechaNacimiento = fechaNacimiento;
        this.mallaCurricular = mallaCurricular;
        this.password = password;
        this.semestre= semestre;
        this.serie=serie;
        asignaturasMatriculadas= new ArrayList<>();
    }

    //clase importante///////////////////

    ///////////////////////
    
    
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public ArrayList<Curso> getMallaCurricular() {
        return mallaCurricular;
    }

    public void setMallaCurricular(ArrayList<Curso> mallaCurricular) {
        this.mallaCurricular = mallaCurricular;
    }

    public ArrayList<Curso> getAsignaturasMatriculadas() {
        return asignaturasMatriculadas;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return super.toString()+"\nFecha de Nacimiento: "+fechaNacimiento; 
    }
    
    public String mostrarDatosGenerales(){
        return "\nFacultad: "+facultad+
                "\nProfesión: "+profesion+"\nSemestre: "+semestre;
    }
    
}
