/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_matricula;


import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Lenovo
 */
public final class InscripcionCursos extends javax.swing.JFrame {
    
  
    /**
     * Creates new form InscripcionCursos
     */
    public InscripcionCursos() {
        initComponents();
        this.setLocationRelativeTo(null);
       // ingMecatronica();
    }
    public InscripcionCursos(int i) {
//     mecatronica.add("Álgebra matricial");
//     mecatronica.add("Comunicación académica");
//     mecatronica.add("Fundamentos de cálculo");
//     mecatronica.add("Fundamentos de física");
//     mecatronica.add("Laboratorio de química 1");
//     ingMecatronica.setAsignatura(mecatronica);
//     
//     
//     rbtn_1.setText(ingMecatronica.getAsignatura().get(0)); 
//     rbtn_2.setText(ingMecatronica.getAsignatura().get(1));
//     rbtn_3.setText(ingMecatronica.getAsignatura().get(2));
//     rbtn_4.setText(ingMecatronica.getAsignatura().get(3));
//     rbtn_5.setText(ingMecatronica.getAsignatura().get(4));
//     
        
    }


 /*public void ingGeologica(){
     Cursos ingGeologica = new Cursos();
     ArrayList<String> geologia = new ArrayList<>();
     geologia.add("Álgebra matricial y geometría analítica");
     geologia.add("Comunicación académica");
     geologia.add("Fundamentos de cálculo");
     geologia.add("Fundamentos de física");
     geologia.add("Química 1");
     ingGeologica.setAsignatura(geologia);
     
     
     check_curso1 = new JCheckBox(ingGeologica.getAsignatura().get(0)); 
     check_curso2 = new JCheckBox(ingGeologica.getAsignatura().get(1));
     check_curso3 = new JCheckBox(ingGeologica.getAsignatura().get(2));
     check_curso4 = new JCheckBox(ingGeologica.getAsignatura().get(3));
     check_curso5 = new JCheckBox(ingGeologica.getAsignatura().get(4));
     add(check_curso1);
     add(check_curso2);
     add(check_curso3);
     add(check_curso4);
     add(check_curso5);  
 }
  public void ingCivil(){

     Cursos ingCivil = new Cursos();
     ArrayList<String> civil = new ArrayList<>();
     civil.add("Álgebra matricial y geometría analítica");
     civil.add("Comunicación académica");
     civil.add("Fundamentos de cálculo");
     civil.add("Fundamentos de física");
     civil.add("Química 1");
     ingCivil.setAsignatura(civil);
     
     
     
     check_curso1 = new JCheckBox(ingCivil.getAsignatura().get(0)); 
     check_curso2 = new JCheckBox(ingCivil.getAsignatura().get(1));
     check_curso3 = new JCheckBox(ingCivil.getAsignatura().get(2));
     check_curso4 = new JCheckBox(ingCivil.getAsignatura().get(3));
     check_curso5 = new JCheckBox(ingCivil.getAsignatura().get(4));
     add(check_curso1);
     add(check_curso2);
     add(check_curso3);
     add(check_curso4);
     add(check_curso5);
  }    
    public void diesñoGrafico(){

     Cursos disGrafico = new Cursos();
     ArrayList<String> disGraf = new ArrayList<>();
     disGraf.add("Lenguaje 1");
     disGraf.add("Dibujo Modelado 1");
     disGraf.add("Composición 1 ");
     disGraf.add("Dibujo Geométrico 1");
     disGraf.add("Anatomía Artística 1");
     disGrafico.setAsignatura(disGraf);
     
     
     check_curso1 = new JCheckBox(disGrafico.getAsignatura().get(0)); 
     check_curso2 = new JCheckBox(disGrafico.getAsignatura().get(1));
     check_curso3 = new JCheckBox(disGrafico.getAsignatura().get(2));
     check_curso4 = new JCheckBox(disGrafico.getAsignatura().get(3));
     check_curso5 = new JCheckBox(disGrafico.getAsignatura().get(4));
     add(check_curso1);
     add(check_curso2);
     add(check_curso3);
     add(check_curso4);
     add(check_curso5);
    }
  public void diseñoIndustrial(){
    
     
     Cursos disIndustrial = new Cursos();
     ArrayList<String> disIndus = new ArrayList<>();
     disIndus.add("Comunicación oral y escrita");
     disIndus.add("Introducción al Arte");
     disIndus.add("Dibujo Modelado");
     disIndus.add("Dibujo Geométrico 1 ");
     disIndus.add("Taller digital");
     disIndustrial.setAsignatura(disIndus);
     
     
      check_curso1 = new JCheckBox(disIndustrial.getAsignatura().get(0)); 
     check_curso2 = new JCheckBox(disIndustrial.getAsignatura().get(1));
     check_curso3 = new JCheckBox(disIndustrial.getAsignatura().get(2));
     check_curso4 = new JCheckBox(disIndustrial.getAsignatura().get(3));
     check_curso5 = new JCheckBox(disIndustrial.getAsignatura().get(4));
     add(check_curso1);
     add(check_curso2);
     add(check_curso3);
     add(check_curso4);
     add(check_curso5);
     
  }
    public void diseñoModas(){

     Cursos arteModa = new Cursos();
     ArrayList<String> disModas = new ArrayList<>();
     disModas.add("Comunicación Oral y escrita");
     disModas.add("Introducción al Arte");
     disModas.add("Lenguaje");
     disModas.add("Dibujo Modelado");
     disModas.add("Composición 1");
     arteModa.setAsignatura(disModas);
             
     //****************************************
     
    EscuelaGeneral es = new EscuelaGeneral();
   
     check_curso1 = new JCheckBox(arteModa.getAsignatura().get(0)); 
     check_curso2 = new JCheckBox(arteModa.getAsignatura().get(1));
     check_curso3 = new JCheckBox(arteModa.getAsignatura().get(2));
     check_curso4 = new JCheckBox(arteModa.getAsignatura().get(3));
     check_curso5 = new JCheckBox(arteModa.getAsignatura().get(4));
     add(check_curso1);
     add(check_curso2);
     add(check_curso3);
     add(check_curso4);
     add(check_curso5);    
     
     //*********************************************
      
    
 }*/
    

    

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JButton();
        btn_Rehacer = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txt_Curso1 = new javax.swing.JTextField();
        txt_Curso2 = new javax.swing.JTextField();
        txt_Curso3 = new javax.swing.JTextField();
        txt_Curso4 = new javax.swing.JTextField();
        txt_Curso5 = new javax.swing.JTextField();
        rbtn_1 = new javax.swing.JRadioButton();
        rbtn_2 = new javax.swing.JRadioButton();
        rbtn_3 = new javax.swing.JRadioButton();
        rbtn_4 = new javax.swing.JRadioButton();
        rbtn_5 = new javax.swing.JRadioButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("INSCRIPCIÓN DE ASIGNATURAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 470, 50));

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("CURSOS DISPONIBLES");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrame/132womanstudent2_100407 (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 100, 220, 260));

        btn_Guardar.setText("GUARDAR");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 110, 60));

        btn_Rehacer.setText("REHACER");
        btn_Rehacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RehacerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Rehacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 110, 60));

        btn_volver.setText("VOLVER");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 120, 60));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 10, 280));

        jLabel7.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("CRÉDITOS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 110, 30));

        txt_Curso1.setEditable(false);
        getContentPane().add(txt_Curso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 60, -1));

        txt_Curso2.setEditable(false);
        getContentPane().add(txt_Curso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 60, -1));

        txt_Curso3.setEditable(false);
        getContentPane().add(txt_Curso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 60, -1));

        txt_Curso4.setEditable(false);
        getContentPane().add(txt_Curso4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 60, -1));

        txt_Curso5.setEditable(false);
        getContentPane().add(txt_Curso5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 60, -1));
        getContentPane().add(rbtn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 180, -1));
        getContentPane().add(rbtn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, -1));
        getContentPane().add(rbtn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 180, -1));
        getContentPane().add(rbtn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 180, -1));
        getContentPane().add(rbtn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 180, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrame/login.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed

        JOptionPane.showMessageDialog(null,"Se ha guardado correctamente");
         
         
//         
//         PDF pdf = new PDF();
//         pdf.setVisible(true);
//         dispose();

        
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_RehacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RehacerActionPerformed
        dispose();
        InscripcionCursos mc = new InscripcionCursos();
        mc.setVisible(true);
    }//GEN-LAST:event_btn_RehacerActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        Login login= new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Rehacer;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rbtn_1;
    private javax.swing.JRadioButton rbtn_2;
    private javax.swing.JRadioButton rbtn_3;
    private javax.swing.JRadioButton rbtn_4;
    private javax.swing.JRadioButton rbtn_5;
    private javax.swing.JTextField txt_Curso1;
    private javax.swing.JTextField txt_Curso2;
    private javax.swing.JTextField txt_Curso3;
    private javax.swing.JTextField txt_Curso4;
    private javax.swing.JTextField txt_Curso5;
    // End of variables declaration//GEN-END:variables
}
