/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import BaseDatos.alumnosMatriculados;
import clases.Curso;
import java.awt.HeadlessException;
import java.awt.MenuComponent;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class MatriculaCursos extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    
    private final  alumnosMatriculados alumnos ;
    private double cont=0;

    // objeto del tipo log de aqui se sacara el indicedel alumno logeado
    private static Login log ;
    public MatriculaCursos() {
        this.alumnos = new alumnosMatriculados();
        
        initComponents();
        this.setLocationRelativeTo(null);
        log= new Login();
        model.addColumn("Sigla");
        model.addColumn("Tipo");
        model.addColumn("Curso");
        model.addColumn("Requisito");
        model.addColumn("Créditos");
        this.tabla.setModel(model);
        
        //para el numero de créditos


        
        
    
        // variables que ayudaran a reducir codigo
        
        String aux0;
        String aux1;
        int aux2;
        int aux3=0;
        Curso aux5;
        //que ayudaran a recudcir codigo y obtendremos variables nombre, creditos, y sigla del curso
        for (int i =0 ; i<alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().size()-1;i++){
            //nombre del curso
            aux0 = alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i).getNombreCurso();
            //requisito
            aux5= alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i).getRequisito();
            //tipo de Asignatura
            aux1=alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i).getTipo();
            //nota del curso
            aux3=alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular()
                    .get(i).getNota();
            
            
            
            
            if(aux5!=null){
                aux2=aux5.getNota();
            }else{
                aux2=0;
            }
            if ((11>aux3 && aux5==null && aux1.equals("R"))){
                box1.addItem(aux0);
            }else if (11>aux3  &&aux5==null&& aux1.equals("Co")){
                box2.addItem(aux0);
            }else if ( 11>aux3 &&aux5!=null &&aux2>11&& aux1.equals("R")){
                box1.addItem(aux0);
            }

        }
       
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        box1 = new javax.swing.JComboBox();
        box2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEliminarTodo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        contador = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Matricula de cursos");

        jLabel2.setText("Asignaturas regulares:");

        jLabel3.setText("<html>Asignaturas extracocorriculares:<html>");

        btnAgregar.setText("agregar curso regular");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEliminarTodo.setText("Agregar curso cocorricular");
        btnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoActionPerformed(evt);
            }
        });

        btnGuardar.setText("guardar todo");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        contador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Total de créditos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarTodo)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(contador)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnAgregar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarTodo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(contador)
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       String [] agregar ;
       agregar=new String [5];
       String aux7;
       String aux8;
       String aux0;
       String aux1;
       double aux2;
       Curso aux5;
       String aux6;
       String aux9;
       String aux10;
       int aux15;
       Curso curso;
       for (int i =0 ; i<alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().size()-1;i++){
            aux7=(String)box1.getSelectedItem();
            aux15=box1.getSelectedIndex();
           //nombre del curso
            aux0 = alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i).getNombreCurso();
            //requisito
            aux5= alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i).getRequisito();
            //tipo de Asignatura
            aux1=alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i).getTipo();
            //creditos del curso
            aux2=alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i).getCreditos();
            //sigla del curso
            aux6=alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i).getSigla();
            //Tipo del curso
            aux9=alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i).getTipo();
            //sigla del requisito
            curso =alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i);
            if (aux5!=null){
             aux10=aux5.getSigla();
             }else{
             aux10="Ninguno";
             }
            if (aux1.equals("R")&& aux7.equals(aux0) && cont<22 ){
               cont+=aux2;
               agregar[0]=aux6;
               agregar[1]=aux9;
               agregar[2]=aux0;
               agregar[3]=aux10;     
               agregar[4]=String.valueOf(aux2);
               this.contador.setText(String.valueOf(cont));
               alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getAsignaturasAprobadas().add(curso);
               box1.removeItemAt(aux15);
               
               break;
//           
            }
       }
       
       model.addRow(agregar);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoActionPerformed
        
       String [] agregar1 ;
       agregar1=new String [5];
      
       
       String aux7;
       String aux8;
       String aux0;
       String aux1;
       double aux2;
       Curso aux5;
       String aux6;
       String aux9;
       String aux10;
       Curso curso;
       int aux15;
        
        for (int i =0 ; i<alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().size()-1;i++){
            aux8=(String)box2.getSelectedItem();
            aux15=box2.getSelectedIndex();
           //nombre del curso
            aux0 = alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i).getNombreCurso();
            //requisito
            aux5= alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i).getRequisito();
            //tipo de Asignatura
            aux1=alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i).getTipo();
            //creditos del curso
            aux2=alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i).getCreditos();
            //sigla del curso
            aux6=alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i).getSigla();
            //Tipo del curso
            aux9=alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i).getTipo();
            //sigla del requisito
            curso =alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getMallaCurricular().get(i);
            if (aux5!=null){
             aux10=aux5.getSigla();
             }else{
             aux10="Ninguno";
             }
            if (aux1.equals("Co")&& aux8.equals(aux0) && cont<22 ){
               cont+=aux2;
               agregar1[0]=aux6;
               agregar1[1]=aux9;
               agregar1[2]=aux0;
               agregar1[3]=aux10;     
               agregar1[4]=String.valueOf(aux2);
               
               this.contador.setText(String.valueOf(cont));
               alumnosMatriculados.listaAlumnosMatriculados.get(log.getIndiceListaAlumno()).getAsignaturasAprobadas().add(curso);
               box2.removeItemAt(aux15);
               break;
            }
       }
        model.addRow(agregar1);
    }//GEN-LAST:event_btnEliminarTodoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
        int eli = tabla.getSelectedRow();
        
        int eli1 =tabla.getSelectedRow();
        if (eli>=-1){
            
            String aux =(String) model.getValueAt(eli1, 2);
            String aux13 =(String) model.getValueAt(eli1, 1);
            System.out.println(aux+aux13);
            model.removeRow(eli);
            if (aux13.equals("R")){
                box1.addItem(aux);
            }else{
                box2.addItem(aux);
            }
            cont-=Double.parseDouble((String) model.getValueAt(eli1, 4));
            this.contador.setText(String.valueOf(cont));
        }else{
           JOptionPane.showMessageDialog(null, "No hay nada para eliminar");
        }
        }catch(NumberFormatException | HeadlessException e){
            
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        JOptionPane.showMessageDialog(null, "Guardado exitoso");
        System.exit(0);
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box1;
    private javax.swing.JComboBox box2;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarTodo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel contador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
