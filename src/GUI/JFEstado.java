/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import biblioteca.tda.dao.EstadoDAO;
import biblioteca.tda.modelo.Estado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author henrr
 */
public class JFEstado extends javax.swing.JFrame {

    String[][] matrizEstado = new String[50][2];
    DefaultTableModel modelo;

    /**
     * Creates new form JFEstado
     */
    public JFEstado() {
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
        txtIdEstado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcionEstado = new javax.swing.JTextField();
        btnAgregarEstado = new javax.swing.JButton();
        btnBuscarEstado = new javax.swing.JButton();
        btnEliminarEstado = new javax.swing.JButton();
        btnModificarEstado = new javax.swing.JButton();
        btnListarEstado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Estado");

        jLabel2.setText("ID Estado:");

        jLabel3.setText("Descripción:");

        btnAgregarEstado.setText("Agregar");
        btnAgregarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEstadoActionPerformed(evt);
            }
        });

        btnBuscarEstado.setText("Buscar");
        btnBuscarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstadoActionPerformed(evt);
            }
        });

        btnEliminarEstado.setText("Eliminar");
        btnEliminarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEstadoActionPerformed(evt);
            }
        });

        btnModificarEstado.setText("Modificar");
        btnModificarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEstadoActionPerformed(evt);
            }
        });

        btnListarEstado.setText("Listar");
        btnListarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEstadoActionPerformed(evt);
            }
        });

        tblEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Descripción"
            }
        ));
        tblEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEstado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnAgregarEstado)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdEstado)
                                    .addComponent(txtDescripcionEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscarEstado)
                                .addGap(35, 35, 35)
                                .addComponent(btnEliminarEstado)
                                .addGap(35, 35, 35)
                                .addComponent(btnModificarEstado)
                                .addGap(34, 34, 34)
                                .addComponent(btnListarEstado)))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcionEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarEstado)
                    .addComponent(btnBuscarEstado)
                    .addComponent(btnEliminarEstado)
                    .addComponent(btnModificarEstado)
                    .addComponent(btnListarEstado))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstadoActionPerformed
        // TODO add your handling code here:

        try {
            Estado estado = new Estado();
            EstadoDAO estadoDAO = new EstadoDAO();

            estado.setId(Integer.parseInt(txtIdEstado.getText()));
            estado.setDescripcion(txtDescripcionEstado.getText());
            estadoDAO.insertar(estado);
            JOptionPane.showMessageDialog(null, "Idioma ingresado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_btnAgregarEstadoActionPerformed

    private void btnBuscarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstadoActionPerformed
        // TODO add your handling code here:

        try {
            Estado estado = new Estado();
            EstadoDAO estadoDAO = new EstadoDAO();
            
            estado = estadoDAO.buscar(Integer.parseInt(txtIdEstado.getText()));
            if (estado.getId() != 0) {
                txtDescripcionEstado.setText(estado.getDescripcion());
            } else {
                JOptionPane.showMessageDialog(null, "Estado no encontrado");
                limpiarControles();
                txtIdEstado.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarEstadoActionPerformed

    private void btnEliminarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEstadoActionPerformed
        // TODO add your handling code here:
        try {
            EstadoDAO estadoDAO = new EstadoDAO();
            if (estadoDAO.eliminar(Integer.parseInt(txtIdEstado.getText())) != 0) {
                JOptionPane.showMessageDialog(null, "Estado Eliminado");
                limpiarControles();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró estado para eliminar");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnEliminarEstadoActionPerformed

    private void btnModificarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEstadoActionPerformed
        // TODO add your handling code here:
        try {
            Estado estado = new Estado();
            EstadoDAO estadoDAO = new EstadoDAO();

            estado.setId(Integer.parseInt(txtIdEstado.getText()));
            estado.setDescripcion(txtDescripcionEstado.getText());
            estadoDAO.modificar(estado);
            JOptionPane.showMessageDialog(null, "Autor Modificado");
            limpiarControles();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnModificarEstadoActionPerformed

    private void btnListarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEstadoActionPerformed
        // TODO add your handling code here:
        try {
            int fila = 0;
            EstadoDAO estadoDAO = new EstadoDAO();
            String[] titulos = {"ID", "DESCRIPCION"};
            ArrayList<Estado> lista = estadoDAO.listarEstados();
            
            for(Estado estado : lista) {
                matrizEstado[fila][0] = String.valueOf(estado.getId());
                matrizEstado[fila][1] = estado.getDescripcion();
                fila++;
            }
            modelo = new DefaultTableModel(matrizEstado, titulos);
            tblEstado.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnListarEstadoActionPerformed

    private void tblEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstadoMouseClicked
        // TODO add your handling code here:
        int fila = tblEstado.getSelectedRow();
        txtIdEstado.setText(tblEstado.getValueAt(fila, 0).toString());
        txtDescripcionEstado.setText(tblEstado.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_tblEstadoMouseClicked

    public void limpiarControles() {
        txtIdEstado.setText("");
        txtDescripcionEstado.setText("");
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
            java.util.logging.Logger.getLogger(JFEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEstado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEstado;
    private javax.swing.JButton btnBuscarEstado;
    private javax.swing.JButton btnEliminarEstado;
    private javax.swing.JButton btnListarEstado;
    private javax.swing.JButton btnModificarEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEstado;
    private javax.swing.JTextField txtDescripcionEstado;
    private javax.swing.JTextField txtIdEstado;
    // End of variables declaration//GEN-END:variables
}
