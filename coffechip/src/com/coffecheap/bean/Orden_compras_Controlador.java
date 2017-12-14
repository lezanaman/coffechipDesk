package com.coffecheap.bean;

import com.coffecheap.dao.Orden_comprasDao;
import com.coffecheap.modelo.Orden_compras;
import com.coffecheap.vista.frmOrden_ComprasEliminar;
import com.coffecheap.vista.frmOrden_ComprasGuardar;
import com.coffecheap.vista.frmOrden_ComprasModificar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Orden_compras_Controlador implements ActionListener {

  frmOrden_ComprasGuardar vistaorden_compras = new frmOrden_ComprasGuardar();
  frmOrden_ComprasEliminar vistaorden_compraselim = new frmOrden_ComprasEliminar();
  frmOrden_ComprasModificar vistaorden_comprasmodi = new frmOrden_ComprasModificar();
  Orden_comprasDao orden_comprasdao = new Orden_comprasDao();
  Orden_compras orden_compras = new Orden_compras();
  JTable tblorden_compras;
  ResultSet rs;

  public Orden_compras_Controlador(frmOrden_ComprasGuardar vistaorden_compras, frmOrden_ComprasEliminar vistaeliminar, frmOrden_ComprasModificar vistamodi, Orden_ComprasDao orden_comprasdao) {
    this.vistaorden_compras = vistaorden_compras;
    this.vistaorden_compraselim = vistaeliminar;
    this.vistaorden_comprasmodi = vistamodi;
    this.orden_comprasdao = orden_comprasdao;
    this.vistaorden_comprasmodi.btnModificar.addActionListener(this);
    this.vistaorden_compraselim.btnEliminar.addActionListener(this);
    this.vistaorden_compras.btnGuardar.addActionListener(this);
  }

  public void Mostrar() {
    DefaultTableModel dfm = new DefaultTableModel();
    tblorden_compras = this.vistaorden_compraselim.tblOrden_ComprasEliminar;
    tblorden_compras.setModel(dfm);

    tblorden_compras = this.vistaorden_comprasmodi.tblOrden_ComprasModificar;
    tblorden_compras.setModel(dfm);

    dfm.setColumnIdentifiers(new Object[]{"No. Codigo", "Nombre"});

    try {
      rs = orden_comprasdao.listar();

      while (rs.next()) {
        dfm.addRow(new Object[]{rs.getInt(1), rs.getString(2)});
      }
    } catch (Exception ex) {
      System.out.println(ex);
    }
  }

  public void Guardar() {
    try {

      if (this.vistaorden_compras.txtIdOrdenComprasGuardar.getText().length() == 0) {
        JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
      } else {
        this.orden_compras.setId_orden_compras(Integer.parseInt(this.vistaorden_compras.txtIdOrdenComprasGuardar.getText()));
        this.orden_compras.setFecha_orden(this.vistaorden_compras.txtFechaOrdenGuardar.getDate());

        this.vistaorden_compras.txtIdOrdenComprasGuardar.setText(null);
        this.vistaorden_compras.txtFechaEntregaGuardar.setText(null);
        this.vistaorden_compras.txtFechaOrdenGuardar.setText(null);
        this.vistaorden_compras.txtCantidadOrdenGuardar.setText(null);

        String respuesta = orden_comprasdao.registrar(orden_compras);
        if (respuesta != null) {
          JOptionPane.showMessageDialog(null, respuesta);
          Limpiar();

        }
      }

    } catch (Exception e) {
      try {
        throw e;
      } catch (Exception ex) {
        Logger.getLogger(Orden_compras_Controlador.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

  public void ModificarD() {
    try {

      if (this.vistaorden_comprasmodi.txtNombreMod.getText().length() == 0 || this.vistaorden_comprasmodi.txtCodigoMod.getText().length() == 0) {
        JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
      } else {
        this.orden_compras.setId_estado(Integer.parseInt(this.vistaorden_comprasmodi.txtCodigoMod.getText()));
        this.orden_compras.setNombre(this.vistaorden_comprasmodi.txtNombreMod.getText());
        String respuesta = orden_comprasdao.modificar(orden_compras);
        if (respuesta != null) {
          JOptionPane.showMessageDialog(null, respuesta);
          Limpiar();

        }
      }

    } catch (Exception e) {
      try {
        throw e;
      } catch (Exception ex) {
        Logger.getLogger(Orden_compras_Controlador.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

  public void Eliminar() {

    try {

      if (this.vistaorden_compraselim.txtCodigoElimar.getText().length() == 0) {
        JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
      } else {
        this.orden_compras.setId_estado(Integer.parseInt(this.vistaorden_compraselim.txtCodigoElimar.getText()));
        String respuesta = orden_comprasdao.eliminar(orden_compras);
        if (respuesta != null) {
          JOptionPane.showMessageDialog(null, respuesta);
          Limpiar();

        }
      }
    } catch (Exception e) {
      try {
        throw e;
      } catch (Exception ex) {
        Logger.getLogger(Orden_compras_Controlador.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == vistaorden_compras.btnGuardar) {
      Guardar();
    }

    if (e.getSource() == vistaorden_compraselim.btnEliminar) {
      Eliminar();
      Mostrar();
    }

    if (e.getSource() == vistaorden_comprasmodi.btnModificar) {
      ModificarD();
      Mostrar();
    }

  }

  public void Limpiar() {
    this.vistaorden_compraselim.txtCodigoElimar.setText(null);

    this.vistaorden_compras.txtIdOrdenComprasGuardar.setText(null);
    this.vistaorden_compras.txtFechaEntregaGuardar.setText(null);
    this.vistaorden_compras.txtFechaOrdenGuardar.setText(null);
    this.vistaorden_compras.txtCantidadOrdenGuardar.setText(null);

    this.vistaorden_comprasmodi.txtCantidadOrdenGuardar.setText(null);
    this.vistaorden_comprasmodi.txtFechaEntregaGuardar.setText(null);
    this.vistaorden_comprasmodi.txtFechaOrdenGuardar.setText(null);
    this.vistaorden_comprasmodi.txtIdOrdenComprasGuardar.setText(null);

  }

}
