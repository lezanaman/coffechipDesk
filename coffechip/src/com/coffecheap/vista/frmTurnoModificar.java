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
public class frmTurnoModificar extends javax.swing.JPanel {

    /**
     * Creates new form frmTurnoModificar
     */
    public frmTurnoModificar() {
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
        txtHorarioMod = new javax.swing.JFormattedTextField();
        lblHorario = new javax.swing.JLabel();
        txtCodigoMod = new javax.swing.JTextField();
        txtObservacionesMod = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        scpPrincipal = new javax.swing.JScrollPane();
        tblTurnoModificar = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        panPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setText("Codigo:");
        panPrincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 80, -1));

        lblObservaciones.setText("Observaciones:");
        panPrincipal.add(lblObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 100, -1));

        try {
            txtHorarioMod.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## a ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHorarioMod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panPrincipal.add(txtHorarioMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 230, 40));

        lblHorario.setText("Horario de Turno:");
        panPrincipal.add(lblHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 100, -1));

        txtCodigoMod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCodigoMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoModKeyTyped(evt);
            }
        });
        panPrincipal.add(txtCodigoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 230, 40));

        txtObservacionesMod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panPrincipal.add(txtObservacionesMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 230, 40));

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        panPrincipal.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 120, 40));

        tblTurnoModificar.setModel(new javax.swing.table.DefaultTableModel(
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
        scpPrincipal.setViewportView(tblTurnoModificar);

        panPrincipal.add(scpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 910, 200));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.ipady = 99;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 11, 0);
        add(panPrincipal, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoModKeyTyped
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoModKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnModificar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JScrollPane scpPrincipal;
    public javax.swing.JTable tblTurnoModificar;
    public javax.swing.JTextField txtCodigoMod;
    public javax.swing.JFormattedTextField txtHorarioMod;
    public javax.swing.JTextField txtObservacionesMod;
    // End of variables declaration//GEN-END:variables
}
