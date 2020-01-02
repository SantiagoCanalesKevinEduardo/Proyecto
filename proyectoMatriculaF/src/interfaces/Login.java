
package interfaces;

import BaseDatos.alumnosMatriculados;

import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    private alumnosMatriculados alumnos;
    private static int indiceListaAlumno;
    //se usara este metodo en a sigueinte clase
    public int getIndiceListaAlumno() {
        return indiceListaAlumno;
    }
  
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
    ///¨******;********************************************************/////
    //codigo para verificar si la contraseña y el usario existen
    public boolean existencia (){
        alumnos = new alumnosMatriculados();
        indiceListaAlumno = 0;

        boolean existeUsuario = false;
        //se uso un try y catch para evitar el error de cuando el txt_Usuario sean letras
        
        try {
            for (int i = 0; i < alumnosMatriculados.listaAlumnosMatriculados.size(); i++) {
                if (!alumnosMatriculados.listaAlumnosMatriculados.get(i).getPassword().equals(txt_Contraseña.getText())
                        && alumnosMatriculados.listaAlumnosMatriculados.get(i).getDNI() != Integer.parseInt(txt_Usuario.getText())) {

                    existeUsuario = false;
                } else if (alumnosMatriculados.listaAlumnosMatriculados.get(i).getPassword().equals(txt_Contraseña.getText())
                        && alumnosMatriculados.listaAlumnosMatriculados.get(i).getDNI() == Integer.parseInt(txt_Usuario.getText())) {

                    //de aqui obtendre el indice del alumno logeado
                    indiceListaAlumno = i;
                    System.out.println(i);

                    existeUsuario = true;
                    break;
                } else {
                    existeUsuario = false;

                }

            }
        } catch (Exception e) {

        }
        return existeUsuario;

    }
    public void limpiar(){
        txt_Contraseña.setText("");
        txt_Usuario.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lbl_Bienvenido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_Usuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_Contraseña = new javax.swing.JLabel();
        btn_Continuar = new javax.swing.JButton();
        txt_Contraseña = new javax.swing.JPasswordField();
        txt_Usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_Registrarse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Vladimir Script", 1, 100)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("PCUP");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 350, 90));

        lbl_Bienvenido.setBackground(new java.awt.Color(255, 102, 102));
        lbl_Bienvenido.setFont(new java.awt.Font("Vivaldi", 2, 60)); // NOI18N
        lbl_Bienvenido.setForeground(new java.awt.Color(102, 0, 0));
        lbl_Bienvenido.setText("Bienvenido");
        getContentPane().add(lbl_Bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 260, 70));

        jLabel5.setFont(new java.awt.Font("Tekton Pro Cond", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Et Lux in Tenebris Lucet");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 240, 40));

        lbl_Usuario.setFont(new java.awt.Font("Tekton Pro Ext", 3, 20)); // NOI18N
        lbl_Usuario.setForeground(new java.awt.Color(51, 51, 0));
        lbl_Usuario.setText("Usuario:");
        getContentPane().add(lbl_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 90, 20));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 30, 30));

        lbl_Contraseña.setFont(new java.awt.Font("Tekton Pro Ext", 2, 20)); // NOI18N
        lbl_Contraseña.setText("Contraseña:");
        getContentPane().add(lbl_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        btn_Continuar.setBackground(new java.awt.Color(0, 51, 51));
        btn_Continuar.setFont(new java.awt.Font("Tekton Pro Cond", 3, 28)); // NOI18N
        btn_Continuar.setForeground(new java.awt.Color(0, 51, 51));
        btn_Continuar.setText("Continuar");
        btn_Continuar.setFocusPainted(false);
        btn_Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 140, 60));

        txt_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContraseñaActionPerformed(evt);
            }
        });
        txt_Contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ContraseñaKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 180, 30));

        txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsuarioActionPerformed(evt);
            }
        });
        txt_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_UsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 180, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Si no tienes cuenta, haz clic en registrarse");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 300, -1));

        btn_Registrarse.setBackground(new java.awt.Color(102, 0, 0));
        btn_Registrarse.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 18)); // NOI18N
        btn_Registrarse.setForeground(new java.awt.Color(102, 102, 0));
        btn_Registrarse.setText("Registrarse");
        btn_Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarseActionPerformed(evt);
            }
        });
        btn_Registrarse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn_RegistrarseKeyTyped(evt);
            }
        });
        getContentPane().add(btn_Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 170, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrame/trophy_icon-icons.com_67206.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 140, 160));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 10, 370));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrame/next_user_16690.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 70, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrame/61_85304.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrame/users_21399.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 40, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrame/research_books_22128 (1).png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, 130));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrame/fondo_1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ContinuarActionPerformed
            
            if (existencia()==true){ 
                MatriculaCursos a = new MatriculaCursos();
                a.setVisible(true);
                dispose();
                    
            }else {
                JOptionPane.showMessageDialog(null, "el usuario no existe");
                limpiar();
            }
        
    }//GEN-LAST:event_btn_ContinuarActionPerformed

    private void txt_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ContraseñaActionPerformed

    }//GEN-LAST:event_txt_ContraseñaActionPerformed

    private void txt_ContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ContraseñaKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_ContraseñaKeyTyped

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed

    }//GEN-LAST:event_txt_UsuarioActionPerformed

    private void txt_UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_UsuarioKeyTyped

        char _ch=evt.getKeyChar();
        if(!Character.isLetterOrDigit(_ch))evt.consume();
    }//GEN-LAST:event_txt_UsuarioKeyTyped

    private void btn_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarseActionPerformed

        Formulario formulario=new Formulario();
        formulario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_RegistrarseActionPerformed

    private void btn_RegistrarseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_RegistrarseKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RegistrarseKeyTyped

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Continuar;
    private javax.swing.JButton btn_Registrarse;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_Bienvenido;
    private javax.swing.JLabel lbl_Contraseña;
    private javax.swing.JLabel lbl_Usuario;
    private javax.swing.JPasswordField txt_Contraseña;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
