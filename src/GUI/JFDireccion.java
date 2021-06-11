/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import biblioteca.tda.dao.DireccionDAO;
import biblioteca.tda.modelo.Direccion;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author henrr
 */
public class JFDireccion extends javax.swing.JFrame {
    String [][] matrizDireccion = new String[100][5];
    DefaultTableModel modelo;
    /**
     * Creates new form JFDireccion
     */
    public JFDireccion() {
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

        txtNombreComuna = new javax.swing.JTextField();
        btnBuscarComuna = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIdComuna = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCalleDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumeroDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnBuscarDireccion = new javax.swing.JButton();
        txtIdDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDireccion = new javax.swing.JTable();
        btnAgregarDireccion = new javax.swing.JButton();
        btnModificarDireccion = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DIRECCION");

        txtNombreComuna.setEditable(false);
        txtNombreComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreComunaActionPerformed(evt);
            }
        });

        btnBuscarComuna.setText("Buscar");
        btnBuscarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarComunaActionPerformed(evt);
            }
        });

        jLabel1.setText("Id Comuna:");

        txtIdComuna.setEditable(false);

        jLabel3.setText("Comuna:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Direccion");

        jLabel5.setText("Calle:");

        jLabel6.setText("Numero:");

        jLabel7.setText("Id direccion:");

        btnBuscarDireccion.setText("Buscar");

        tblDireccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID DIRECCION", "CALLE", "NUMERO", "ID COMUNA", "LISTA DIRECCIONES"
            }
        ));
        tblDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDireccionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDireccion);

        btnAgregarDireccion.setText("Agregar");
        btnAgregarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDireccionActionPerformed(evt);
            }
        });

        btnModificarDireccion.setText("Modificar");
        btnModificarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDireccionActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(183, 183, 183))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdComuna)
                                    .addComponent(txtNombreComuna)
                                    .addComponent(txtIdDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarComuna)
                            .addComponent(btnBuscarDireccion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(btnModificarDireccion)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnListar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarDireccion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtCalleDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumeroDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarComuna))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnBuscarDireccion)
                    .addComponent(txtIdDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCalleDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumeroDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarDireccion)
                    .addComponent(btnModificarDireccion)
                    .addComponent(btnEliminar)
                    .addComponent(btnListar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarComunaActionPerformed
        // TODO add your handling code here:
        JDBuscarComuna jdBuscarComuna = new JDBuscarComuna(this, true);
        jdBuscarComuna.setVisible(true);
        while (jdBuscarComuna.sw == 0) {
            txtIdComuna.setText("");
            txtIdComuna.setText("");
        }
        txtNombreComuna.setText(jdBuscarComuna.comuna.getNombre());
        txtIdComuna.setText(String.valueOf(jdBuscarComuna.comuna.getId()));


    }//GEN-LAST:event_btnBuscarComunaActionPerformed

    private void txtNombreComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreComunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreComunaActionPerformed

    private void btnAgregarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDireccionActionPerformed
        // TODO add your handling code here:
        try {
            DireccionDAO direccionDAO = new DireccionDAO();
            Direccion direccion = new Direccion();
            direccion.setId(Integer.parseInt(txtIdDireccion.getText()));
            direccion.setCalle(txtCalleDireccion.getText());
            direccion.setNumero(txtNumeroDireccion.getText());
            direccion.setComunaId(Integer.parseInt(txtIdComuna.getText()));
            direccionDAO.insertar(direccion);
            limpiarControles();
            JOptionPane.showMessageDialog(null, "Direccion ingresada");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnAgregarDireccionActionPerformed

    private void tblDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDireccionMouseClicked
        // TODO add your handling code here:
        int fila = tblDireccion.getSelectedRow();
        txtIdDireccion.setText(tblDireccion.getValueAt(fila, 0).toString());
        txtCalleDireccion.setText(tblDireccion.getValueAt(fila, 1).toString());
        txtNumeroDireccion.setText(tblDireccion.getValueAt(fila, 2).toString());
        txtIdComuna.setText(tblDireccion.getValueAt(fila, 3).toString());
        
    }//GEN-LAST:event_tblDireccionMouseClicked

    private void btnModificarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDireccionActionPerformed
        // TODO add your handling code here:
        DireccionDAO direccionDAO = new DireccionDAO();
        try {
            Direccion direccion = new Direccion();
            direccion.setId(Integer.parseInt(txtIdDireccion.getText()));
            direccion.setCalle(txtCalleDireccion.getText());
            direccion.setId(Integer.parseInt(txtIdComuna.getText()));
            direccion.setNumero(txtNumeroDireccion.getText());
            direccionDAO.modificar(direccion);
            JOptionPane.showMessageDialog(null, "Direccion Modificada");
            limpiarControles();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }//GEN-LAST:event_btnModificarDireccionActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            DireccionDAO direccionDAO = new DireccionDAO();
            if (direccionDAO.eliminar(Integer.parseInt(txtIdDireccion.getText())) != 0) {
                JOptionPane.showMessageDialog(null, "Direccion Eliminada");
                limpiarControles();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró direrccion para eliminar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            // TODO add your handling code here:
            
            int fila = 0;
            DireccionDAO direccionDAO = new DireccionDAO();
            String[] titulos = {"ID DIRECCION", "CALLE", "NUMERO", "ID COMUNA", "LISTA DIRECCIONES"};
            ArrayList<Direccion> lista = direccionDAO.listarDirecciones();
            for(Direccion direccion: lista) {
                 matrizDireccion[fila][0] = String.valueOf(direccion.getId());
                 matrizDireccion[fila][1] = direccion.getCalle();
                
                 matrizDireccion[fila][2] = direccion.getNumero();
                 matrizDireccion[fila][3] = String.valueOf(direccion.getComunaId());
                 matrizDireccion[fila][4] = String.valueOf(direccion.getListaDirecciones());
                fila++;
            }
            modelo = new DefaultTableModel(matrizDireccion, titulos);
            tblDireccion.setModel(modelo);
        } catch (Exception ex) {        
            Logger.getLogger(JFDireccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnListarActionPerformed

    public void limpiarControles() {
        txtIdComuna.setText("");
        txtIdDireccion.setText("");
        txtNombreComuna.setText("");
        txtCalleDireccion.setText("");
        txtNumeroDireccion.setText("");
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
            java.util.logging.Logger.getLogger(JFDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDireccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDireccion;
    private javax.swing.JButton btnBuscarComuna;
    private javax.swing.JButton btnBuscarDireccion;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificarDireccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDireccion;
    private javax.swing.JTextField txtCalleDireccion;
    private javax.swing.JTextField txtIdComuna;
    private javax.swing.JTextField txtIdDireccion;
    private javax.swing.JTextField txtNombreComuna;
    private javax.swing.JTextField txtNumeroDireccion;
    // End of variables declaration//GEN-END:variables
}
