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

        jPanel1 = new javax.swing.JPanel();
        lblIngreso = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lblIngreso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblIngreso.setText("Ingrese El Codigo a Eliminar");
        jPanel1.add(lblIngreso);
        lblIngreso.setBounds(400, 180, 223, 22);

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtCodigo);
        txtCodigo.setBounds(410, 210, 210, 30);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(530, 270, 95, 31);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1010, 540);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIngreso;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}