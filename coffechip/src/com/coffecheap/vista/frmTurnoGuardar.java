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
public class frmTurnoGuardar extends javax.swing.JPanel {

    /**
     * Creates new form frmTurno
     */
    public frmTurnoGuardar() {
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

        txtObservaciones = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtHorario = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1570, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtObservaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 230, 40));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Turno:");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        lblObservaciones.setText("Observaciones:");
        add(lblObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 110, -1));

        lblHorario.setText("Horario de Turno:");
        add(lblHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 100, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 120, 40));

        try {
            txtHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## a ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHorario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 230, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JFormattedTextField txtHorario;
    public javax.swing.JTextField txtObservaciones;
    // End of variables declaration//GEN-END:variables
}
