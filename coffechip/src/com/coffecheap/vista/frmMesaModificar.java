/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffecheap.vista;

/**
 *
 * @author user
 */
public class frmMesaModificar extends javax.swing.JPanel {

    /**
     * Creates new form frmEstado_mesaModificar
     */
    public frmMesaModificar() {
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
    lblCodigo = new javax.swing.JLabel();
    lblObservaciones = new javax.swing.JLabel();
    txtCodigoMod = new javax.swing.JTextField();
    txtNombreMod = new javax.swing.JTextField();
    btnModificar = new javax.swing.JButton();
    scpPrincipal = new javax.swing.JScrollPane();
    tblMesaModificar = new javax.swing.JTable();
    lblTitulo = new javax.swing.JLabel();

    setBackground(new java.awt.Color(255, 255, 255));
    setLayout(new java.awt.GridBagLayout());

    panPrincipal.setBackground(new java.awt.Color(255, 255, 255));
    panPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lblCodigo.setText("Codigo:");
    panPrincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 80, -1));

    lblObservaciones.setText("Nombre:");
    panPrincipal.add(lblObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 100, -1));

    txtCodigoMod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    panPrincipal.add(txtCodigoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 230, 40));

    txtNombreMod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    panPrincipal.add(txtNombreMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 230, 40));

    btnModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    btnModificar.setText("Modificar");
    panPrincipal.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 120, 40));

    tblMesaModificar.setModel(new javax.swing.table.DefaultTableModel(
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
    scpPrincipal.setViewportView(tblMesaModificar);

    panPrincipal.add(scpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 910, 200));

    lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    lblTitulo.setText("Estado Mesa");
    panPrincipal.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.ipadx = 27;
    gridBagConstraints.ipady = 99;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 11, 0);
    add(panPrincipal, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.JButton btnModificar;
  private javax.swing.JLabel lblCodigo;
  private javax.swing.JLabel lblObservaciones;
  private javax.swing.JLabel lblTitulo;
  private javax.swing.JPanel panPrincipal;
  private javax.swing.JScrollPane scpPrincipal;
  public javax.swing.JTable tblMesaModificar;
  public javax.swing.JTextField txtCodigoMod;
  public javax.swing.JTextField txtNombreMod;
  // End of variables declaration//GEN-END:variables
}
