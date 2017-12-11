/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffecheap.bean;


import com.coffecheap.dao.Tipo_productoDao;
import com.coffecheap.dao.Tipo_transaccionesDao;

import com.coffecheap.modelo.Tipo_producto;
import com.coffecheap.modelo.Tipo_transacciones;

import com.coffecheap.vista.frmTipoTransaccionEliminar;
import com.coffecheap.vista.frmTipoTransaccionGuardar;
import com.coffecheap.vista.frmTipoTransaccionModificar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TipoTransaccionBean implements ActionListener {
 frmTipoTransaccionEliminar vistatipotranselim = new frmTipoTransaccionEliminar();
 frmTipoTransaccionModificar vistatipotransmodi= new frmTipoTransaccionModificar();
 frmTipoTransaccionGuardar vistatipotrans= new frmTipoTransaccionGuardar();
  JTable tblturno;
    ResultSet rs;
   Tipo_transacciones tipo=new Tipo_transacciones();
    Tipo_transaccionesDao dao=new Tipo_transaccionesDao();
 
     public TipoTransaccionBean(frmTipoTransaccionEliminar vistaeliminar, Tipo_transaccionesDao tidao, frmTipoTransaccionModificar vistamodificar,frmTipoTransaccionGuardar vistaguardar) {

        this.vistatipotranselim = vistaeliminar;
        this.vistatipotransmodi = vistamodificar;
        this.vistatipotrans = vistaguardar;
        this.dao = tidao;
        this.vistatipotransmodi.btnModificar.addActionListener(this);
        this.vistatipotranselim.btnEliminar.addActionListener(this);
        this.vistatipotrans.btnGuardar.addActionListener(this);
        
    }
      public void MostrarDM() {

        DefaultTableModel dfm = new DefaultTableModel();
        tblturno = this.vistatipotransmodi.tblTurnoModificar;
        tblturno.setModel(dfm);

        dfm.setColumnIdentifiers(new Object[]{"Id Tipo", "Nombre Tipo"});

        try {
            rs = dao.listar();

            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("id_tipo_transacciones"), rs.getString("nombre_transaccion")});
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
       public void MostrarD() {
           

        DefaultTableModel dfm = new DefaultTableModel();
        tblturno = this.vistatipotranselim.tblTurno;
        tblturno.setModel(dfm);

        dfm.setColumnIdentifiers(new Object[]{"Id Tipo Transaccion", "Nombre Tipo"});

        try {
            rs = dao.listar();

            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("id_tipo_transacciones"), rs.getString("nombre_transaccion")});
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
       
          public void Eliminar() {

        try {
            
            if (this.vistatipotranselim.txtCodigo.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
            } else {
                this.tipo.setId_tipo_transacciones(Integer.parseInt(this.vistatipotranselim.txtCodigo.getText()));
                String respuesta = dao.eliminar(tipo);
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
          
          public void ModificarD() {
        try {

            if (this.vistatipotransmodi.txtnombretipo.getText().length() == 0 || this.vistatipotransmodi.txtCodigoMod.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
            } else {
                this.tipo.setId_tipo_transacciones(Integer.parseInt(this.vistatipotransmodi.txtCodigoMod.getText()));
             
                this.tipo.setNombre(this.vistatipotransmodi.txtnombretipo.getText());
                String respuesta = dao.modificar(tipo);
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
 public void Guardar() {

        try {

            if (this.vistatipotrans.txtObservaciones.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
            } else {
               
               this.tipo.setNombre(this.vistatipotrans.txtObservaciones.getText());
                String respuesta = dao.registrar(tipo);
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
          
             public void Limpiar() {
        this.vistatipotranselim.txtCodigo.setText(null);
        this.vistatipotransmodi.txtCodigoMod.setText(null);
        this.vistatipotransmodi.txtnombretipo.setText(null);
        
        
        this.vistatipotrans.txtObservaciones.setText(null);
    }
       @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistatipotrans.btnGuardar) {
            Guardar();
        }

        if (e.getSource() == vistatipotranselim.btnEliminar) {
            Eliminar();
            MostrarD();
        }

        if (e.getSource() == vistatipotransmodi.btnModificar) {
            ModificarD();
            MostrarDM();
        }

    }


}