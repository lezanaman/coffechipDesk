package com.coffecheap.bean;

import com.coffecheap.dao.CompraDao;
import com.coffecheap.dao.ProveedorDao;
import com.coffecheap.dao.Tipo_productoDao;
import com.coffecheap.dao.TurnoDao;
import com.coffecheap.vista.MenuAdmin;
import com.coffecheap.vista.frmCompraEliminar;
import com.coffecheap.vista.frmCompraGuardar;
import com.coffecheap.vista.frmCompraModificar;
import com.coffecheap.vista.frmProveedorEliminar;
import com.coffecheap.vista.frmProveedorGuardar;
import com.coffecheap.vista.frmProveedorModificar;
import com.coffecheap.vista.frmTipoProductoEliminar;
import com.coffecheap.vista.frmTipoProductoGuardar;
import com.coffecheap.vista.frmTipoProductoModificar;
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
        vistamenu.btnTurnoEliminar.addMouseListener(this);
        vistamenu.btnTurnoModificar.addMouseListener(this);

        vistamenu.btnCompraGuardar.addMouseListener(this);

        vistamenu.btnProveedorGuardar.addMouseListener(this);
        vistamenu.btnProveedorEliminar.addMouseListener(this);
        vistamenu.btnProveedorModificar.addMouseListener(this);
        
        vistamenu.btnClienteEliminar.addMouseListener(this);
        vistamenu.btnClienteGuardar.addMouseListener(this);
        vistamenu.btnClienteModificar.addMouseListener(this);
        
        vistamenu.btnProductoEliminar.addMouseListener(this);
        vistamenu.btnProductoModificar.addMouseListener(this);
        vistamenu.btnProveedorGuardar.addMouseListener(this);
        
        vistamenu.btnPlatoGuardar.addMouseListener(this);
        vistamenu.btnPlatoEliminar.addMouseListener(this);
        vistamenu.btnPlatoModificar.addMouseListener(this);
        
        vistamenu.btnTipoProductoEliminar.addMouseListener(this);
        vistamenu.btnTipoProductoGuardar.addMouseListener(this);
        vistamenu.btnTipoProductoModificar.addMouseListener(this);        
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

        resetColor(vistamenu.btnCompraGuardar);

        resetColor(vistamenu.btnProveedorGuardar);
        resetColor(vistamenu.btnProveedorEliminar);
        resetColor(vistamenu.btnProveedorModificar);
        
        resetColor(vistamenu.btnClienteModificar);
        resetColor(vistamenu.btnClienteEliminar);
        resetColor(vistamenu.btnClienteGuardar);        
        
        resetColor(vistamenu.btnProductoGuardar);
        resetColor(vistamenu.btnProductoEliminar);
        resetColor(vistamenu.btnProductoModificar);
        
        resetColor(vistamenu.btnPlatoGuardar);
        resetColor(vistamenu.btnPlatoEliminar);
        resetColor(vistamenu.btnPlatoModificar);        
        
        resetColor(vistamenu.btnTipoProductoEliminar);
        resetColor(vistamenu.btnTipoProductoGuardar);
        resetColor(vistamenu.btnTipoProductoModificar);
        
        resetColor(vistamenu.btnOrdenGuardar);
        resetColor(vistamenu.btnOrdenEliminar);
        resetColor(vistamenu.btnOrdenModificar);
        
        resetColor(vistamenu.btnRecetaGuardar);
        resetColor(vistamenu.btnRecetaEliminar);
        resetColor(vistamenu.btnRecetaModificar);
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        //Aqui va todoso los if de TIPO PRODUCTO
        if (e.getSource() == vistamenu.btnTipoProductoGuardar || e.getSource() == vistamenu.lblTipoProductoGuardar) {
            this.Limpiar();
            setColor(vistamenu.btnTipoProductoGuardar);
            frmTipoProductoGuardar frm = new frmTipoProductoGuardar();
            frmTipoProductoModificar frm2 = new frmTipoProductoModificar();
            frmTipoProductoEliminar frm3 = new frmTipoProductoEliminar();
            Tipo_productoDao dao = new Tipo_productoDao();
            TipoProductoBean cons = new TipoProductoBean(frm3, dao, frm2, frm);
            new CambiaPanel(this.vistamenu.panDatos, frm);
        }

        if (e.getSource() == vistamenu.btnTipoProductoModificar || e.getSource() == vistamenu.lblTipoProductoModificar) {
            this.Limpiar();
            setColor(vistamenu.btnTipoProductoModificar);
            frmTipoProductoGuardar frm = new frmTipoProductoGuardar();
            frmTipoProductoModificar frm2 = new frmTipoProductoModificar();
            frmTipoProductoEliminar frm3 = new frmTipoProductoEliminar();
            Tipo_productoDao dao = new Tipo_productoDao();
            TipoProductoBean cons = new TipoProductoBean(frm3, dao, frm2, frm);
            cons.MostrarDM();
            new CambiaPanel(this.vistamenu.panDatos, frm2);
        }

        if (e.getSource() == vistamenu.btnTipoProductoEliminar || e.getSource() == vistamenu.lblTipoProductoEliminar) {
            this.Limpiar();
            setColor(vistamenu.btnTipoProductoEliminar);
            frmTipoProductoGuardar frm = new frmTipoProductoGuardar();
            frmTipoProductoModificar frm2 = new frmTipoProductoModificar();
            frmTipoProductoEliminar frm3 = new frmTipoProductoEliminar();
            Tipo_productoDao dao = new Tipo_productoDao();
            TipoProductoBean cons = new TipoProductoBean(frm3, dao, frm2, frm);
            cons.MostrarD();
            new CambiaPanel(this.vistamenu.panDatos, frm3);
        }

        
        //Aqui va todos los if de TURNO
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

        
        //Aqui estan todos los if de PROVEEDOR
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

        
        // Aqui va el if de COMPRA
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
        
        
        //Aqui va todos los if de CLIENTE
        if (e.getSource() == vistamenu.btnClienteEliminar || e.getSource() == vistamenu.lblClienteEliminar) {
            
        }
        
        if (e.getSource() == vistamenu.btnClienteGuardar || e.getSource() == vistamenu.lblClienteGuardar) {
            
        }
        
        if (e.getSource() == vistamenu.btnClienteModificar || e.getSource() == vistamenu.lblClienteModificar) {
            
        }
        
        
        //Aqui va todos los if de RECETA
        
        if (e.getSource() == vistamenu.btnRecetaGuardar || e.getSource() == vistamenu.lblRecetaGuardar) {
            
        }
        if (e.getSource() == vistamenu.btnRecetaEliminar || e.getSource() == vistamenu.lblRecetaEliminar) {
            
        }
        if (e.getSource() == vistamenu.btnRecetaModificar || e.getSource() == vistamenu.lblRecetaModificar) {
            
        }
        
        //Aqui va todos los if de ORDEN COMPRAS
        
        if (e.getSource() == vistamenu.btnOrdenGuardar || e.getSource() == vistamenu.lblOrdenGuardar) {
            
        }
        if (e.getSource() == vistamenu.btnOrdenEliminar || e.getSource() == vistamenu.lblOrdenEliminar) {
            
        }
        if (e.getSource() == vistamenu.btnOrdenModificar || e.getSource() == vistamenu.lblOrdenModificar) {
            
        }
        
        //Aqui va todos los if de PRODUCTO
        if (e.getSource() == vistamenu.btnProductoGuardar || e.getSource()==vistamenu.lblProductoGuardar) {
            
        }
        if (e.getSource() == vistamenu.btnProductoEliminar || e.getSource() == vistamenu.lblProductoEliminar) {
            
        }
        if (e.getSource() == vistamenu.btnProductoModificar || e.getSource() == vistamenu.lblProductoModificar) {
            
        }
        
        //Aqui va todos los if de PLATO
        if (e.getSource() == vistamenu.btnPlatoGuardar || e.getSource() == vistamenu.lblPlatoGuardar) {
            
        }
        if (e.getSource() == vistamenu.btnPlatoEliminar || e.getSource() == vistamenu.lblPlatoEliminar) {
            
        }
        if (e.getSource() == vistamenu.btnPlatoModificar || e.getSource() == vistamenu.lblPlatoModificar) {
            
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
