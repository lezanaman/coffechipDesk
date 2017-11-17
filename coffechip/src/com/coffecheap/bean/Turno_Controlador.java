package com.coffecheap.bean;

import com.coffecheap.dao.TurnoDao;
import com.coffecheap.modelo.Turno;
import com.coffecheap.vista.frmTurnoGuardar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Turno_Controlador implements ActionListener {

    frmTurnoGuardar vistaturno = new frmTurnoGuardar();
    TurnoDao turnodao = new TurnoDao();
    Turno turno = new Turno();

    public Turno_Controlador(frmTurnoGuardar vistaturno, TurnoDao turnodao) {
        this.vistaturno = vistaturno;
        this.turnodao = turnodao;
        this.vistaturno.btnGuardar.addActionListener(this);
        this.vistaturno.btnGuardar.setActionCommand("Guardar");
    }

    public void Guardar() {

        try {
            this.turno.setHorario_turno(this.vistaturno.txtHorario.getText());
            this.turno.setObservaciones(this.vistaturno.txtObservaciones.getText());

            String respuesta = turnodao.Ingresar(turno);
            if (respuesta != null) {
                System.out.println(respuesta);
            } else {
                System.out.println(respuesta);
            }
        } catch (Exception e) {
            try {
                throw e;
            } catch (Exception ex) {
                Logger.getLogger(Turno_Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String evento = e.getActionCommand();

        if (evento.equals("Guardar")) {
            System.out.println("1");
            Guardar();
            System.out.println("2");
        }
    }

}
