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
public class frmEstado_mesaEliminar extends javax.swing.JPanel {

    /**
     * Creates new form frmEstado_mesaEliminar
     */
    public frmEstado_mesaEliminar() {
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
    txtCodigoElimar = new javax.swing.JTextField();
    btnEliminar = new javax.swing.JButton();
    lblTitulo = new javax.swing.JLabel();
    scpPrincipal = new javax.swing.JScrollPane();
    tblEstado_mesaEliminar = new javax.swing.JTable();

    setBackground(new java.awt.Color(255, 255, 255));
    setLayout(new java.awt.GridBagLayout());

    panPrincipal.setBackground(new java.awt.Color(255, 255, 255));
    panPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lblIngreso.setText("Ingrese El Codigo a Eliminar");
    panPrincipal.add(lblIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 190, -1));

    txtCodigoElimar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    panPrincipal.add(txtCodigoElimar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 210, 30));

    btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    btnEliminar.setText("Eliminar");
    panPrincipal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 110, -1));

    lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    lblTitulo.setText("Estado Mesa");
    panPrincipal.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 10, 160, -1));

    tblEstado_mesaEliminar.setModel(new javax.swing.table.DefaultTableModel(
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
    scpPrincipal.setViewportView(tblEstado_mesaEliminar);

    panPrincipal.add(scpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 910, 200));

    add(panPrincipal, new java.awt.GridBagConstraints());
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.JButton btnEliminar;
  private javax.swing.JLabel lblIngreso;
  private javax.swing.JLabel lblTitulo;
  private javax.swing.JPanel panPrincipal;
  private javax.swing.JScrollPane scpPrincipal;
  public javax.swing.JTable tblEstado_mesaEliminar;
  public javax.swing.JTextField txtCodigoElimar;
  // End of variables declaration//GEN-END:variables
}
