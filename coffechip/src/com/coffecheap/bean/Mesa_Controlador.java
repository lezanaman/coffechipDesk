package com.coffecheap.bean;

import com.coffecheap.dao.Estado_mesaDao;
import com.coffecheap.modelo.Estado_mesa;
import com.coffecheap.vista.frmEstado_mesaEliminar;
import com.coffecheap.vista.frmEstado_mesaGuardar;
import com.coffecheap.vista.frmEstado_mesaModificar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Mesa_Controlador implements ActionListener {

  frmEstado_mesaGuardar vistaestado_mesa = new frmEstado_mesaGuardar();
  frmEstado_mesaEliminar vistaestado_mesaelim = new frmEstado_mesaEliminar();
  frmEstado_mesaModificar vistaestado_mesamodi = new frmEstado_mesaModificar();
  Estado_mesaDao estado_mesadao = new Estado_mesaDao();
  Estado_mesa estado_mesa = new Estado_mesa();
  JTable tblestado_mesa;
  ResultSet rs;

  public Mesa_Controlador(frmEstado_mesaGuardar vistaestado_mesa, frmEstado_mesaEliminar vistaeliminar, frmEstado_mesaModificar vistamodi, Estado_mesaDao estado_mesadao) {
    this.vistaestado_mesa = vistaestado_mesa;
    this.vistaestado_mesaelim = vistaeliminar;
    this.vistaestado_mesamodi = vistamodi;
    this.estado_mesadao = estado_mesadao;
    this.vistaestado_mesamodi.btnModificar.addActionListener(this);
    this.vistaestado_mesaelim.btnEliminar.addActionListener(this);
    this.vistaestado_mesa.btnGuardar.addActionListener(this);
  }

  public void Mostrar() {
    DefaultTableModel dfm = new DefaultTableModel();
    tblestado_mesa = this.vistaestado_mesaelim.tblEstado_mesaEliminar;
    tblestado_mesa.setModel(dfm);

    tblestado_mesa = this.vistaestado_mesamodi.tblEstado_mesaModificar;
    tblestado_mesa.setModel(dfm);

    dfm.setColumnIdentifiers(new Object[]{"No. Codigo", "Nombre"});

    try {
      rs = estado_mesadao.listar();

      while (rs.next()) {
        dfm.addRow(new Object[]{rs.getInt(1), rs.getString(2)});
      }
    } catch (Exception ex) {
      System.out.println(ex);
    }
  }

  public void Guardar() {
    try {

      if (this.vistaestado_mesa.txtNombreGuardar.getText().length() == 0) {
        JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
      } else {
        this.estado_mesa.setNombre(this.vistaestado_mesa.txtNombreGuardar.getText());

        String respuesta = estado_mesadao.registrar(estado_mesa);
        if (respuesta != null) {
          JOptionPane.showMessageDialog(null, respuesta);
          Limpiar();

        }
      }

    } catch (Exception e) {
      try {
        throw e;
      } catch (Exception ex) {
        Logger.getLogger(Mesa_Controlador.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

  public void ModificarD() {
    try {

      if (this.vistaestado_mesamodi.txtNombreMod.getText().length() == 0 || this.vistaestado_mesamodi.txtCodigoMod.getText().length() == 0) {
        JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
      } else {
        this.estado_mesa.setId_estado(Integer.parseInt(this.vistaestado_mesamodi.txtCodigoMod.getText()));
        this.estado_mesa.setNombre(this.vistaestado_mesamodi.txtNombreMod.getText());
        String respuesta = estado_mesadao.modificar(estado_mesa);
        if (respuesta != null) {
          JOptionPane.showMessageDialog(null, respuesta);
          Limpiar();

        }
      }

    } catch (Exception e) {
      try {
        throw e;
      } catch (Exception ex) {
        Logger.getLogger(Mesa_Controlador.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

  public void Eliminar() {

    try {

      if (this.vistaestado_mesaelim.txtCodigoElimar.getText().length() == 0) {
        JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
      } else {
        this.estado_mesa.setId_estado(Integer.parseInt(this.vistaestado_mesaelim.txtCodigoElimar.getText()));
        String respuesta = estado_mesadao.eliminar(estado_mesa);
        if (respuesta != null) {
          JOptionPane.showMessageDialog(null, respuesta);
          Limpiar();

        }
      }
    } catch (Exception e) {
      try {
        throw e;
      } catch (Exception ex) {
        Logger.getLogger(Mesa_Controlador.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == vistaestado_mesa.btnGuardar) {
      Guardar();
    }

    if (e.getSource() == vistaestado_mesaelim.btnEliminar) {
      Eliminar();
      Mostrar();
    }

    if (e.getSource() == vistaestado_mesamodi.btnModificar) {
      ModificarD();
      Mostrar();
    }

  }

  public void Limpiar() {
    this.vistaestado_mesaelim.txtCodigoElimar.setText(null);    
    
    this.vistaestado_mesa.txtNombreGuardar.setText(null);
      
    this.vistaestado_mesamodi.txtCodigoMod.setText(null);
    this.vistaestado_mesamodi.txtNombreMod.setText(null);
  }

}
