package com.coffecheap.bean;

import com.coffecheap.dao.ProveedorDao;
import com.coffecheap.modelo.Proveedor;
import com.coffecheap.vista.frmProveedorEliminar;
import com.coffecheap.vista.frmProveedorGuardar;
import com.coffecheap.vista.frmProveedorModificar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Proveedor_Controlador implements ActionListener {

    frmProveedorGuardar vistaguardar = new frmProveedorGuardar();
    frmProveedorModificar vistamodificar = new frmProveedorModificar();
    frmProveedorEliminar vistaeliminar = new frmProveedorEliminar();
    ProveedorDao dao = new ProveedorDao();
    Proveedor proveedor = new Proveedor();
    JTable table;
    ResultSet rs;

    public Proveedor_Controlador(frmProveedorGuardar vistaguardar, frmProveedorModificar vistamodificar, frmProveedorEliminar vistaeliminar, ProveedorDao dao) {

        this.vistaguardar = vistaguardar;
        this.vistamodificar = vistamodificar;
        this.vistaeliminar = vistaeliminar;

        this.vistaguardar.btnGuardar.addActionListener(this);
        this.vistaeliminar.btnEliminar.addActionListener(this);
        this.vistamodificar.btnModificar.addActionListener(this);
    }

    public void Guardar() {

        if (this.vistaguardar.txtNombre.getText() == null || this.vistaguardar.txtNit.getText() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
        } else {
            try {
                proveedor.setNombre(this.vistaguardar.txtNombre.getText());
                proveedor.setNit(this.vistaguardar.txtNit.getText());
                proveedor.setTelefono(Integer.parseInt(this.vistaguardar.txtTelefono.getText()));
                proveedor.setMail(this.vistaguardar.txtEmail.getText());
                proveedor.setDireccion(this.vistaguardar.txtDireccion.getText());
                dao.Ingresar(proveedor);
                Limpiar();
                JOptionPane.showMessageDialog(null, "Ingresado Correctamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public void Eliminar() {
        if (this.vistaeliminar.txtCodigo.getText() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese su Codigo");
        } else {
            try {
                proveedor.setId_proveedor(Integer.parseInt(this.vistaeliminar.txtCodigo.getText()));
                dao.Borrar(proveedor);
                Limpiar();
                JOptionPane.showMessageDialog(null, "Eliminado Correctamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public void MostrarE() {
        DefaultTableModel modelo = new DefaultTableModel();
        table = this.vistaeliminar.tblEliminar;
        table.setModel(modelo);
        modelo.setColumnIdentifiers(new Object[]{"Id Proveedor", "Nombre", "Nit", "Telefono", "Email", "Direccion"});

        try {
            rs = dao.Mostrar();
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getInt("id_proveedor"), rs.getString("nombre_proveedor"), rs.getString("nit_proveedor"), rs.getInt("telefono_proveedor"), rs.getString("email_proveedor"), rs.getString("direccion_proveedor")});
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void MostrarM() {
        DefaultTableModel modelo = new DefaultTableModel();

        table = this.vistamodificar.tblModificar;
        table.setModel(modelo);

        modelo.setColumnIdentifiers(new Object[]{"Id Proveedor", "Nombre", "Nit", "Telefono", "Email", "Direccion"});

        try {
            rs = dao.Mostrar();
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getInt("id_proveedor"), rs.getString("nombre_proveedor"), rs.getString("nit_proveedor"), rs.getInt("telefono_proveedor"), rs.getString("email_proveedor"), rs.getString("direccion_proveedor")});
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void Modificar() {
        if (this.vistamodificar.txtNombre.getText() == null || this.vistamodificar.txtNit.getText() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
        } else {
            try {
                if (this.vistamodificar.txtTelefono.getText().equals("        ")) {
                    proveedor.setId_proveedor(Integer.parseInt(this.vistamodificar.txtCodigo.getText()));
                    proveedor.setNombre(this.vistamodificar.txtNombre.getText());
                    proveedor.setNit(this.vistamodificar.txtNit.getText());
                    proveedor.setTelefono(0);
                    proveedor.setMail(this.vistamodificar.txtEmail.getText());
                    proveedor.setDireccion(this.vistamodificar.txtDireccion.getText());
                    dao.Editar(proveedor);
                    Limpiar();
                    JOptionPane.showMessageDialog(null, "Modificado Correctamente");
                } else {
                    proveedor.setId_proveedor(Integer.parseInt(this.vistamodificar.txtCodigo.getText()));
                    proveedor.setNombre(this.vistamodificar.txtNombre.getText());
                    proveedor.setNit(this.vistamodificar.txtNit.getText());
                    proveedor.setTelefono(Integer.parseInt(this.vistamodificar.txtTelefono.getText()));
                    proveedor.setMail(this.vistamodificar.txtEmail.getText());
                    proveedor.setDireccion(this.vistamodificar.txtDireccion.getText());
                    dao.Editar(proveedor);
                    Limpiar();
                    JOptionPane.showMessageDialog(null, "Modificado Correctamente");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaguardar.btnGuardar) {
            Guardar();
        }

        if (e.getSource() == vistaeliminar.btnEliminar) {
            Eliminar();
            MostrarE();
        }
        if (e.getSource() == vistamodificar.btnModificar) {
            Modificar();
            MostrarM();
        }
    }

    public void Limpiar() {
        this.vistaeliminar.txtCodigo.setText(null);
        this.vistaguardar.txtDireccion.setText(null);
        this.vistaguardar.txtEmail.setText(null);
        this.vistaguardar.txtNombre.setText(null);
        this.vistaguardar.txtTelefono.setText(null);
        this.vistaguardar.txtNit.setText(null);
        this.vistamodificar.txtCodigo.setText(null);
        this.vistamodificar.txtDireccion.setText(null);
        this.vistamodificar.txtEmail.setText(null);
        this.vistamodificar.txtNombre.setText(null);
        this.vistamodificar.txtTelefono.setText(null);
        this.vistamodificar.txtNit.setText(null);
    }

}
