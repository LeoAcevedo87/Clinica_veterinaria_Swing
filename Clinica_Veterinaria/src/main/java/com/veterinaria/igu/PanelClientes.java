/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.veterinaria.igu;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Leo
 */
public class PanelClientes extends javax.swing.JPanel {

    /**
     * Creates new form PanelClientes
     */
    public PanelClientes() {
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

        jPanel1 = new javax.swing.JPanel();
        MascotaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCargarCliente = new javax.swing.JPanel();
        lblCargarMasco2 = new javax.swing.JLabel();
        btnEditarCliente = new javax.swing.JPanel();
        lblCargarMasco = new javax.swing.JLabel();
        btnActualizarCliente = new javax.swing.JPanel();
        lblCargarMasco1 = new javax.swing.JLabel();
        btnEliminarCliente = new javax.swing.JPanel();
        lblCargarMasco3 = new javax.swing.JLabel();
        btnBuscarCliente = new javax.swing.JPanel();
        lblCargarMasco4 = new javax.swing.JLabel();

        MascotaPanel.setBackground(new java.awt.Color(255, 255, 255));
        MascotaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"10", "33011", "leo ace", "56445", "gabo", "-asd@gg"},
                {"14", "31556", "pol", "8877", "p.l.f", "obesidad"},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "NOMBRE Y APELLIDO", "TELEFONO", "DIRECCION", "EMAIL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        MascotaPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 810, 510));

        btnCargarCliente.setBackground(new java.awt.Color(0, 102, 204));
        btnCargarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargarClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCargarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCargarClienteMouseExited(evt);
            }
        });
        btnCargarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCargarMasco2.setBackground(new java.awt.Color(0, 0, 0));
        lblCargarMasco2.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCargarMasco2.setForeground(new java.awt.Color(255, 255, 255));
        lblCargarMasco2.setText("CARGAR");
        btnCargarCliente.add(lblCargarMasco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 30));

        MascotaPanel.add(btnCargarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 210, 50));

        btnEditarCliente.setBackground(new java.awt.Color(0, 102, 204));
        btnEditarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarClienteMouseExited(evt);
            }
        });
        btnEditarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCargarMasco.setBackground(new java.awt.Color(0, 0, 0));
        lblCargarMasco.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCargarMasco.setForeground(new java.awt.Color(255, 255, 255));
        lblCargarMasco.setText("EDITAR");
        btnEditarCliente.add(lblCargarMasco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 70, 30));

        MascotaPanel.add(btnEditarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 210, 50));

        btnActualizarCliente.setBackground(new java.awt.Color(0, 102, 204));
        btnActualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarClienteMouseExited(evt);
            }
        });
        btnActualizarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCargarMasco1.setBackground(new java.awt.Color(0, 0, 0));
        lblCargarMasco1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCargarMasco1.setForeground(new java.awt.Color(255, 255, 255));
        lblCargarMasco1.setText("ACTUALIZAR");
        btnActualizarCliente.add(lblCargarMasco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 120, 30));

        MascotaPanel.add(btnActualizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, 210, 50));

        btnEliminarCliente.setBackground(new java.awt.Color(0, 102, 204));
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarClienteMouseExited(evt);
            }
        });
        btnEliminarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCargarMasco3.setBackground(new java.awt.Color(0, 0, 0));
        lblCargarMasco3.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCargarMasco3.setForeground(new java.awt.Color(255, 255, 255));
        lblCargarMasco3.setText("ELIMINAR");
        btnEliminarCliente.add(lblCargarMasco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 30));

        MascotaPanel.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 210, 50));

        btnBuscarCliente.setBackground(new java.awt.Color(0, 102, 204));
        btnBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseExited(evt);
            }
        });
        btnBuscarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCargarMasco4.setBackground(new java.awt.Color(0, 0, 0));
        lblCargarMasco4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lblCargarMasco4.setForeground(new java.awt.Color(255, 255, 255));
        lblCargarMasco4.setText("BUSCAR");
        btnBuscarCliente.add(lblCargarMasco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, 30));

        MascotaPanel.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 210, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MascotaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MascotaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void alEntrar(JPanel p){
        p.setBackground(new Color(21,10,112));
    }
    
    private void alSalir(JPanel p){
        p.setBackground(new Color(21,101,192));
    }
    
    private void btnCargarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarClienteMouseClicked
        //btnCargarMascota.setBackground(new Color(21,10,112));
    }//GEN-LAST:event_btnCargarClienteMouseClicked

    private void btnCargarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarClienteMouseEntered
        alEntrar(btnCargarCliente);
    }//GEN-LAST:event_btnCargarClienteMouseEntered

    private void btnCargarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarClienteMouseExited
        alSalir(btnCargarCliente);
    }//GEN-LAST:event_btnCargarClienteMouseExited

    private void btnEditarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarClienteMouseEntered
        alEntrar(btnEditarCliente);
    }//GEN-LAST:event_btnEditarClienteMouseEntered

    private void btnEditarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarClienteMouseExited
        alSalir(btnEditarCliente);
    }//GEN-LAST:event_btnEditarClienteMouseExited

    private void btnActualizarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarClienteMouseEntered
        alEntrar(btnActualizarCliente);
    }//GEN-LAST:event_btnActualizarClienteMouseEntered

    private void btnActualizarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarClienteMouseExited
        alSalir(btnActualizarCliente);
    }//GEN-LAST:event_btnActualizarClienteMouseExited

    private void btnEliminarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarClienteMouseEntered
        alEntrar(btnEliminarCliente);
    }//GEN-LAST:event_btnEliminarClienteMouseEntered

    private void btnEliminarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarClienteMouseExited
        alSalir(btnEliminarCliente);
    }//GEN-LAST:event_btnEliminarClienteMouseExited

    private void btnBuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseEntered
        alEntrar(btnBuscarCliente);
    }//GEN-LAST:event_btnBuscarClienteMouseEntered

    private void btnBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseExited
        alSalir(btnBuscarCliente);
    }//GEN-LAST:event_btnBuscarClienteMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MascotaPanel;
    private javax.swing.JPanel btnActualizarCliente;
    private javax.swing.JPanel btnBuscarCliente;
    private javax.swing.JPanel btnCargarCliente;
    private javax.swing.JPanel btnEditarCliente;
    private javax.swing.JPanel btnEliminarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCargarMasco;
    private javax.swing.JLabel lblCargarMasco1;
    private javax.swing.JLabel lblCargarMasco2;
    private javax.swing.JLabel lblCargarMasco3;
    private javax.swing.JLabel lblCargarMasco4;
    // End of variables declaration//GEN-END:variables
}