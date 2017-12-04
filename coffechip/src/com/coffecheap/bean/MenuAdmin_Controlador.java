package com.coffecheap.bean;

import com.coffecheap.dao.TurnoDao;
import com.coffecheap.vista.MenuAdmin;
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
        vistamenu.btnCompraGuardar.addMouseListener(this);
        vistamenu.lblCompraGuardar.addMouseListener(this);
        vistamenu.btnCompraEliminar.addMouseListener(this);
        vistamenu.lblCompraEliminar.addMouseListener(this);
        vistamenu.btnCompraModificar.addMouseListener(this);
        vistamenu.lblCompraModificar.addMouseListener(this);

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
    void setColor(JPanel panel) {
        panel.setBackground(new Color(66, 83, 111));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(37, 47, 65));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        

        //System.out.println("viendo datos: " + e.getSource());
        //Component hola = e.getComponent().;        
        /*if () {
            System.out.println("hola a todos");
        } */
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == vistamenu.btnCompraGuardar || e.getSource() == vistamenu.lblCompraGuardar) {
            resetColor(vistamenu.btnCompraEliminar);
            setColor(vistamenu.btnCompraGuardar);
            resetColor(vistamenu.btnCompraModificar);
            System.out.println("uno");

            TurnoDao dao = new TurnoDao();
            frmTurnoGuardar vistaturno = new frmTurnoGuardar();
            frmTurnoEliminar vistaturnodos = new frmTurnoEliminar();
            frmTurnoModificar vistamodi = new frmTurnoModificar();
            Turno_Controlador controlador = new Turno_Controlador(vistaturno, vistaturnodos, vistamodi, dao);
            new CambiaPanel(this.vistamenu.panDatos, vistaturno);
        }
        if (e.getSource() == vistamenu.btnCompraEliminar || e.getSource() == vistamenu.lblCompraEliminar) {
            setColor(vistamenu.btnCompraEliminar);
            resetColor(vistamenu.btnCompraGuardar);
            resetColor(vistamenu.btnCompraModificar);
            
            TurnoDao dao = new TurnoDao();
            frmTurnoGuardar vistaturno = new frmTurnoGuardar();
            frmTurnoEliminar vistaturnodos = new frmTurnoEliminar();
            frmTurnoModificar vistamodi = new frmTurnoModificar();
            Turno_Controlador controlador = new Turno_Controlador(vistaturno, vistaturnodos, vistamodi, dao);
            controlador.MostrarD();
            new CambiaPanel(this.vistamenu.panDatos, vistaturnodos);
        }
        if (e.getSource() == vistamenu.btnCompraModificar || e.getSource() == vistamenu.lblCompraModificar) {
            resetColor(vistamenu.btnCompraEliminar);
            resetColor(vistamenu.btnCompraGuardar);
            setColor(vistamenu.btnCompraModificar);
            
            TurnoDao dao = new TurnoDao();
            frmTurnoGuardar vistaturno = new frmTurnoGuardar();
            frmTurnoEliminar vistaturnodos = new frmTurnoEliminar();
            frmTurnoModificar vistamodi = new frmTurnoModificar();
            Turno_Controlador controlador = new Turno_Controlador(vistaturno, vistaturnodos, vistamodi, dao);
            controlador.MostrarDM();
            new CambiaPanel(this.vistamenu.panDatos, vistamodi);
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
