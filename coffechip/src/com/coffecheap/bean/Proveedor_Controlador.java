package com.coffecheap.bean;

import com.coffecheap.dao.ProveedorDao;
import com.coffecheap.modelo.Proveedor;
import com.coffecheap.vista.frmProveedorEliminar;
import com.coffecheap.vista.frmProveedorGuardar;
import com.coffecheap.vista.frmProveedorModificar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Proveedor_Controlador implements ActionListener {

    frmProveedorGuardar vistaguardar = new frmProveedorGuardar();
    frmProveedorModificar vistamodificar = new frmProveedorModificar();
    frmProveedorEliminar vistaeliminar = new frmProveedorEliminar();
    ProveedorDao dao = new ProveedorDao();
    Proveedor proveedor = new Proveedor();

    public Proveedor_Controlador(frmProveedorGuardar vistaguardar, frmProveedorModificar vistamodificar, frmProveedorEliminar vistaeliminar, ProveedorDao dao) {

        this.vistaguardar = vistaguardar;
        this.vistamodificar = vistamodificar;
        this.vistaeliminar = vistaeliminar;

        this.vistaguardar.btnGuardar.addActionListener(this);

    }

    public void Guardar() {

        if (this.vistaguardar.txtNombre.getText() == null || this.vistaguardar.txtNit.getText() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los parametros que se le solicitan");
        } else {
            try {
                proveedor.setNombre(this.vistaguardar.txtNombre.getText());
                proveedor.setNit(this.vistaguardar.txtNit.getText());
                proveedor.setTelefono(this.vistaguardar.txtTelefono.getText());
                proveedor.setMail(this.vistaguardar.txtEmail.getText());
                proveedor.setDireccion(this.vistaguardar.txtDireccion.getText());
                dao.Ingresar(proveedor);
                JOptionPane.showMessageDialog(null, "Ingresado Correctamente");
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
        
        /*if (e.getSource() == ) {
            
        }*/

    }

}
