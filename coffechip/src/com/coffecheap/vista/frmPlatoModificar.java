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
public class frmPlatoModificar extends javax.swing.JPanel {

    /**
     * Creates new form frmTurnoModificar
     */
    public frmPlatoModificar() {
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
        lblId_Plato = new javax.swing.JLabel();
        lblNombre_Platillo = new javax.swing.JLabel();
        txtNombrePlatillo = new javax.swing.JTextField();
        txtIdPlato = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        scpPrincipal = new javax.swing.JScrollPane();
        tblTurnoModificar = new javax.swing.JTable();
        lblPrecio_Plato = new javax.swing.JLabel();
        txtttt = new javax.swing.JTextField();
        lblPorciones = new javax.swing.JLabel();
        txtPorciones = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        panPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblId_Plato.setText("Id Plato:");
        lblId_Plato.setToolTipText("");

        lblNombre_Platillo.setText("Nombre Platillo:");
        lblNombre_Platillo.setToolTipText("");

        txtNombrePlatillo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombrePlatillo.setAutoscrolls(false);
        txtNombrePlatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePlatilloActionPerformed(evt);
            }
        });
        txtNombrePlatillo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePlatilloKeyTyped(evt);
            }
        });

        txtIdPlato.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIdPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPlatoActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");

        tblTurnoModificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Plato", "Nombre del Platillo", "Precio Plato", "Porciones", "Descripcion del Plato"
            }
        ));
        scpPrincipal.setViewportView(tblTurnoModificar);

        lblPrecio_Plato.setText("Precio Plato");

        txtttt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttttActionPerformed(evt);
            }
        });

        lblPorciones.setText("Porciones:");

        lblDescripcion.setText("Descripcion del Plato");

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panPrincipalLayout.createSequentialGroup()
                                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDescripcion)
                                    .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNombre_Platillo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblId_Plato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panPrincipalLayout.createSequentialGroup()
                                        .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panPrincipalLayout.createSequentialGroup()
                                                .addComponent(txtNombrePlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblPorciones))
                                            .addGroup(panPrincipalLayout.createSequentialGroup()
                                                .addComponent(txtIdPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(91, 91, 91)
                                                .addComponent(lblPrecio_Plato)))
                                        .addGap(18, 18, 18)
                                        .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtttt)
                                            .addComponent(txtPorciones, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                                    .addComponent(txtDescripcion))))))
                .addGap(22, 22, 22))
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio_Plato)
                    .addComponent(txtttt)
                    .addComponent(lblId_Plato))
                .addGap(18, 18, 18)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombre_Platillo)
                    .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombrePlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPorciones))
                    .addComponent(txtPorciones))
                .addGap(39, 39, 39)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion))
                .addGap(57, 57, 57)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(panPrincipal, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombrePlatilloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePlatilloKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombrePlatilloKeyTyped

    private void txtIdPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPlatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPlatoActionPerformed

    private void txtNombrePlatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePlatilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePlatilloActionPerformed

    private void txttttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttttActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblId_Plato;
    private javax.swing.JLabel lblNombre_Platillo;
    private javax.swing.JLabel lblPorciones;
    private javax.swing.JLabel lblPrecio_Plato;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JScrollPane scpPrincipal;
    private javax.swing.JTable tblTurnoModificar;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdPlato;
    private javax.swing.JTextField txtNombrePlatillo;
    private javax.swing.JTextField txtPorciones;
    private javax.swing.JTextField txtttt;
    // End of variables declaration//GEN-END:variables
}
