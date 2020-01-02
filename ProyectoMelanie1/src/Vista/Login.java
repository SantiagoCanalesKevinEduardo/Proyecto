
package Vista;





import javax.swing.DefaultComboBoxModel;
import Vista.InscripcionCursos;
import proyectomelanie.Estudiante;
import proyectomelanie.baseDatos;



public class Login extends javax.swing.JFrame {

    private Estudiante estudiante=new Estudiante();//objeto estudiante

    public Estudiante getEstudiante() {
        return estudiante;
    }
    
    private baseDatos BaseDatos=new baseDatos();//objeto base de datos
    //método cargar
    public void Cargar()
    {
        String[] facultades=new String[BaseDatos.getFacultades().size()];//array de facultades con datos de las facultades de la base de datos
        for (int i = 0; i < BaseDatos.getFacultades().size(); i++) {//tamaño  del número de facultades
            facultades[i]=BaseDatos.getFacultades().get(i).getNombre();//i=nombre de la facultad
        }
        DefaultComboBoxModel Modelo=new DefaultComboBoxModel(facultades);//items en el combo de facultades
        cmb_facultad.setModel(Modelo);//envía datos al combo
    }
    
    //método  cargarFacultades
    public void CargarFacultades()
    {
        if(cmb_facultad.getSelectedIndex()==0)//primera facultad
        {
            //dentro de las facultades;la primera; obtener el número de profesiones
            String[] Carreras=new String[BaseDatos.getFacultades().get(0).getProfesiones().size()];
            for (int i = 0; i < BaseDatos.getFacultades().get(0).getProfesiones().size(); i++) {//número de profesiones
                Carreras[i]=BaseDatos.getFacultades().get(0).getProfesiones().get(i).getNombre();//i=nombre de las profesiones
            }
            DefaultComboBoxModel ModeloProfesiones=new DefaultComboBoxModel(Carreras);//items en combo de profesiones
            cmb_carrera.setModel(ModeloProfesiones);//envia datos al combo
            
        } else if (cmb_facultad.getSelectedIndex()==1)//segunda facultad
        {
            //dentro de las facultades;la segunda; obtener el número de profesiones
            String[] Carreras=new String[BaseDatos.getFacultades().get(1).getProfesiones().size()];
            for (int i = 0; i < BaseDatos.getFacultades().get(1).getProfesiones().size(); i++) {
                Carreras[i]=BaseDatos.getFacultades().get(1).getProfesiones().get(i).getNombre();
            }
            DefaultComboBoxModel ModeloProfesiones=new DefaultComboBoxModel(Carreras);//items en combo de profesiones
            cmb_carrera.setModel(ModeloProfesiones);
        }
    }
    
   
    //método cargar semestres
    public void CargarSemestres()
    {
        //si es la primera facultad y la primera carrera
        if(cmb_facultad.getSelectedIndex()==0&&cmb_carrera.getSelectedIndex()==0)
        {
            //array del número de semestres de la primera profesion de la primera facultad
            String[] Semestres=new String[BaseDatos.getFacultades().get(0).getProfesiones().get(0).getSemestres().size()];
            for (int i = 0; i < BaseDatos.getFacultades().get(0).getProfesiones().get(0).getSemestres().size(); i++) {
                Semestres[i]=BaseDatos.getFacultades().get(0).getProfesiones().get(0).getSemestres().get(i).getCiclo();
            }
            DefaultComboBoxModel ModeloSemestres=new DefaultComboBoxModel(Semestres);
            cmb_Serie.setModel(ModeloSemestres);
        }else if (cmb_facultad.getSelectedIndex()==1&&cmb_carrera.getSelectedIndex()==1)
        {
            //array del número de semestres de la segunda profesion de la segunda facultad
            String[] Semestres=new String[BaseDatos.getFacultades().get(1).getProfesiones().get(1).getSemestres().size()];
            for (int i = 0; i < BaseDatos.getFacultades().get(1).getProfesiones().get(1).getSemestres().size(); i++) {
                Semestres[i]=BaseDatos.getFacultades().get(1).getProfesiones().get(1).getSemestres().get(i).getCiclo();
            }
            DefaultComboBoxModel ModeloSemestres=new DefaultComboBoxModel(Semestres);
            cmb_Serie.setModel(ModeloSemestres);
        }
    }
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        Cargar();
        CargarFacultades();
        CargarSemestres();
    }
    
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        cmb_facultad = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        cmb_Serie = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        cmb_carrera = new javax.swing.JComboBox<String>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel7.setText("Facultad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 40));

        cmb_facultad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_facultadItemStateChanged(evt);
            }
        });
        cmb_facultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_facultadActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_facultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 340, 30));

        jLabel6.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabel6.setText("Serie:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        cmb_Serie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        getContentPane().add(cmb_Serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 80, 30));

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel1.setText("Profesión:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        cmb_carrera.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_carreraItemStateChanged(evt);
            }
        });
        getContentPane().add(cmb_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 340, 30));

        jButton2.setText("VOLVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 110, 40));

        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 100, 40));

        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 51));
        jLabel2.setText("DATOS ESPECÍFICOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 360, 60));

        fondo.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login_1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Registrarse registrarse=new Registrarse();
        registrarse.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        
        
        System.out.println("Contraseña: "+estudiante.getContraseña());
        System.out.println("Dirección: "+estudiante.getDirección());
        System.out.println("Nombres Estudiante: "+estudiante.getNombres());
        System.out.println("Apellidos Estudiante: "+estudiante.getApellidos());
        System.out.println("Teléfono Estudiante: "+estudiante.getTelefono());
        System.out.println("Fecha de nacimiento: "+estudiante.getFechaNacimiento());
        System.out.println("Código: "+estudiante.getCódigo());
        System.out.println("Facultad: "+estudiante.getFacultad());
        System.out.println("Carrera: "+estudiante.getProfesión());
        System.out.println("Semestre: "+estudiante.getSemestre());
        System.out.println("Sexo Estudiante: "+estudiante.getSexo());
        System.out.println("Nombres Padre: "+estudiante.getPadre().getNombres());
        System.out.println("Apellidos : "+estudiante.getPadre().getApellidos());
        System.out.println("Sexo Padre: "+estudiante.getPadre().getSexo());
        System.out.println("Teléfono Padre: "+estudiante.getPadre().getTelefono());
            
        int i = cmb_facultad.getSelectedIndex();
        
        
      if(i==0){
          InscripcionCursos escuela = new InscripcionCursos();
         escuela.getCursosSistemas();
         escuela.setVisible(true);
         dispose();
      }else {
          InscripcionCursos escuela2 = new InscripcionCursos();
         
         escuela2.setVisible(true);
         dispose();
      }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmb_facultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_facultadActionPerformed
    
      
    }//GEN-LAST:event_cmb_facultadActionPerformed

    private void cmb_facultadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_facultadItemStateChanged

        CargarFacultades();
        
        }//GEN-LAST:event_cmb_facultadItemStateChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void cmb_carreraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_carreraItemStateChanged
        CargarSemestres();
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_carreraItemStateChanged

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_Serie;
    private javax.swing.JComboBox<String> cmb_carrera;
    private javax.swing.JComboBox<String> cmb_facultad;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
