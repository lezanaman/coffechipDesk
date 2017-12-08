package com.coffecheap.bean;

import com.coffecheap.dao.CompraDao;
import com.coffecheap.dao.Dao;
import java.util.List;
import com.coffecheap.modelo.Compra;
import com.coffecheap.modelo.Producto;
import com.coffecheap.vista.frmCompraEliminar;
import com.coffecheap.vista.frmCompraGuardar;
import com.coffecheap.vista.frmCompraModificar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Compra_Controlador implements ActionListener {

    frmCompraGuardar vistaguardar = new frmCompraGuardar();
    frmCompraEliminar vistaeliminar = new frmCompraEliminar();
    frmCompraModificar vistamodificar = new frmCompraModificar();
    CompraDao dao = new CompraDao();
    Compra compra = new Compra();
    List<Compra> lista;
    ArrayList<Compra> intermedio = new ArrayList<Compra>();
    JTable table;
    int i;
    int producto;
    

    public Compra_Controlador(frmCompraGuardar vistaguardar, frmCompraEliminar vistaeliminar, frmCompraModificar vistamodificar, CompraDao dao) {
        this.vistaguardar = vistaguardar;
        this.vistamodificar = vistamodificar;
        this.vistaeliminar = vistaeliminar;
        this.dao = dao;

        this.vistaguardar.btnIntermediario.addActionListener(this);
        this.vistaguardar.btnIngresar.addActionListener(this);
    }

    public void intermedio() {

        if (this.vistaguardar.cmbNoOrden.getSelectedIndex() == 0 || this.vistaguardar.cmbProducto.getSelectedIndex() == 0 || this.vistaguardar.txtCantidad.getText().length() == 0 || this.vistaguardar.txtCosto.getText().length() == 0
                || this.vistaguardar.txtNoFactura.getText().length() == 0 || this.vistaguardar.txtSerie.getText().length() == 0 || this.vistaguardar.jdcFecha.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese Todos Los Campos Solicitados");
        } else {
            SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/yyyy");
            i = i + 1;
            String orden = (String) this.vistaguardar.cmbNoOrden.getSelectedItem();
            String producto = (String) this.vistaguardar.cmbProducto.getSelectedItem();
            compra.getOcompras().setId_orden_compras(Integer.parseInt(orden));
            compra.getProducto().setNombre(producto);
            compra.setCantidad(Integer.parseInt(this.vistaguardar.txtCantidad.getText()));
            compra.setCosto(Integer.parseInt(this.vistaguardar.txtCosto.getText()));
            compra.setNo_fac(Integer.parseInt(this.vistaguardar.txtNoFactura.getText()));
            compra.setSerie(this.vistaguardar.txtSerie.getText());
            //compra.setFechaEntrega(formatofecha.format(this.vistaguardar.jdcFecha.getDate()));
            intermedio.add(new Compra(true, i, compra.getOcompras().getId_orden_compras(), compra.getProducto().getNombre(),
                    compra.getCantidad(), compra.getCosto(), compra.getNo_fac(), compra.getSerie(), compra.getFechaEntrega()));
            Limpiar();
        }
    }

    public void Orden() {
        ResultSet rs;
        try {
            rs = this.dao.ListarOrdenCompras();
            this.vistaguardar.cmbNoOrden.removeAllItems();
            this.vistaguardar.cmbNoOrden.addItem("No. de Orden");
            while (rs.next()) {
                this.vistaguardar.cmbNoOrden.addItem(rs.getString("id_orden_compras"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void Producto() {
        ResultSet rs;
        try {
            rs = this.dao.ListarProducto();

            this.vistaguardar.cmbProducto.removeAllItems();
            this.vistaguardar.cmbProducto.addItem("Producto");
            while (rs.next()) {
                this.vistaguardar.cmbProducto.addItem(rs.getString("nombre_producto"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void Ingresar() {
        CompraDao dao;
        try {
            dao = new CompraDao();
            for (int j = 0; j < intermedio.size(); j++) {
                
                if (this.vistaguardar.tblIntermediario.getModel().getValueAt(j, 0).equals(true)) {
                    int orden = intermedio.get(j).getOcompras().getId_orden_compras();
                    int producto = intermedio.get(j).getProducto().getId_producto();
                    int cantidad = intermedio.get(j).getCantidad();
                    int costo = intermedio.get(j).getCosto();
                    int factura = intermedio.get(j).getNo_fac();
                    String serie = intermedio.get(j).getSerie();
                    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
                    System.out.println("viendo datos: " + intermedio.get(orden));
                   // String fecha = intermedio.get(j).getFechaEntrega();
                    //System.out.println("fecha: " + fecha);
                    //dao.Insertar(orden, producto, cantidad, costo, factura, serie, fecha);
                    int productointer = dao.Operacion(intermedio.get(j).getProducto().getId_producto());
                    int suma = productointer + cantidad;
                    dao.ActualizacionProductos(intermedio.get(j).getProducto().getId_producto(), suma);
                } 
            }

            //intermedio.clear();
        } catch (Exception e) {
            try {
                throw e;
            } catch (Exception ex) {
                Logger.getLogger(Compra_Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void Eliminar() throws Exception {

        CompraDao dao;

        try {
            dao = new CompraDao();
            dao.Eliminar(compra);
        } catch (Exception e) {
            throw e;
        }
    }

    public void Modificar() throws Exception {

        CompraDao dao;
        producto = compra.getProducto().getId_producto();
        try {
            dao = new CompraDao();
            dao.Modificar(compra);
            List<String> listado = new ArrayList();
            listado = dao.CodigodeProducto();
            for (int j = 0; j < listado.size(); j++) {
                int cantidad = dao.Cantidad(Integer.parseInt(listado.get(j)));
                dao.ActualizarCantidad(cantidad, Integer.parseInt(listado.get(j)));
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarTabla() {

        DefaultTableModel modelo = (DefaultTableModel) this.vistaguardar.tblIntermediario.getModel();
        try {
            Object[] fila = new Object[modelo.getColumnCount()];
            for (int j = 0; j < intermedio.size(); j++) {
                fila[0] = true;
                fila[1] = intermedio.get(j).getIdentificacion();
                fila[2] = intermedio.get(j).getOcompras().getId_orden_compras();
                fila[3] = intermedio.get(j).getProducto().getNombre();
                fila[4] = intermedio.get(j).getCantidad();
                fila[5] = intermedio.get(j).getCosto();
                fila[6] = intermedio.get(j).getNo_fac();
                fila[7] = intermedio.get(j).getSerie();
                fila[8] = intermedio.get(j).getFechaEntrega();
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    void limpiarTabla() {

        DefaultTableModel temp;
        try {
            temp = (DefaultTableModel) this.vistaguardar.tblIntermediario.getModel();

            for (int i = 0; i < temp.getColumnCount(); i++) {
                temp.removeRow(0);
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.vistaguardar.btnIntermediario) {
            intermedio();
            limpiarTabla();
            mostrarTabla();
        }
        if (e.getSource() == this.vistaguardar.btnIngresar) {
            Ingresar();
        }
    }

    public void Limpiar() {
        this.vistaguardar.txtCantidad.setText(null);
        this.vistaguardar.txtCosto.setText(null);
        this.vistaguardar.txtNoFactura.setText(null);
        this.vistaguardar.txtSerie.setText(null);
        this.vistaguardar.cmbNoOrden.setSelectedIndex(0);
        this.vistaguardar.cmbProducto.setSelectedIndex(0);
        this.vistaguardar.jdcFecha.setDate(null);
    }

}
