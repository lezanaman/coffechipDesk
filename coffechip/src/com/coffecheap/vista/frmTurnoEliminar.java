/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffecheap.vista;

/**
 *
 * @author javam
 */
public class frmTurnoEliminar extends javax.swing.JPanel {

    /**
     * Creates new form frmTurnoEliminar
     */
    public frmTurnoEliminar() {
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

        panPrincipal = new javax.swing.JPanel();
        lblIngreso = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTurno = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        panPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIngreso.setText("Ingrese El Codigo a Eliminar");
        panPrincipal.add(lblIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 190, -1));

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        panPrincipal.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 210, 30));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        panPrincipal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 110, -1));

        tblTurno.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTurno);

        panPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 920, 220));

        add(panPrincipal, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIngreso;
    private javax.swing.JPanel panPrincipal;
    public javax.swing.JTable tblTurno;
    public javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
