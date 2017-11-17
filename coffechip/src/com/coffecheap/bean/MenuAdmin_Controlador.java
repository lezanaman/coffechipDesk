package com.coffecheap.bean;

import com.coffecheap.dao.TurnoDao;
import com.coffecheap.vista.MenuAdmin;
import com.coffecheap.vista.frmTurnoGuardar;
import com.coffecheap.vista.frmTurnoEliminar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAdmin_Controlador implements ActionListener {

    MenuAdmin vistamenu = new MenuAdmin();

    public MenuAdmin_Controlador(MenuAdmin menu) {
        this.vistamenu = menu;
        this.vistamenu.btnUsuario.addActionListener(this);
        this.vistamenu.btnUsuario.setActionCommand("Usuario");
        this.vistamenu.btnGuardarUsuario.addActionListener(this);
        this.vistamenu.btnGuardarUsuario.setActionCommand("GuardarUsuario");
        this.vistamenu.btnEliminarUsuario.addActionListener(this);
        this.vistamenu.btnEliminarUsuario.setActionCommand("EliminarUsuario");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String evento = e.getActionCommand();

        if (evento.equals("Usuario")) {
            if (this.vistamenu.panUsuario.requestFocusInWindow() == false) {
                this.vistamenu.panUsuario.setVisible(true);
                this.vistamenu.panUsuario.setLocation(250, 91);
            } else {
                this.vistamenu.panUsuario.setVisible(false);
            }
        }

        if (evento.equals("GuardarUsuario")) {
            TurnoDao dao = new TurnoDao();
            frmTurnoGuardar vistaturno = new frmTurnoGuardar();
            Turno_Controlador controlador = new Turno_Controlador(vistaturno, dao);
            new CambiaPanel(this.vistamenu.panDatos, vistaturno);
            this.vistamenu.panUsuario.setVisible(false);
        }
        if (evento.equals("EliminarUsuario")) {
            TurnoDao dao = new TurnoDao();
            frmTurnoGuardar vistaturno = new frmTurnoGuardar();
            Turno_Controlador controlador = new Turno_Controlador(vistaturno, dao);
            new CambiaPanel(this.vistamenu.panDatos, vistaturno);
            this.vistamenu.panUsuario.setVisible(false);
        }

    }

}
