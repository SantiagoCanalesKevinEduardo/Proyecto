
package interfaces;
import BaseDatos.alumnosMatriculados;
import BaseDatos.mallaCurricular;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import clases.Alumno;
import clases.Padre;

import javax.swing.JOptionPane;



public class Formulario extends javax.swing.JFrame {
    
    private static Alumno alumno;
    private Padre padre;
    private static alumnosMatriculados listaAlumnos ;
    

 
    private String nomAlumno,apeAlumno,edadAlumno,sexoAlumno,dniAlumno,fechaAlumno,
            teleAlumno,dirAlumno,nomPadre,apePadre,edadPadre,sexoPadre,
            dniPadre,ocupacion,cenTrabajo,telPadre,dirPadre;
    
    //se usara la lista de la malla curricular 
   
    private mallaCurricular malla;

    public Formulario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JButton();
        btn_Rehacer = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();
        txt_apeAlumno = new javax.swing.JTextField();
        txt_edadAlumno = new javax.swing.JTextField();
        txt_dniAlumno = new javax.swing.JTextField();
        txt_nomPadre = new javax.swing.JTextField();
        txt_apePadre = new javax.swing.JTextField();
        txt_edadPadre = new javax.swing.JTextField();
        txt_dniPadre = new javax.swing.JTextField();
        txt_ocupacionPadre = new javax.swing.JTextField();
        txt_centraPadre = new javax.swing.JTextField();
        txt_telePadre = new javax.swing.JTextField();
        txt_teleAlumno = new javax.swing.JTextField();
        txt_dirAlumno = new javax.swing.JTextField();
        txt_dirPadre = new javax.swing.JTextField();
        txt_nomAlumno = new javax.swing.JTextField();
        cmb_sexoAlumno = new javax.swing.JComboBox<String>();
        cmb_sexoPadre = new javax.swing.JComboBox<String>();
        date_Nacimiento = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmarPassword = new javax.swing.JPasswordField();
        jLabel22 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Teko SemiBold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("FICHA DE MATRICULA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 400, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 10, 460));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("APELLIDOS:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 20));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("EDAD:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, 20));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("SEXO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 50, 20));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("DNI:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 50, 20));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("<html>FECHA DE NACIMIENTO:<html>");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 110, 50));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("TELÉFONO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 90, 20));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 102));
        jLabel9.setText("DIRECCIÓN:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 100, 20));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("TELÉFONO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 100, 20));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText("NOMBRES:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 20));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setText("APELLIDOS:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 100, 20));

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 102));
        jLabel12.setText("EDAD:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 60, 20));

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 102));
        jLabel13.setText("DNI:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 40, 20));

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 102));
        jLabel14.setText("SEXO:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 50, 20));

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 102));
        jLabel15.setText("OCUPACIÓN:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 100, 20));

        jLabel16.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 102));
        jLabel16.setText("<html>CENTRO DE TRABAJO:<html>");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 100, 40));

        jLabel17.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 102));
        jLabel17.setText("DIRECCIÓN:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 100, 20));

        jLabel18.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 102));
        jLabel18.setText("NOMBRES:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 80, 20));

        jLabel19.setFont(new java.awt.Font("Adobe Myungjo Std M", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 0));
        jLabel19.setText("DATOS DEL ALUMNO");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 230, 30));

        jLabel20.setFont(new java.awt.Font("Adobe Myungjo Std M", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 0));
        jLabel20.setText("DATOS DEL PADRE/APODERADO");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 340, 30));

        btn_Guardar.setText("GUARDAR");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 100, 40));

        btn_Rehacer.setText("REHACER");
        btn_Rehacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RehacerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Rehacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 110, 40));

        btn_Volver.setText("VOLVER");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 110, 40));

        txt_apeAlumno.setFont(new java.awt.Font("Tekton Pro", 1, 12)); // NOI18N
        txt_apeAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apeAlumnoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apeAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 190, -1));

        txt_edadAlumno.setFont(new java.awt.Font("Tekton Pro", 1, 12)); // NOI18N
        txt_edadAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_edadAlumnoActionPerformed(evt);
            }
        });
        txt_edadAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edadAlumnoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_edadAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 60, -1));

        txt_dniAlumno.setFont(new java.awt.Font("Tekton Pro", 1, 12)); // NOI18N
        txt_dniAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dniAlumnoActionPerformed(evt);
            }
        });
        txt_dniAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dniAlumnoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_dniAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 200, -1));

        txt_nomPadre.setFont(new java.awt.Font("Tekton Pro", 1, 12)); // NOI18N
        txt_nomPadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nomPadreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nomPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 190, -1));

        txt_apePadre.setFont(new java.awt.Font("Tekton Pro", 1, 12)); // NOI18N
        txt_apePadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apePadreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apePadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 190, -1));

        txt_edadPadre.setFont(new java.awt.Font("Tekton Pro", 1, 12)); // NOI18N
        txt_edadPadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edadPadreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_edadPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 60, -1));

        txt_dniPadre.setFont(new java.awt.Font("Tekton Pro", 1, 12)); // NOI18N
        txt_dniPadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dniPadreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_dniPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 190, -1));

        txt_ocupacionPadre.setFont(new java.awt.Font("Tekton Pro", 1, 12)); // NOI18N
        txt_ocupacionPadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ocupacionPadreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_ocupacionPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 318, 190, -1));

        txt_centraPadre.setFont(new java.awt.Font("Tekton Pro", 1, 12)); // NOI18N
        txt_centraPadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_centraPadreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_centraPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 190, -1));

        txt_telePadre.setFont(new java.awt.Font("Tekton Pro", 1, 12)); // NOI18N
        txt_telePadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telePadreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_telePadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 190, -1));

        txt_teleAlumno.setFont(new java.awt.Font("Tekton Pro", 1, 12)); // NOI18N
        txt_teleAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_teleAlumnoActionPerformed(evt);
            }
        });
        txt_teleAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_teleAlumnoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_teleAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 200, -1));

        txt_dirAlumno.setFont(new java.awt.Font("Tekton Pro", 1, 12)); // NOI18N
        getContentPane().add(txt_dirAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 200, -1));

        txt_dirPadre.setFont(new java.awt.Font("Tekton Pro", 1, 12)); // NOI18N
        getContentPane().add(txt_dirPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 438, 190, -1));

        txt_nomAlumno.setFont(new java.awt.Font("Tekton Pro", 1, 12)); // NOI18N
        txt_nomAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomAlumnoActionPerformed(evt);
            }
        });
        txt_nomAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nomAlumnoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nomAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 190, -1));

        cmb_sexoAlumno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "F", "M" }));
        getContentPane().add(cmb_sexoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 60, -1));

        cmb_sexoPadre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "F", "M" }));
        getContentPane().add(cmb_sexoPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 60, -1));

        date_Nacimiento.setBackground(java.awt.Color.white);
        getContentPane().add(date_Nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 200, -1));

        jLabel21.setText("Password:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 200, -1));
        getContentPane().add(txtConfirmarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 200, -1));

        jLabel22.setText("confirmarPassword:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_edadAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_edadAlumnoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_edadAlumnoActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        // TODO add your handling code here:
        //estas variables me ayudaran a saber si en los textfield hay espacios vacios
        listaAlumnos = new alumnosMatriculados();
        String u, v, w, x, y, z, a, b, c, f;
        u = txt_nomAlumno.getText().replaceAll(" ", "");
        v = txt_apeAlumno.getText().replaceAll(" ", "");
        w = txt_dirAlumno.getText().replaceAll(" ", "");
        x = txt_dirPadre.getText().replaceAll(" ", "");
        y = txt_nomPadre.getText().replaceAll(" ", "");
        z = txtPassword.getText().replaceAll(" ", "");
        a = txtConfirmarPassword.getText().replaceAll(" ", "");
        b = txt_apePadre.getText().replaceAll(" ", "");
        c = txt_centraPadre.getText().replaceAll(" ", "");
        f = txt_ocupacionPadre.getText().replaceAll(" ", "");
        // verificar que no hayan espacios en blanco
        if (txt_edadAlumno.getText().equals("")  
                || txt_dniAlumno.getText().equals("")
                || u.equals("")
                || v.equals("")
                || w.equals("")
                || txt_dniPadre.getText().equals("")
                || x.equals("")
                || txt_edadPadre.getText().equals("")
                || y.equals("")
                || txt_teleAlumno.getText().equals("")
                || z.equals("")
                || a.equals("")
                || b.equals("")
                || c.equals("")
                || f.equals("")
                || txt_telePadre.getText().equals("")) {
            //si hay espacios vacios enviara este mensaje
            JOptionPane.showMessageDialog(null, "Hay espacios vacios, ingrese todos sus datos");

        } else {
            //verificar existencia de usuario se realiza a travez del dni
            
            if (listaAlumnos.existeUsuario(Integer.parseInt(txt_dniAlumno.getText()))==false) {
                System.out.println(Integer.parseInt(txt_dniAlumno.getText()));
                
                JOptionPane.showMessageDialog(null, "el usuario ya existe");
            } 
            
            else {
                //verificar que contraseña y confirmar contraseña sean iguales
                if (txtPassword.getText().equals(txtConfirmarPassword.getText())) {
                    nomAlumno = txt_nomAlumno.getText();//nombre del alumno
                    apeAlumno = txt_apeAlumno.getText();//apellido del alumno
                    edadAlumno = txt_edadAlumno.getText();//edad del alumno
                    int i = Integer.parseInt(edadAlumno);//se necesita que la edad sea un  int por eso se hace un casteo

                    //Dependiendo de lo que el alumno elgia en el comboBox se
                    //elegira el sexo "F" o "M" el cual será el sexo del alumno
                    if (cmb_sexoAlumno.getItemCount() >= 0 || cmb_sexoAlumno.getItemCount() < 2) {
                        sexoAlumno = String.valueOf(cmb_sexoAlumno.getSelectedItem());
                    }

                    dniAlumno = txt_dniAlumno.getText();//se necesita que el dni  sea un  int por eso se hace un casteo
                    int d = Integer.parseInt(dniAlumno);

                    teleAlumno = txt_teleAlumno.getText();//se necesita que el telefono  sea un  int por eso se hace un casteo
                    int t = Integer.parseInt(teleAlumno);

                    dirAlumno = txt_dirAlumno.getText();//direccion del alumno

                    //DATOS DEL PADRE
                    nomPadre = txt_nomPadre.getText();
                    apePadre = txt_apePadre.getText();
                    edadPadre = txt_edadPadre.getText();
                    int i2 = Integer.parseInt(edadPadre);

                    if (cmb_sexoPadre.getItemCount() >= 0 || cmb_sexoPadre.getItemCount() < 2) {
                        sexoPadre = String.valueOf(cmb_sexoPadre.getSelectedItem());
                    }

                    dniPadre = txt_dniPadre.getText();
                    int d2 = Integer.parseInt(dniPadre);

                    ocupacion = txt_ocupacionPadre.getText();
                    cenTrabajo = txt_centraPadre.getText();

                    telPadre = txt_telePadre.getText();
                    int t2 = Integer.parseInt(telPadre);

                    dirPadre = txt_dirPadre.getText();

                    Date date = date_Nacimiento.getDate();
                    DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
                    fechaAlumno = dateFormat.format(date);

            //***********creacion del objeto Alumno************************* 
                    // instanciar el objeto malla curricular y la implemento en el constructor de Alumno
                    malla = new mallaCurricular();

                    //instancia del objeto alumno
<<<<<<< HEAD
                    alumno = new Alumno(fechaAlumno, mallaCurricular._mallaSistemas, txtPassword.getText(), nomAlumno,
=======
                    alumno = new Alumno(fechaAlumno, mallaCurricular.CursosSistemas(), txtPassword.getText(), nomAlumno,
>>>>>>> d0064e4ab89c70e1c4de5735591789a01a12bb90
                            apeAlumno, i, sexoAlumno, d, t, dirAlumno, "100", "impar");
                    alumno.setFacultad("FACULTAD DE INGENIERÍA MINAS Y CIVIL");
                    alumno.setProfesion("Ingeniería de Sistemas");

                    // 100 e impar son la serie y el semestre , cuando el alumno se registra entonces 
                    //iniciaria en serie 100 y en el semestre impar
                    System.out.println("\tDATOS DEL ALUMNO:");
                    System.out.println(alumno);
                    //creacion del objeto padre
                    padre = new Padre(ocupacion, cenTrabajo, nomPadre,
                            apePadre, i2, sexoPadre, d2, t2, dirPadre);
                    System.out.println("\n\tDATOS DEL PADRE:");
                    System.out.println(padre);

                    //*************guardar al alumno en la base de datos*********
                    //instacia de la clase alumnos matriculados 
                    alumnosMatriculados.listaAlumnosMatriculados.add(alumno);
                    
                    //***********************************************************
                    
                   Login datos  =new Login();
                   datos.setVisible(true);
                   dispose();
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");

                }

            }
            
        }
        
    

    }//GEN-LAST:event_btn_GuardarActionPerformed
 public alumnosMatriculados getAlumnos() {
        return listaAlumnos;
    }
    private void btn_RehacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RehacerActionPerformed
        // TODO add your handling code here:
        Formulario formulario=new Formulario();
        formulario.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_RehacerActionPerformed

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        // TODO add your handling code here:
        Login login=new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void txt_nomAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nomAlumnoKeyTyped
        // TODO add your handling code here:
        char _ch = evt.getKeyChar();
        if(!Character.isLetter(_ch) && _ch != KeyEvent.VK_SPACE)evt.consume();
    }//GEN-LAST:event_txt_nomAlumnoKeyTyped

    private void txt_apeAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apeAlumnoKeyTyped
        // TODO add your handling code here:
        char _ch = evt.getKeyChar();
        if(!Character.isLetter(_ch) && _ch != KeyEvent.VK_SPACE)evt.consume();
    }//GEN-LAST:event_txt_apeAlumnoKeyTyped

    private void txt_edadAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadAlumnoKeyTyped
        // TODO add your handling code here:
        char _ch = evt.getKeyChar();
        if(!Character.isDigit(_ch))evt.consume();
    }//GEN-LAST:event_txt_edadAlumnoKeyTyped

    private void txt_dniAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniAlumnoKeyTyped
        // TODO add your handling code here:
        char _ch = evt.getKeyChar();
        if(!Character.isDigit(_ch))evt.consume();
    }//GEN-LAST:event_txt_dniAlumnoKeyTyped

    private void txt_teleAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_teleAlumnoKeyTyped
        // TODO add your handling code here:
        char _ch = evt.getKeyChar();
        if(!Character.isDigit(_ch))evt.consume();
    }//GEN-LAST:event_txt_teleAlumnoKeyTyped

    private void txt_nomPadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nomPadreKeyTyped
        // TODO add your handling code here:
        char _ch = evt.getKeyChar();
        if(!Character.isLetter(_ch) && _ch != KeyEvent.VK_SPACE)evt.consume();
    }//GEN-LAST:event_txt_nomPadreKeyTyped

    private void txt_apePadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apePadreKeyTyped
        // TODO add your handling code here:
        char _ch = evt.getKeyChar();
        if(!Character.isLetter(_ch) && _ch != KeyEvent.VK_SPACE)evt.consume();
    }//GEN-LAST:event_txt_apePadreKeyTyped

    private void txt_edadPadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadPadreKeyTyped
        // TODO add your handling code here:
        char _ch = evt.getKeyChar();
        if(!Character.isDigit(_ch))evt.consume();
    }//GEN-LAST:event_txt_edadPadreKeyTyped

    private void txt_dniPadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniPadreKeyTyped
        // TODO add your handling code here:
        char _ch = evt.getKeyChar();
        if(!Character.isDigit(_ch))evt.consume();
    }//GEN-LAST:event_txt_dniPadreKeyTyped

    private void txt_ocupacionPadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ocupacionPadreKeyTyped
        // TODO add your handling code here:
        char _ch = evt.getKeyChar();
        if(!Character.isLetter(_ch) && _ch != KeyEvent.VK_SPACE)evt.consume();
    }//GEN-LAST:event_txt_ocupacionPadreKeyTyped

    private void txt_centraPadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_centraPadreKeyTyped
        // TODO add your handling code here:
        char _ch = evt.getKeyChar();
        if(!Character.isLetter(_ch) && _ch != KeyEvent.VK_SPACE)evt.consume();
    }//GEN-LAST:event_txt_centraPadreKeyTyped

    private void txt_telePadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telePadreKeyTyped
        // TODO add your handling code here:
         char _ch = evt.getKeyChar();
        if(!Character.isDigit(_ch))evt.consume();
    }//GEN-LAST:event_txt_telePadreKeyTyped

    private void txt_nomAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomAlumnoActionPerformed

    private void txt_dniAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dniAlumnoActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_dniAlumnoActionPerformed

    private void txt_teleAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_teleAlumnoActionPerformed
        
    }//GEN-LAST:event_txt_teleAlumnoActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Rehacer;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox<String> cmb_sexoAlumno;
    private javax.swing.JComboBox<String> cmb_sexoPadre;
    private com.toedter.calendar.JDateChooser date_Nacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtConfirmarPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txt_apeAlumno;
    private javax.swing.JTextField txt_apePadre;
    private javax.swing.JTextField txt_centraPadre;
    private javax.swing.JTextField txt_dirAlumno;
    private javax.swing.JTextField txt_dirPadre;
    private javax.swing.JTextField txt_dniAlumno;
    private javax.swing.JTextField txt_dniPadre;
    private javax.swing.JTextField txt_edadAlumno;
    private javax.swing.JTextField txt_edadPadre;
    private javax.swing.JTextField txt_nomAlumno;
    private javax.swing.JTextField txt_nomPadre;
    private javax.swing.JTextField txt_ocupacionPadre;
    private javax.swing.JTextField txt_teleAlumno;
    private javax.swing.JTextField txt_telePadre;
    // End of variables declaration//GEN-END:variables
}
