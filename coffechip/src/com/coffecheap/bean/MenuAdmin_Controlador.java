package com.coffecheap.bean;

import com.coffecheap.dao.TurnoDao;
import com.coffecheap.vista.MenuAdmin;
import com.coffecheap.vista.frmTurnoGuardar;
import com.coffecheap.vista.frmTurnoEliminar;
import com.coffecheap.vista.frmTurnoModificar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAdmin_Controlador implements ActionListener {

    MenuAdmin vistamenu = new MenuAdmin();

    public MenuAdmin_Controlador(MenuAdmin menu) {
        this.vistamenu = menu;

        //Turno
        this.vistamenu.btnTurno.setActionCommand("Turno");
        this.vistamenu.btnTurno.addActionListener(this);
        this.vistamenu.btnGuardarTurno.setActionCommand("GuardarTurno");
        this.vistamenu.btnGuardarTurno.addActionListener(this);
        this.vistamenu.btnEliminarTurno.setActionCommand("EliminarTurno");
        this.vistamenu.btnEliminarTurno.addActionListener(this);
        this.vistamenu.btnModificarTurno.setActionCommand("ModificarTurno");
        this.vistamenu.btnModificarTurno.addActionListener(this);
        
        //Proveedor
        this.vistamenu.btnProveedor.setActionCommand("Proveedor");
        this.vistamenu.btnProveedor.addActionListener(this);
        this.vistamenu.btnGuardarProveedor.setActionCommand("GuardarProveedor");
        this.vistamenu.btnGuardarProveedor.addActionListener(this);
        this.vistamenu.btnEliminarProveedor.setActionCommand("EliminarProveedor");
        this.vistamenu.btnEliminarProveedor.addActionListener(this);
        this.vistamenu.btnModificarProveedor.setActionCommand("ModificarProveedor");
        this.vistamenu.btnModificarProveedor.addActionListener(this);
        
        //Compra
        this.vistamenu.btnCompra.setActionCommand("Compra");
        this.vistamenu.btnCompra.addActionListener(this);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String evento = e.getActionCommand();

        if (evento.equals("Compra")) {
            if (this.vistamenu.btnCompra.requestFocusInWindow() == false) {
                if (this.vistamenu.panTurno.requestFocusInWindow() == true || this.vistamenu.panProveedor.requestFocusInWindow() == true) {
                    this.vistamenu.panTurno.setVisible(false);
                    this.vistamenu.panProveedor.setVisible(false);
                    this.vistamenu.panCompra.setVisible(true);
                    this.vistamenu.panCompra.setLocation(250, 310);
                } else {
                    this.vistamenu.panCompra.setVisible(true);
                    this.vistamenu.panCompra.setLocation(250, 310);
                }
            } else {
                this.vistamenu.btnCompra.setVisible(false);
            }
        }

        if (evento.equals("Proveedor")) {
            if (this.vistamenu.panProveedor.requestFocusInWindow() == false) {
                if (this.vistamenu.panTurno.requestFocusInWindow() == true || this.vistamenu.btnCompra.requestFocusInWindow() == true) {
                    this.vistamenu.panTurno.setVisible(false);
                    this.vistamenu.panCompra.setVisible(false);
                    this.vistamenu.panProveedor.setVisible(true);
                    this.vistamenu.panProveedor.setLocation(250, 260);
                } else {
                    this.vistamenu.panProveedor.setVisible(true);
                    this.vistamenu.panProveedor.setLocation(250, 260);
                }
            } else {
                this.vistamenu.panProveedor.setVisible(false);
            }
        }

        if (evento.equals("Turno")) {
            if (this.vistamenu.panTurno.requestFocusInWindow() == false) {

                if (this.vistamenu.panProveedor.requestFocusInWindow() == true || this.vistamenu.panCompra.requestFocusInWindow() == true) {
                    this.vistamenu.panProveedor.setVisible(false);
                    this.vistamenu.panCompra.setVisible(false);
                    this.vistamenu.panTurno.setVisible(true);
                    this.vistamenu.panTurno.setLocation(250, 210);
                } else {
                    this.vistamenu.panTurno.setVisible(true);
                    this.vistamenu.panTurno.setLocation(250, 210);
                }
            } else {
                this.vistamenu.panTurno.setVisible(false);
            }
        }

        if (evento.equals("GuardarTurno")) {
            TurnoDao dao = new TurnoDao();
            frmTurnoGuardar vistaturno = new frmTurnoGuardar();
            frmTurnoEliminar vistaturnodos = new frmTurnoEliminar();
            frmTurnoModificar vistamodi = new frmTurnoModificar();
            Turno_Controlador controlador = new Turno_Controlador(vistaturno, vistaturnodos, vistamodi, dao);
            new CambiaPanel(this.vistamenu.panDatos, vistaturno);
            this.vistamenu.panTurno.setVisible(false);
        }
        if (evento.equals("EliminarTurno")) {
            TurnoDao dao = new TurnoDao();
            frmTurnoGuardar vistaturno = new frmTurnoGuardar();
            frmTurnoEliminar vistaturnodos = new frmTurnoEliminar();
            frmTurnoModificar vistamodi = new frmTurnoModificar();
            Turno_Controlador controlador = new Turno_Controlador(vistaturno, vistaturnodos, vistamodi, dao);
            controlador.MostrarD();
            new CambiaPanel(this.vistamenu.panDatos, vistaturnodos);
            this.vistamenu.panTurno.setVisible(false);
        }

        if (evento.equals("ModificarTurno")) {
            TurnoDao dao = new TurnoDao();
            frmTurnoGuardar vistaturno = new frmTurnoGuardar();
            frmTurnoEliminar vistaturnodos = new frmTurnoEliminar();
            frmTurnoModificar vistamodi = new frmTurnoModificar();
            Turno_Controlador controlador = new Turno_Controlador(vistaturno, vistaturnodos, vistamodi, dao);
            controlador.MostrarDM();
            new CambiaPanel(this.vistamenu.panDatos, vistamodi);
            this.vistamenu.panTurno.setVisible(false);
        }
    }

}
