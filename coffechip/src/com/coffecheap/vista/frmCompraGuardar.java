/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffecheap.vista;

import javax.swing.JTextField;

/**
 *
 * @author javam
 */
public class frmCompraGuardar extends javax.swing.JPanel {

    /**
     * Creates new form frmCompraGuardar
     */
    public frmCompraGuardar() {
        initComponents();
        ((JTextField) this.jdcFecha.getDateEditor()).setEditable(false);
        //jdcFecha.set(false);
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
        cmbNoOrden = new javax.swing.JComboBox<>();
        cmbProducto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtNoFactura = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnIntermediario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIntermediario = new javax.swing.JTable();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        btnIngresar = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 51));
        setLayout(null);

        panPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panPrincipal.setLayout(null);

        cmbNoOrden.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbNoOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panPrincipal.add(cmbNoOrden);
        cmbNoOrden.setBounds(120, 110, 220, 40);

        cmbProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panPrincipal.add(cmbProducto);
        cmbProducto.setBounds(390, 110, 220, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Cantidad");
        panPrincipal.add(jLabel1);
        jLabel1.setBounds(730, 90, 100, 20);

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        panPrincipal.add(txtCantidad);
        txtCantidad.setBounds(660, 110, 210, 40);

        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });
        panPrincipal.add(txtCosto);
        txtCosto.setBounds(120, 200, 220, 40);
        panPrincipal.add(txtNoFactura);
        txtNoFactura.setBounds(390, 200, 220, 40);
        panPrincipal.add(txtSerie);
        txtSerie.setBounds(660, 200, 210, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Costo");
        panPrincipal.add(jLabel2);
        jLabel2.setBounds(200, 180, 90, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("No. de Factura");
        panPrincipal.add(jLabel3);
        jLabel3.setBounds(450, 180, 110, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Serie");
        panPrincipal.add(jLabel4);
        jLabel4.setBounds(740, 180, 50, 15);

        btnIntermediario.setText("Intermediario");
        panPrincipal.add(btnIntermediario);
        btnIntermediario.setBounds(410, 270, 160, 30);

        tblIntermediario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Transaccion", "No. de Orden", "Nombre", "Cantidad", "Costo", "No. de Factura", "Serie", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblIntermediario);
        if (tblIntermediario.getColumnModel().getColumnCount() > 0) {
            tblIntermediario.getColumnModel().getColumn(0).setPreferredWidth(25);
        }

        panPrincipal.add(jScrollPane1);
        jScrollPane1.setBounds(30, 350, 890, 270);
        panPrincipal.add(jdcFecha);
        jdcFecha.setBounds(660, 270, 210, 40);

        btnIngresar.setText("Ingresar");
        panPrincipal.add(btnIngresar);
        btnIngresar.setBounds(410, 660, 160, 40);

        add(panPrincipal);
        panPrincipal.setBounds(0, 0, 960, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCostoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIngresar;
    public javax.swing.JButton btnIntermediario;
    public javax.swing.JComboBox<String> cmbNoOrden;
    public javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JPanel panPrincipal;
    public javax.swing.JTable tblIntermediario;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtCosto;
    public javax.swing.JTextField txtNoFactura;
    public javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables
}