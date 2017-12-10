/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffecheap.bean;


import com.coffecheap.dao.Tipo_productoDao;
import com.coffecheap.dao.TurnoDao;
import com.coffecheap.modelo.Tipo_producto;
import com.coffecheap.vista.frmTipoProductoEliminar;
import com.coffecheap.vista.frmTipoProductoGuardar;
import com.coffecheap.vista.frmTipoProductoModificar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TipoProductoBean implements ActionListener {
 frmTipoProductoEliminar vistatipoproductelim = new frmTipoProductoEliminar();
 frmTipoProductoModificar vistatipoproductmodi= new frmTipoProductoModificar();
 frmTipoProductoGuardar vistatipoproduct= new frmTipoProductoGuardar();
  JTable tblturno;
    ResultSet rs;
   Tipo_producto tipo=new Tipo_producto();
    Tipo_productoDao dao=new Tipo_productoDao();
 
     public TipoProductoBean(frmTipoProductoEliminar vistaeliminar, Tipo_productoDao tidao, frmTipoProductoModificar vistamodificar,frmTipoProductoGuardar vistaproduct) {

        this.vistatipoproductelim = vistaeliminar;
        this.vistatipoproductmodi = vistamodificar;
        this.vistatipoproduct = vistaproduct;
        this.dao = tidao;
        this.vistatipoproductmodi.btnModificar.addActionListener(this);
        this.vistatipoproductelim.btnEliminar.addActionListener(this);
        this.vistatipoproduct.btnGuardar.addActionListener(this);
        
    }
      public void MostrarDM() {

        DefaultTableModel dfm = new DefaultTableModel();
        tblturno = this.vistatipoproductmodi.tblTurnoModificar;
        tblturno.setModel(dfm);

        dfm.setColumnIdentifiers(new Object[]{"Id Tipo", "Nombre Tipo"});

        try {
            rs = dao.listar();

            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("id_tipo"), rs.getString("nombre_tipo")});
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
       public void MostrarD() {
           

        DefaultTableModel dfm = new DefaultTableModel();
        tblturno = this.vistatipoproductelim.tblTurno;
        tblturno.setModel(dfm);

        dfm.setColumnIdentifiers(new Object[]{"Id Tipo Producto", "Tipo"});

        try {
            rs = dao.listar();

            while (rs.next()) {
                dfm.addRow(new Object[]{rs.getInt("id_tipo"), rs.getString("nombre_tipo")});
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
       
          public void Eliminar() {

        try {
            
            if (this.vistatipoproductelim.txtCodigo.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
            } else {
                this.tipo.setId_tipo(Integer.parseInt(this.vistatipoproductelim.txtCodigo.getText()));
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

            if (this.vistatipoproductmodi.txtnombretipo.getText().length() == 0 || this.vistatipoproductmodi.txtCodigoMod.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
            } else {
                this.tipo.setId_tipo(Integer.parseInt(this.vistatipoproductmodi.txtCodigoMod.getText()));
             
                this.tipo.setNombre(this.vistatipoproductmodi.txtnombretipo.getText());
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

            if (this.vistatipoproduct.txtObservaciones.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
            } else {
               
               this.tipo.setNombre(this.vistatipoproduct.txtObservaciones.getText());
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
        this.vistatipoproductelim.txtCodigo.setText(null);
        this.vistatipoproductmodi.txtCodigoMod.setText(null);
        this.vistatipoproductmodi.txtnombretipo.setText(null);
        
        
        this.vistatipoproduct.txtObservaciones.setText(null);
    }
       @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistatipoproduct.btnGuardar) {
            Guardar();
        }

        if (e.getSource() == vistatipoproductelim.btnEliminar) {
            Eliminar();
            MostrarD();
        }

        if (e.getSource() == vistatipoproductmodi.btnModificar) {
            ModificarD();
            MostrarDM();
        }

    }


}