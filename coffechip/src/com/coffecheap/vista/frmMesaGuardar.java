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
public class frmMesaGuardar extends javax.swing.JPanel {

    /**
     * Creates new form frmEstado_mesa
     */
    public frmMesaGuardar() {
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
    lblNombre = new javax.swing.JLabel();
    txtNombreGuardar = new javax.swing.JTextField();
    btnGuardar = new javax.swing.JButton();
    lblNombre1 = new javax.swing.JLabel();
    txtNombreGuardar1 = new javax.swing.JTextField();
    lblNombre2 = new javax.swing.JLabel();
    txtNombreGuardar2 = new javax.swing.JTextField();
    jComboBox1 = new javax.swing.JComboBox<>();
    lblNombre3 = new javax.swing.JLabel();

    setBackground(new java.awt.Color(255, 255, 255));
    setPreferredSize(new java.awt.Dimension(1570, 800));
    setLayout(new java.awt.GridBagLayout());

    panPrincipal.setBackground(new java.awt.Color(255, 255, 255));
    panPrincipal.setLayout(null);

    lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    lblTitulo.setText("Mesa");
    panPrincipal.add(lblTitulo);
    lblTitulo.setBounds(420, 30, 100, 29);

    lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    lblNombre.setText("Nombre Estado");
    panPrincipal.add(lblNombre);
    lblNombre.setBounds(250, 80, 110, 19);

    txtNombreGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    panPrincipal.add(txtNombreGuardar);
    txtNombreGuardar.setBounds(370, 70, 230, 40);

    btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    btnGuardar.setText("Guardar");
    panPrincipal.add(btnGuardar);
    btnGuardar.setBounds(410, 280, 120, 40);

    lblNombre1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    lblNombre1.setText("Nombre Estado");
    panPrincipal.add(lblNombre1);
    lblNombre1.setBounds(250, 130, 110, 19);

    txtNombreGuardar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    panPrincipal.add(txtNombreGuardar1);
    txtNombreGuardar1.setBounds(370, 120, 230, 40);

    lblNombre2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    lblNombre2.setText("Nombre Estado");
    panPrincipal.add(lblNombre2);
    lblNombre2.setBounds(250, 230, 110, 19);

    txtNombreGuardar2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    panPrincipal.add(txtNombreGuardar2);
    txtNombreGuardar2.setBounds(370, 170, 230, 40);

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    panPrincipal.add(jComboBox1);
    jComboBox1.setBounds(370, 220, 230, 40);

    lblNombre3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    lblNombre3.setText("Nombre Estado");
    panPrincipal.add(lblNombre3);
    lblNombre3.setBounds(250, 180, 110, 19);

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
  private javax.swing.JComboBox<String> jComboBox1;
  private javax.swing.JLabel lblNombre;
  private javax.swing.JLabel lblNombre1;
  private javax.swing.JLabel lblNombre2;
  private javax.swing.JLabel lblNombre3;
  private javax.swing.JLabel lblTitulo;
  private javax.swing.JPanel panPrincipal;
  public javax.swing.JTextField txtNombreGuardar;
  public javax.swing.JTextField txtNombreGuardar1;
  public javax.swing.JTextField txtNombreGuardar2;
  // End of variables declaration//GEN-END:variables
}