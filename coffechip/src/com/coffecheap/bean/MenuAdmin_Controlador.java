package com.coffecheap.bean;

import com.coffecheap.dao.TurnoDao;
import com.coffecheap.vista.MenuAdmin;
import com.coffecheap.vista.MenuAdminDos;
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
    MenuAdminDos vistamenu = new MenuAdminDos();

    /*public MenuAdmin_Controlador(MenuAdmin menu) {
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

        


    }*/

    void setColor(JPanel panel) {
        panel.setBackground(new Color(66, 83, 111));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(37, 47, 65));
    }

    /*public void actionPerformed(ActionEvent e) {
        String evento = e.getActionCommand();

        if (evento.equals("GuardarTurno")) {
            TurnoDao dao = new TurnoDao();
            frmTurnoGuardar vistaturno = new frmTurnoGuardar();
            frmTurnoEliminar vistaturnodos = new frmTurnoEliminar();
            frmTurnoModificar vistamodi = new frmTurnoModificar();
            Turno_Controlador controlador = new Turno_Controlador(vistaturno, vistaturnodos, vistamodi, dao);
            new CambiaPanel(this.vistamenu.panDatos, vistaturno);
        }
        
        if (evento.equals("EliminarTurno")) {
            TurnoDao dao = new TurnoDao();
            frmTurnoGuardar vistaturno = new frmTurnoGuardar();
            frmTurnoEliminar vistaturnodos = new frmTurnoEliminar();
            frmTurnoModificar vistamodi = new frmTurnoModificar();
            Turno_Controlador controlador = new Turno_Controlador(vistaturno, vistaturnodos, vistamodi, dao);
            controlador.MostrarD();
            new CambiaPanel(this.vistamenu.panDatos, vistaturnodos);
        }

        if (evento.equals("ModificarTurno")) {
            TurnoDao dao = new TurnoDao();
            frmTurnoGuardar vistaturno = new frmTurnoGuardar();
            frmTurnoEliminar vistaturnodos = new frmTurnoEliminar();
            frmTurnoModificar vistamodi = new frmTurnoModificar();
            Turno_Controlador controlador = new Turno_Controlador(vistaturno, vistaturnodos, vistamodi, dao);
            controlador.MostrarDM();
            new CambiaPanel(this.vistamenu.panDatos, vistamodi);
        }
        
        
    }*/
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("kjdsfklajskladñf");
        //Component hola = e.getComponent().;        
        if (e.getSource().equals(vistamenu.btnCompra.getUIClassID())) {
            System.out.println("viendo esos datos en el if");
        }
        
        /*if () {
            System.out.println("hola a todos");
        } */       
    }

    @Override
    public void mousePressed(MouseEvent e) {

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
