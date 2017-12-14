/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffecheap.bean;

import com.coffecheap.dao.PlatoDao;
import com.coffecheap.modelo.Plato;
import com.coffecheap.vista.frmPlatoEliminar;
import com.coffecheap.vista.frmPlatoGuardar;
import com.coffecheap.vista.frmPlatoModificar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javam
 */
public class Plato_Controlador implements ActionListener {

    frmPlatoEliminar vistaplatoeliminar = new frmPlatoEliminar();
    frmPlatoGuardar vistaplatoguardar = new frmPlatoGuardar();
    frmPlatoModificar vistaplatomodificar = new frmPlatoModificar();
    PlatoDao platodao = new PlatoDao();
    Plato plato = new Plato();
    JTable tblPlato;
    ResultSet rs;

    public Plato_Controlador(frmPlatoEliminar vistaplatoeliminar, frmPlatoGuardar vistaplatoguardar,frmPlatoModificar vistaplatomodificar,PlatoDao platodao) {
        this.vistaplatoeliminar = vistaplatoeliminar;
        this.vistaplatoguardar = vistaplatoguardar;
        this.vistaplatomodificar = vistaplatomodificar;
        this.platodao = platodao;
        this.vistaplatoeliminar.btnEliminar.addActionListener(this);
        this.vistaplatoguardar.btnGuardar.addActionListener(this);
        this.vistaplatomodificar.btnModificar.addActionListener(this);
       
    }

    public void MostrarEliminar() {

        DefaultTableModel dfm = new DefaultTableModel();
        tblPlato = this.vistaplatoeliminar.tblPlato;
        tblPlato.setModel(dfm);

        dfm.setColumnIdentifiers(new Object[]{"Id del Plato", "Nombre del Platillo", "Precio0", "Porciones", "Descripcion"});

        try {
            rs = (ResultSet) platodao.listar();

            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("id_plato"), rs.getString("nombre_platillo"), rs.getDouble("precio_plato"),rs.getInt("porciones"),rs.getString("descripcion_plato")});
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public void MostrarModificar() {

        DefaultTableModel dfm = new DefaultTableModel();
        tblPlato = this.vistaplatomodificar.tblPlato;
        tblPlato.setModel(dfm);

        dfm.setColumnIdentifiers(new Object[]{"Id del Plato", "Nombre del Platillo", "Precio0", "Porciones", "Descripcion"});

        try {
            rs = (ResultSet) platodao.listar();

            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("id_plato"), rs.getString("nombre_platillo"), rs.getDouble("precio_plato"),rs.getInt("porciones"),rs.getString("descripcion_plato")});
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public void Guardar() {

        try {

                this.plato.setId_plato(Integer.parseInt(this.vistaplatoguardar.txtIdPlato.getText()));
                this.plato.setNombre(this.vistaplatoguardar.txtNombrePlatillo.getText());
                this.plato.setPrecio(Double.parseDouble(this.vistaplatoguardar.txtPrecio.getText()));
                this.plato.setPorciones(Integer.parseInt(this.vistaplatoguardar.txtPorciones.getText()));
                this.plato.setDescripcion(this.vistaplatoguardar.txtDescripcion.getText());
                
                String respuesta = platodao.registrar(plato);
                if (respuesta != null) {
                    JOptionPane.showMessageDialog(null, respuesta);
                    //Limpiar();

                }
            

        } catch (Exception e) {
            try {
                throw e;
            } catch (Exception ex) {
                Logger.getLogger(Turno_Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }
    
    
        public void ModificarD() {
        try {

            
                this.turno.setId_turno(Integer.parseInt(this.vistaturnomodi.txtCodigoMod.getText()));
                this.turno.setHorario_turno(this.vistaturnomodi.txtHorarioMod.getText());
                this.turno.setObservaciones(this.vistaturnomodi.txtObservacionesMod.getText());
                String respuesta = turnodao.Modificar(turno);
                if (respuesta != null) {
                    JOptionPane.showMessageDialog(null, respuesta);
                    Limpiar();

                }
            }

        } catch (Exception e) {
            try {
                throw e;
            } catch (Exception ex) {
                Logger.getLogger(Turno_Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
