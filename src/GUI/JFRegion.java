/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import biblioteca.tda.dao.RegionDAO;
import biblioteca.tda.modelo.Region;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author henrr
 */
public class JFRegion extends javax.swing.JFrame {
    String [][] matrizRegion = new String[30][2];
    DefaultTableModel modelo;
    /**
     * Creates new form JFRegion
     */
    public JFRegion() {
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
        txtIdRegion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreRegion = new javax.swing.JTextField();
        btnAgregarRegion = new javax.swing.JButton();
        btnBuscarRegion = new javax.swing.JButton();
        btnEliminarRegion = new javax.swing.JButton();
        btnModificarRegion = new javax.swing.JButton();
        btnListarRegion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGION");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Region");

        jLabel2.setText("ID Region:");

        jLabel3.setText("Nombre:");

        btnAgregarRegion.setText("Agregar");
        btnAgregarRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRegionActionPerformed(evt);
            }
        });

        btnBuscarRegion.setText("Buscar");
        btnBuscarRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRegionActionPerformed(evt);
            }
        });

        btnEliminarRegion.setText("Eliminar");
        btnEliminarRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegionActionPerformed(evt);
            }
        });

        btnModificarRegion.setText("Modificar");
        btnModificarRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRegionActionPerformed(evt);
            }
        });

        btnListarRegion.setText("Listar");
        btnListarRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarRegionActionPerformed(evt);
            }
        });

        tblRegion.setModel(new javax.swing.table.DefaultTableModel(
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
        tblRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarRegion)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarRegion)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarRegion)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarRegion)
                                .addGap(18, 18, 18)
                                .addComponent(btnListarRegion))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdRegion)
                            .addComponent(txtNombreRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarRegion)
                    .addComponent(btnBuscarRegion)
                    .addComponent(btnEliminarRegion)
                    .addComponent(btnModificarRegion)
                    .addComponent(btnListarRegion))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRegionActionPerformed
        // TODO add your handling code here:
        try {
            Region region = new Region();
            RegionDAO regionDAO = new RegionDAO();
            
            region.setId(Integer.parseInt(txtIdRegion.getText()));
            region.setNombre(txtNombreRegion.getText());
            regionDAO.insertar(region);
            JOptionPane.showMessageDialog(null, "Region ingresada");
        } catch (Exception e ) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_btnAgregarRegionActionPerformed

    private void btnBuscarRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRegionActionPerformed
        // TODO add your handling code here:
        try {
            RegionDAO regionDAO = new RegionDAO();
            Region region = regionDAO.buscar(Integer.parseInt(txtIdRegion.getText()));
            if(region.getId() != 0) {
                txtNombreRegion.setText(region.getNombre());
            } else {
                JOptionPane.showMessageDialog(null, "Region no encontrada");
                limpiarControles();
                txtIdRegion.requestFocus();
            }
        } catch(Exception e) {
            
        }
    }//GEN-LAST:event_btnBuscarRegionActionPerformed

    private void btnEliminarRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegionActionPerformed
        // TODO add your handling code here:
        try {
            RegionDAO regionDAO = new RegionDAO();
            if(regionDAO.eliminar(Integer.parseInt(txtIdRegion.getText())) != 0) {
                JOptionPane.showMessageDialog(null, "Region Eliminada");
                limpiarControles();
                txtIdRegion.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró región para eliminar");
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarRegionActionPerformed

    private void btnModificarRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRegionActionPerformed
        // TODO add your handling code here:
        try {
            RegionDAO regionDAO = new RegionDAO();
            Region region = new Region();
            
            region.setId(Integer.parseInt(txtIdRegion.getText()));
            region.setNombre(txtNombreRegion.getText());
            regionDAO.modificar(region);
            JOptionPane.showMessageDialog(null, "Region Modificada");
            limpiarControles();
        } catch(Exception e ) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnModificarRegionActionPerformed

    private void btnListarRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarRegionActionPerformed
        // TODO add your handling code here:
        try {
            int fila = 0;
            RegionDAO regionDAO = new RegionDAO();
            String[] titulos = {"ID", "NOMBRE"};
            ArrayList<Region> lista = regionDAO.listar();
            for(Region region : lista) {
                matrizRegion[fila][0] = String.valueOf(region.getId());
                matrizRegion[fila][1] = region.getNombre();
                fila++;
            }
            modelo = new DefaultTableModel(matrizRegion, titulos);
            tblRegion.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnListarRegionActionPerformed

    private void tblRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegionMouseClicked
        // TODO add your handling code here:
        int fila = tblRegion.getSelectedRow();
        txtIdRegion.setText(tblRegion.getValueAt(fila, 0).toString());
        txtNombreRegion.setText(tblRegion.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_tblRegionMouseClicked

    public void limpiarControles() {
        txtIdRegion.setText("");
        txtNombreRegion.setText("");
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
            java.util.logging.Logger.getLogger(JFRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRegion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarRegion;
    private javax.swing.JButton btnBuscarRegion;
    private javax.swing.JButton btnEliminarRegion;
    private javax.swing.JButton btnListarRegion;
    private javax.swing.JButton btnModificarRegion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegion;
    private javax.swing.JTextField txtIdRegion;
    private javax.swing.JTextField txtNombreRegion;
    // End of variables declaration//GEN-END:variables
}
