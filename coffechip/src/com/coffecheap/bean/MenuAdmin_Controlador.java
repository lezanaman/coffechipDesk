package com.coffecheap.bean;

import com.coffecheap.dao.CompraDao;
import com.coffecheap.dao.ProveedorDao;
import com.coffecheap.dao.TurnoDao;
import com.coffecheap.vista.MenuAdmin;
import com.coffecheap.vista.frmCompraEliminar;
import com.coffecheap.vista.frmCompraGuardar;
import com.coffecheap.vista.frmCompraModificar;
import com.coffecheap.vista.frmProveedorEliminar;
import com.coffecheap.vista.frmProveedorGuardar;
import com.coffecheap.vista.frmProveedorModificar;
import com.coffecheap.vista.frmTurnoGuardar;
import com.coffecheap.vista.frmTurnoEliminar;
import com.coffecheap.vista.frmTurnoModificar;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class MenuAdmin_Controlador implements MouseListener {

    //MenuAdmin vistamenu = new MenuAdmin();
    MenuAdmin vistamenu = new MenuAdmin();

    public MenuAdmin_Controlador(MenuAdmin menuadmindos) {
        vistamenu = menuadmindos;

        vistamenu.btnTurnoGuardar.addMouseListener(this);
        vistamenu.lblTurnoGuardar.addMouseListener(this);
        vistamenu.btnTurnoEliminar.addMouseListener(this);
        vistamenu.lblTurnoEliminar.addMouseListener(this);
        vistamenu.btnTurnoModificar.addMouseListener(this);
        vistamenu.lblTurnoModificar.addMouseListener(this);

        vistamenu.btnCompraGuardar.addMouseListener(this);
        vistamenu.lblCompraGuardar.addMouseListener(this);
        vistamenu.btnCompraEliminar.addMouseListener(this);
        vistamenu.lblCompraEliminar.addMouseListener(this);
        vistamenu.btnCompraModificar.addMouseListener(this);
        vistamenu.lblCompraModificar.addMouseListener(this);

        vistamenu.btnProveedorGuardar.addMouseListener(this);
        vistamenu.btnProveedorEliminar.addMouseListener(this);
        vistamenu.btnProveedorModificar.addMouseListener(this);
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(66, 83, 111));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(37, 47, 65));
    }

    public void Limpiar() {
        resetColor(vistamenu.btnTurnoGuardar);
        resetColor(vistamenu.btnTurnoModificar);
        resetColor(vistamenu.btnTurnoEliminar);

        resetColor(vistamenu.btnCompraEliminar);
        resetColor(vistamenu.btnCompraModificar);
        resetColor(vistamenu.btnCompraGuardar);

        resetColor(vistamenu.btnClienteModificar);
        resetColor(vistamenu.btnClienteEliminar);
        resetColor(vistamenu.btnClienteGuardar);

        resetColor(vistamenu.btnUsuarioGuardar);
        resetColor(vistamenu.btnUsuarioEliminar);
        resetColor(vistamenu.btnUsuarioModificar);

        resetColor(vistamenu.btnEstadoMesaGuardar);
        resetColor(vistamenu.btnEstadoMesaEliminar);
        resetColor(vistamenu.btnEstadoMesaModificar);

        resetColor(vistamenu.btnProveedorGuardar);
        resetColor(vistamenu.btnProveedorEliminar);
        resetColor(vistamenu.btnProveedorModificar);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == vistamenu.btnTurnoGuardar || e.getSource() == vistamenu.lblTurnoGuardar) {

            this.Limpiar();
            setColor(vistamenu.btnTurnoGuardar);
            TurnoDao dao = new TurnoDao();
            frmTurnoGuardar vistaturno = new frmTurnoGuardar();
            frmTurnoEliminar vistaturnodos = new frmTurnoEliminar();
            frmTurnoModificar vistamodi = new frmTurnoModificar();
            Turno_Controlador controlador = new Turno_Controlador(vistaturno, vistaturnodos, vistamodi, dao);
            new CambiaPanel(this.vistamenu.panDatos, vistaturno);
        }
        if (e.getSource() == vistamenu.btnTurnoEliminar || e.getSource() == vistamenu.lblTurnoEliminar) {
            
            this.Limpiar();
            setColor(vistamenu.btnTurnoEliminar);
            TurnoDao dao = new TurnoDao();
            frmTurnoGuardar vistaturno = new frmTurnoGuardar();
            frmTurnoEliminar vistaturnodos = new frmTurnoEliminar();
            frmTurnoModificar vistamodi = new frmTurnoModificar();
            Turno_Controlador controlador = new Turno_Controlador(vistaturno, vistaturnodos, vistamodi, dao);
            controlador.MostrarD();
            new CambiaPanel(this.vistamenu.panDatos, vistaturnodos);
        }
        if (e.getSource() == vistamenu.btnTurnoModificar || e.getSource() == vistamenu.lblTurnoModificar) {
            this.Limpiar();
            setColor(vistamenu.btnTurnoModificar);

            TurnoDao dao = new TurnoDao();
            frmTurnoGuardar vistaturno = new frmTurnoGuardar();
            frmTurnoEliminar vistaturnodos = new frmTurnoEliminar();
            frmTurnoModificar vistamodi = new frmTurnoModificar();
            Turno_Controlador controlador = new Turno_Controlador(vistaturno, vistaturnodos, vistamodi, dao);
            controlador.MostrarDM();
            new CambiaPanel(this.vistamenu.panDatos, vistamodi);
        }

        if (e.getSource() == vistamenu.btnProveedorGuardar || e.getSource() == vistamenu.lblProveedorGuardar) {
            this.Limpiar();
            setColor(vistamenu.btnProveedorGuardar);
            ProveedorDao dao = new ProveedorDao();
            frmProveedorGuardar vistaguardar = new frmProveedorGuardar();
            frmProveedorEliminar vistaeliminar = new frmProveedorEliminar();
            frmProveedorModificar vistamodificar = new frmProveedorModificar();
            Proveedor_Controlador controlador = new Proveedor_Controlador(vistaguardar, vistamodificar, vistaeliminar, dao);
            new CambiaPanel(this.vistamenu.panDatos, vistaguardar);

        }

        if (e.getSource() == vistamenu.btnProveedorEliminar || e.getSource() == vistamenu.lblProveedorEliminar) {
            this.Limpiar();
            setColor(vistamenu.btnProveedorEliminar);
            

            ProveedorDao dao = new ProveedorDao();
            frmProveedorGuardar vistaguardar = new frmProveedorGuardar();
            frmProveedorEliminar vistaeliminar = new frmProveedorEliminar();
            frmProveedorModificar vistamodificar = new frmProveedorModificar();
            Proveedor_Controlador controlador = new Proveedor_Controlador(vistaguardar, vistamodificar, vistaeliminar, dao);
            controlador.MostrarE();
            new CambiaPanel(this.vistamenu.panDatos, vistaeliminar);
        }

        if (e.getSource() == vistamenu.btnProveedorModificar || e.getSource() == vistamenu.lblProveedorModificar) {
            
            this.Limpiar();
            setColor(vistamenu.btnProveedorModificar);


            ProveedorDao dao = new ProveedorDao();
            frmProveedorGuardar vistaguardar = new frmProveedorGuardar();
            frmProveedorEliminar vistaeliminar = new frmProveedorEliminar();
            frmProveedorModificar vistamodificar = new frmProveedorModificar();
            Proveedor_Controlador controlador = new Proveedor_Controlador(vistaguardar, vistamodificar, vistaeliminar, dao);
            controlador.MostrarM();
            new CambiaPanel(this.vistamenu.panDatos, vistamodificar);
        }
        
        if (e.getSource() == vistamenu.btnCompraGuardar || e.getSource() == vistamenu.lblCompraGuardar) {
            this.Limpiar();
            setColor(vistamenu.btnCompraGuardar);
            frmCompraGuardar vistaguardar = new frmCompraGuardar();
            frmCompraModificar vistamodificar = new frmCompraModificar();
            frmCompraEliminar vistaeliminar = new frmCompraEliminar();
            CompraDao dao = new CompraDao();
            Compra_Controlador controlador = new Compra_Controlador(vistaguardar, vistaeliminar, vistamodificar, dao);
            controlador.Orden();
            controlador.Producto();
            new CambiaPanel(this.vistamenu.panDatos, vistaguardar);
            
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
