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
public class frmTipoProductoGuardar extends javax.swing.JPanel {

    /**
     * Creates new form frmTurno
     */
    public frmTipoProductoGuardar() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        panPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1570, 800));
        setLayout(new java.awt.GridBagLayout());

        panPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panPrincipal.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Tipo Producto");
        panPrincipal.add(lblTitulo);
        lblTitulo.setBounds(370, 20, 200, 29);

        lblHorario.setText("Nombre Tipo");
        panPrincipal.add(lblHorario);
        lblHorario.setBounds(240, 90, 100, 14);

        txtObservaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panPrincipal.add(txtObservaciones);
        txtObservaciones.setBounds(350, 80, 230, 40);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        panPrincipal.add(btnGuardar);
        btnGuardar.setBounds(470, 230, 120, 40);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 909;
        gridBagConstraints.ipady = 459;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(panPrincipal, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panPrincipal;
    public javax.swing.JTextField txtObservaciones;
    // End of variables declaration//GEN-END:variables
}
