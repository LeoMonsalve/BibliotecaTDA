/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import biblioteca.tda.dao.AutorDAO;
import biblioteca.tda.modelo.Autor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author henrr
 */
public class JFAutor extends javax.swing.JFrame {
    String [][] matrizAutor = new String[150][3];
    DefaultTableModel modelo;
    /**
     * Creates new form JFAutor
     */
    public JFAutor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdAutor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreAutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtApellidoAutor = new javax.swing.JTextField();
        btnAgregarAutor = new javax.swing.JButton();
        btnBuscarAutor = new javax.swing.JButton();
        btnEliminarAutor = new javax.swing.JButton();
        btnModificarAutor = new javax.swing.JButton();
        btnListarAutor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AUTOR");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Autor");

        jLabel2.setText("ID Autor:");

        jLabel3.setText("Nombre:");

        jLabel5.setText("Apellido:");

        txtApellidoAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoAutorActionPerformed(evt);
            }
        });

        btnAgregarAutor.setText("Agregar");
        btnAgregarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAutorActionPerformed(evt);
            }
        });

        btnBuscarAutor.setText("Buscar");
        btnBuscarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAutorActionPerformed(evt);
            }
        });

        btnEliminarAutor.setText("Eliminar");
        btnEliminarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAutorActionPerformed(evt);
            }
        });

        btnModificarAutor.setText("Modificar");
        btnModificarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAutorActionPerformed(evt);
            }
        });

        btnListarAutor.setText("Listar");
        btnListarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAutorActionPerformed(evt);
            }
        });

        tblAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido"
            }
        ));
        tblAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAutorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAutor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnAgregarAutor)
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscarAutor)
                            .addGap(18, 18, 18)
                            .addComponent(btnEliminarAutor)
                            .addGap(18, 18, 18)
                            .addComponent(btnModificarAutor)
                            .addGap(18, 18, 18)
                            .addComponent(btnListarAutor))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(231, 231, 231)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtApellidoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtApellidoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarAutor)
                    .addComponent(btnBuscarAutor)
                    .addComponent(btnEliminarAutor)
                    .addComponent(btnModificarAutor)
                    .addComponent(btnListarAutor))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoAutorActionPerformed

    private void btnAgregarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAutorActionPerformed
        // TODO add your handling code here:
        try {
            Autor autor = new Autor();
            AutorDAO autorDao = new AutorDAO();
            
            autor.setId(Integer.parseInt(txtIdAutor.getText()));
            autor.setNombre(txtNombreAutor.getText());
            autor.setApellido(txtApellidoAutor.getText());
            autorDao.insertar(autor);
            JOptionPane.showMessageDialog(null, "Autor ingresado");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_btnAgregarAutorActionPerformed

    private void btnBuscarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAutorActionPerformed
        // TODO add your handling code here:
        try {
            AutorDAO autorDao = new AutorDAO();
            Autor autor = autorDao.buscar(Integer.parseInt(txtIdAutor.getText()));
            if(autor.getId() != 0) {
                txtNombreAutor.setText(autor.getNombre());
                txtApellidoAutor.setText(autor.getApellido());
            } else {
                JOptionPane.showMessageDialog(null, "Autor no encontrado");
                limpiarControles();
                txtIdAutor.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarAutorActionPerformed

    private void btnEliminarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAutorActionPerformed
        // TODO add your handling code here:
        try {
            AutorDAO autorDao = new AutorDAO();
            if(autorDao.eliminar(Integer.parseInt(txtIdAutor.getText())) != 0) {
                JOptionPane.showMessageDialog(null, "Autor Eliminado");
                limpiarControles();
                txtIdAutor.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró autor para eliminar");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarAutorActionPerformed

    private void btnModificarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAutorActionPerformed
        // TODO add your handling code here:
        try {
            Autor autor = new Autor();
            AutorDAO autorDao = new AutorDAO();
            
            autor.setId(Integer.parseInt(txtIdAutor.getText()));
            autor.setNombre(txtNombreAutor.getText());
            autor.setApellido(txtApellidoAutor.getText());
            autorDao.modificar(autor);
            JOptionPane.showMessageDialog(null, "Autor Modificado");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnModificarAutorActionPerformed

    private void btnListarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAutorActionPerformed
        // TODO add your handling code here:
        try {
            int fila = 0;
            AutorDAO autorDao = new AutorDAO();
            String[] titulos = {"ID", "NOMBRE", "APELIIDO"};
            ArrayList<Autor> lista = autorDao.listar();
            for(Autor autor: lista) {
                matrizAutor[fila][0] = String.valueOf(autor.getId());
                matrizAutor[fila][1] = autor.getNombre();
                matrizAutor[fila][2] = autor.getApellido();
                fila ++;
            }
            modelo = new DefaultTableModel(matrizAutor, titulos);
            tblAutor.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_btnListarAutorActionPerformed

    private void tblAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAutorMouseClicked
        // TODO add your handling code here:
        int fila = tblAutor.getSelectedRow();
        txtIdAutor.setText(tblAutor.getValueAt(fila, 0).toString());
        txtNombreAutor.setText(tblAutor.getValueAt(fila, 1).toString());
        txtApellidoAutor.setText(tblAutor.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tblAutorMouseClicked

      public void limpiarControles() {
        txtIdAutor.setText("");
        txtNombreAutor.setText("");
        txtApellidoAutor.setText("");
    }
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
            java.util.logging.Logger.getLogger(JFAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAutor;
    private javax.swing.JButton btnBuscarAutor;
    private javax.swing.JButton btnEliminarAutor;
    private javax.swing.JButton btnListarAutor;
    private javax.swing.JButton btnModificarAutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAutor;
    private javax.swing.JTextField txtApellidoAutor;
    private javax.swing.JTextField txtIdAutor;
    private javax.swing.JTextField txtNombreAutor;
    // End of variables declaration//GEN-END:variables
}
